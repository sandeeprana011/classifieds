/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.classifieds.org;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author rana
 */
public class search extends HttpServlet {

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
         try{  
            String query="select * from tblbmaster";
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Search Advertisements</title>");            
            out.println("</head>"
                    + ""
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
                    + " h2,h3{\n" +
"                color: olive;\n" +
"            }"
                   
                    + " h1{\n" +
"                color: #1E8FC8;\n" +
"                \n" +
"            }" +
"            div{" +
"                background-image: url(19hanuman1.jpg);\n" +
"            }"
                    + ""
                    + ""
                    + "</style>"
            );
            
            out.println("<body>");
            String search=request.getParameter("search");
            out.println("<h1>Search Results for :'"+request.getParameter("search")+"' are....</h1><br>");
            DBHelp dbh=new DBHelp();
            int g=0;
            ResultSet rst=dbh.getSt().executeQuery(query);
             while (rst.next()) {
                 g++;
                 int i=rst.getString(4).toUpperCase().indexOf(search.toUpperCase());
                 if(i>=0){
                    
                     out.println("<hr>"
                             + "<form action=\"./sersearchView_Detail_Master_Slave\" method=\"post\">"
                             + "ID:<input type=\"text\" value=\""+rst.getInt("bid")+"\"readonly=\"readonly\" name=\"bid\"><br>"
                             + "<h2>"+rst.getString(2)+"</h2>"
                             + "<h3>"+rst.getString(4)+"</h3>"
                             + "<input type=\"submit\" name=\"sub\" id=\"sub\"/>"
                             + "</form><br>");
                 }
             }
             if(g==0){
                 out.println("<h3>Sorry,No search Result Found for \""+request.getParameter(search)+"\"</h3>");
             }
            
            
            
            out.println("</body>");
            out.println("</html>");
            
         }catch(Exception e){
             
         }
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
