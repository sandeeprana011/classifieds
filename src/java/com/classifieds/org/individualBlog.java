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
 *
 * @author rana
 */
public class individualBlog extends HttpServlet {

    String blid;

    String BLOGS;
    String author;
    String timeBlog;
    int i;

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
                    //+ "<link rel=\"stylesheet\" href=\"css/default.css\">"
                    + "<style>\n"
                    + "   body {\n"
                    + "   background: #999;\n"
                    + "   background-image: url(images/food.png);\n"
                    + "   /*padding: 20px 40px;*/\n"
                    + "   padding-left: 20%;\n"
                    + "   padding-right: 20%;\n"
                    + "   background-attachment: fixed;\n"
                    + "   }\n"
                    + "</style>"
                    + "");
            out.println("<title>Servlet individualBlog</title>");
            out.println("</head>");
            out.println("<body>");

            try {
                blid = request.getParameter("blid");
                System.out.println(blid);
                DBHelp dbh = new DBHelp();

                ResultSet rst = dbh.getSt().executeQuery("select * from tblblogs where BLID='" + blid + "'");
                while (rst.next()) {
                    BLOGS = rst.getString(2);
                    author = rst.getString(3);
                    timeBlog = rst.getString(4);
                }

                out.println("<img src=\"Classifieds-Banner.jpg\" alt=\"\">");
                out.println("<h1>" + BLOGS + "  </h1>"
                        + "<p id=\"author\">by " + author + "</p>");
                out.println("<h4>Time: " + timeBlog + "</h4>");

                rst = dbh.getSt().executeQuery("select * from tblbcomments where BLID='" + blid + "'");
                while (rst.next()) {
                    out.println("<hr/><div><p>" + rst.getString(2) + " </p>by <strong id=\"author\">" + rst.getString(3) + "</strong>" + "</div>");

                }
                out.println("<form action=\"./individualBlog\" method=\"post\">"
                        + "<div>"
                        + "<strong>Add Your Comment....</strong><br>"
                        + "BLOG-ID:<input type=\"text\" name=\"blid\" value=\""+blid+"\" readonly=\"readonly\" /><br>"
                        + "<textarea name=\"comment\" rows=\"10\" cols=\"40\"></textarea><br>"
                        + "Your Name Please:<input type=\"text\" name=\"cname\" value=\"\" /><br>"
                        
                        + "<input type=\"submit\" value=\"Comment\" name=\"sub\" />"
                        + "</div>"
                        + "</form>");
                
                if (!request.getParameter("comment").equals(null)) {
                    DBHelp d=new DBHelp();
                    
                    PreparedStatement preSt = d.getCon().prepareStatement("INSERT INTO classifieds.tblbcomments (BLID, COMMENTS, CNAME) VALUES(?,?,?)");
                    preSt.setInt(1, Integer.parseInt(blid));
                    preSt.setString(2, request.getParameter("comment"));
                 preSt.setString(3, request.getParameter("cname"));
                 preSt.execute();
                }
            } catch (SQLException ex) {
                Logger.getLogger(individualBlog.class.getName()).log(Level.SEVERE, null, ex);
//                out.println(ex);
            }

            out.println("");
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
