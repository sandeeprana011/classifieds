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
public class blogs extends HttpServlet {

    int count;
    Object[][] objBlogs;

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>"
                    //           + "<link rel=\"stylesheet\" href=\"css/default.css\">"
                    + "");
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

            out.println("<title>Servlet blogs</title>");
            out.println("</head>");
            out.println("<body><a href=\"addNewBlog.jsp\" >Add a new Blog</a>");

            try {

                response.setContentType("text/html;charset=UTF-8");
                DBHelp db = new DBHelp();
                ResultSet rst = db.getSt().executeQuery("select count(*) from tblblogs");
                while (rst.next()) {
                    count = rst.getInt(1);
                    System.out.println(count);

                }

                objBlogs = new Object[count + 1][4];
                rst = db.getSt().executeQuery("select * from tblblogs");
                int i = 0;
                while (rst.next()) {
                    objBlogs[i][0] = rst.getInt(1);
                    objBlogs[i][1] = rst.getString(2);
                    objBlogs[i][2] = rst.getString(3);
                    objBlogs[i][3] = rst.getString(4);
                    i++;
                    System.out.println(objBlogs[i - 1][0] + "" + objBlogs[i - 1][1] + "" + objBlogs[i - 1][2] + "" + objBlogs[i - 1][3]);
                }
                out.println("<img src=\"images/blogsBanner.jpg\" height=\"170\" width=\"800\">");
                for (int k = 0; k < objBlogs.length; k++) {
//                    System.out.println("inside div" + objBlogs[k][1]);

                    out.print("<hr/><div><br><form action=\"./individualBlog\" method=\"post\">"
                            + "Blog-ID:<input type=\"text\" readonly=\"readonly\" value=\"" + objBlogs[k][0].toString() + "\" name=\"blid\" id=\"blid\"/>"
                            + "<h2>" + objBlogs[k][1].toString() + "</h2>"
                            + " by " + objBlogs[k][2].toString()
                            + "<p>" + objBlogs[k][3].toString() + "</p>"
                            + "<input type=\"submit\" value=\"View Comments....\">"
                            + "<br></form></div>");

                }
            } catch (SQLException ex) {
                Logger.getLogger(blogs.class.getName()).log(Level.SEVERE, null, ex);
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
