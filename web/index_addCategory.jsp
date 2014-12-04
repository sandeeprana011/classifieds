<%-- 
    Document   : index
    Created on : Jul 21, 2014, 8:41:41 PM
    Author     : rana
--%>

<%--<%@page import="org.apache.tomcat.util.http.Cookies"%>--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
<!--        <style>
            .cyan
            {
            background-color: gainsboro;
            color: deepskyblue;
                
            }
            
            div{
                font-size: medium;
                color: brown;
            }
            
            
        </style>-->
        <link rel="stylesheet" type="text/css" href="default.css">
        <!--<script language="text/css" src="default.css"></script>-->
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!--        <title>Login Page</title>-->
    </head>
    <body class="cyan">
    <center>
        <div >Enter your password and username here : </div>


        <form action="./sendRedirect" method="get">
            <table border="0.3" cellpadding="0">

                <tr>
                    <td>Username : </td>
                    <td><input type="text" name="username" id="username" value="admin"/></td>
                </tr>


                <tr>
                    <td>Password :</td>
                    <td> <input type="password" name="password" id="password" value="admin"/></td>
                </tr>
                <tr>
                    <td colspan="2"><input type="submit" name="submit"/></td>

                </tr>

            </table>
            <%
//            Cookies user_Cook=new Cookies("","");
            
            
            %>



        </form>
    </center>



</body>
</html>
