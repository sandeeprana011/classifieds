/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.classifieds.org;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author rana
 */
public class sersearchView_Detail_Master_Slave extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println(""
//                    + "<link rel=\"stylesheet\" href=\"css/default.css\">"
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
                    + "</style>"
            );
            out.println("<title>Servlet sersearchView_Detail_Master_Slave</title>");            
            out.println("</head>");
            out.println("<body>");
            
            try{
            DBHelp db = new DBHelp();
            ResultSet rst = db.getSt().executeQuery("select * from tblbmaster where BID='" + request.getParameter("bid") + "'");
            while (rst.next()) {
                out.println("<h1>" + rst.getString(2) + ":</h1><br>"
                        + "<p>" + rst.getString(4) + "</p><br>"
                        
                );
            }
                rst=db.getSt().executeQuery("select * from tblbslave where BID='"+request.getParameter("bid")+"'");
                while (rst.next()){
                            out.println(""
                        + "<table border=\"0\" cellspacing=\"2\" cellpadding=\"1\" width=\"35%\">"
                        + "<tr>"
                                    + "<td>Mobile :</td><td>"+rst.getString("BMOBILE")+"</td>"
                        + "</tr><tr>"
                                    + "<td>Phone No :</td><td>"+rst.getString("BPHONE")+"</td>"
                        + "</tr><tr>"
                                    + "<td>E-mail :</td><td>"+rst.getString("BEMAIL")+"</td>"
                        + "</tr><tr>"
                                    + "<td>Address :</td><td>"+rst.getString(3)+"</td>"
                        + "</tr><tr>"
                                    + "<td>City :</td><td>"+rst.getString("BCITY")+"</td>"
                        + "</tr><tr>"
                                    + "<td>State :</td><td>"+rst.getString("BSTATE")+"</td>"
                        + "</tr><tr>"
                                    + "<td>Country :</td><td>"+rst.getString("BCOUNTRY")+"</td>"
                        + "</tr><tr>"
                                    + "<td>Website :</td><td><a href='http://"+rst.getString("BWEBSITE")+"'>"+rst.getString("BWEBSITE")+"</a></td>"
                        + "</tr>"
                        + "</table>"
                );

            } } catch (SQLException ex) {
            Logger.getLogger(sersearchView_Detail_Master_Slave.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
            out.println("</body>");
            out.println("</html>");
       
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
