/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classifieds.org;

import com.classifieds.org.DBHelp;
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
 *
 * @author rana
 */
public class addNews extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        try{
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
            out.println("<title>AddNews Servlet</title>");
            out.println("</head>");
            out.println("<body>");
//            
//            int count = 0;
//            DBHelp db = new DBHelp();
//            ResultSet rst = db.getSt().executeQuery("select count(*) from tblnews");
//
//            while (rst.next()) {
//                count = rst.getInt(1);
//
//            }
//            
//            String news = request.getParameter("formAddNews");
//
//            PreparedStatement preState = db.getCon().prepareStatement("INSERT INTO classifieds.tblnews(NID, NEWS)VALUES (?, ?)");
//            preState.setInt(1, count + 1);
//            preState.setString(2, news);
//            boolean i = preState.execute();
//            System.out.println(count + "" + i);
//
//            out.println("Servlet Running");
//            if (i) {
//                out.println("News Added SuccessFully.");
//                
//            } else {
//                out.println("Error occured,News Add Failed.");
//            }
            int countRows = 0;
             DBHelp help = new DBHelp();
            ResultSet rst = help.getSt().executeQuery("SELECT count(*) FROM tblnews");
            while (rst.next()) {
                countRows = rst.getInt(1);

            }

            if (!request.getParameter("news").isEmpty()) {

                PreparedStatement preState = help.getCon().prepareStatement("INSERT INTO tblnews VALUES(?,?)");

                preState.setInt(1, countRows + 1);
                preState.setString(2, request.getParameter("news"));
                preState.execute();
                out.println("<h2>News Added Successfully. <br>To add more News </h2>");
                out.println("<h2><a href='./addNews.jsp'>Click Here</a></h2>");
                
                
                
            } else 
            {
                out.println("Text Field can't be Empty.<br>");
               // out.println("<button><a href=\".//addCategory.jsp\" >Retry</a></button>");
            out.println("Re-try Again <a href=\"./addNews.jsp\">Click here</a>");
            }

            out.println("</body>");
            out.println("</html>");
        } catch (SQLException ex) {
            Logger.getLogger(addNews.class.getName()).log(Level.SEVERE, null, ex);
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
