<%@page import="java.sql.*"%>
<%@page import="com.classifieds.org.DBHelp"%>
<%--<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>--%>
<%-- 
    Document   : registerMaster
    Created on : Jul 24, 2014, 3:54:44 PM
    Author     : rana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Page</title>
    </head>
    <body>
        <!--<h1>Hello World!</h1>-->

        <h1>  Register Here. </h1>
        <br><h2>All fields are mandatory</h2>
        <br>
        <form action="./addUserSlave.jsp" method="get" >

            Email:<input type="text" id="email" name="email"/><br>
            <!--            Password:<input type="password" id="password" name="password"/><br>-->
            Ad Title for Your Business :<input type="text" id="bname" name="bname">


            <select name="category" id="category">
                <%  
                    
                    DBHelp db = new DBHelp();
                    ResultSet rst = db.getSt().executeQuery("SELECT * FROM tblcats");
                    while (rst.next()) {
                    out.println("<option value=" + rst.getInt(1) + ">" + rst.getString(2) + "</option>");
                    }
                    
                %>
                
                
            </select><br>
            
            <input type="submit" id="sub" name="sub"/>
            

        </form>







    </body>
</html>
