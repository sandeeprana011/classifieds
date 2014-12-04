/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classifieds.org;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *This Servlet adds data and redirects user back towards home(index.jsp)
 * @author rana
 */
public class ad_Final extends HttpServlet {

    int bsid;
    int catid;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        try {
            
              DBHelp dbh=new DBHelp();
        ResultSet r=dbh.getSt().executeQuery("SELECT * FROM tblbmaster");
        while(r.next()){
            if(r.isLast()){
            int bid=(r.getInt(1)+1);
            dbh.setBid(bid);
            }
        }
        
        catid=Integer.parseInt(request.getParameter("catid"));
        
            
            
            DBHelp d = new DBHelp();
            ResultSet res = d.getSt().executeQuery("SELECT count(*) FROM tblbslave");
            while (res.next()) {
                bsid = res.getInt(1) + 1;
//                System.out.println("d object ran");
            }
            DBHelp db = new DBHelp();
            PreparedStatement preStatementTableMaster = db.getCon().prepareStatement("INSERT INTO classifieds.tblbmaster (BID, BNAME, CATID,BDESCRIPTION) \n" +
"	VALUES (?, ?, ?,?)");
            preStatementTableMaster.setInt(1, dbh.getBid());
            
                       
            preStatementTableMaster.setString(2, request.getParameter("bname"));
            preStatementTableMaster.setInt(3, catid);
            preStatementTableMaster.setString(4, request.getParameter("description"));
            preStatementTableMaster.execute();
            
            
            PreparedStatement preStatementTableSlave = db.getCon().prepareStatement("INSERT INTO classifieds.tblbslave (BSID, BID, BADD, BCITY, BSTATE, BCOUNTRY, BPINCODE, BMOBILE, BPHONE, BEMAIL) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            preStatementTableSlave.setInt(1, bsid);
            preStatementTableSlave.setInt(2, dbh.getBid());
            preStatementTableSlave.setString(3, request.getParameter("address"));
            preStatementTableSlave.setString(4, request.getParameter("city"));
            preStatementTableSlave.setString(5, request.getParameter("state"));
            preStatementTableSlave.setString(6, request.getParameter("country"));
            preStatementTableSlave.setString(7, request.getParameter("pincode"));
            preStatementTableSlave.setString(8, request.getParameter("mobile"));
            preStatementTableSlave.setString(9, request.getParameter("phone"));
            preStatementTableSlave.setString(10, request.getParameter("email"));
            preStatementTableSlave.setString(11, request.getParameter("website"));
            boolean slaveStatus = preStatementTableSlave.execute();
            
//                System.out.println("db slave object ran"+"Slave status"+slaveStatus);

            try (PrintWriter out = response.getWriter()) {
                /* TODO output your page here. You may use following sample code. */
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>"
                        + "<style>\n"
                    + "   body {\n"
                    + "   background: #999;\n"
                    + "   background-image: url(images/food.png);\n"
                    + "   /*padding: 20px 40px;*/\n"
                    + "   padding-left: 20%;\n"
                    + "   padding-right: 20%;\n"
                    + "   background-attachment: fixed;\n"
                    + "   }\n"
                    + "hr{\n"
                    + " color: crimson;\n"
                    + " \n"
                    + "}"
                    + "\n"
                    + "#author{\n"
                    + "    text-align: right;\n"
                    + "}"
                    + "</style>");
                out.println("<title>Advertisement Submission Finalization.</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h3>Records updated successfully.</h3>");
                
                out.println("<p>You are being Redirected to Blogs Page.<br>If you are not Redirected Automatically.</p><a href=\"./blogs\">Click Here</a>");
                response.sendRedirect("index.jsp");
                
                out.println("</body>");
                out.println("</html>");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ad_Final.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
