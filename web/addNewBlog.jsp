<%-- 
    Document   : addNewBlog
    Created on : Jul 25, 2014, 1:26:06 AM
    Author     : rana
--%>

<%@page import="java.util.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <style>
            
             body {
   background: #999;
   background-image: url(images/food.png);
   /*padding: 20px 40px;*/
   padding-left: 20%;
   padding-right: 20%;
   background-attachment: fixed;
   }
            
        </style>
        
        <%!
            public java.util.Date PrintDate() {
                return (new java.util.Date());
            }
        %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add New Blog</title>
    </head>
    <body>
        
        <form name="addNewBlog" action="addNewBlogProcess.jsp">
            <table border="0" width="35%" cellspacing="2" cellpadding="6">
                <tbody>
                   
                    <tr>
                        <td>Blog Title: </td>
                        <td><input type="text" name="blogTitle" id="blogTitle"/></td>
                    </tr>
                    <tr>
                        <td>Your Name Please:</td>
                        <td><input type="text" name="author" id="author" /></td>
                    </tr>
                    
                   
                </tbody>
            </table>

            <input type="submit" value="Submit" name="sub" />
            
            
        </form>
        
        
        
    </body>
</html>
