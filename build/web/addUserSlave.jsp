<%-- 
    Document   : addUserSlave
    Created on : Jul 24, 2014, 4:52:00 PM
    Author     : rana
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="com.classifieds.org.DBHelp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="default.css">
        <style>


        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ADD SLAVE</title>
    </head>
    <body>
    <center>
        <h3>Enter some Details about your Business....</h3>
    </center>
    <!--<h1>Hello World!</h1>-->


    <form action="./ad_Final" id="addUser" name="addUser">
        <table border="0" cellspacing="2" cellpadding="2" width="50%">
            <tbody>
                <tr>
                    <td>Ad. Title :</td>
                    <td><input type="text" readonly="readonly" id="bname" name="bname" value="<%=request.getParameter("bname")%>"></td>

                </tr>
                <tr>
                    <td>Auto Generated CAT-ID :</td>
                    <td><input type="text" readonly="readonly" value="<%=request.getParameter("category")%>" name="catid" id="catid"/></td>
                </tr>
                <tr>
                    <td>Description about your business :</td>
                    <td><input type="text" name="description" id="description"/></td>
                </tr>
                 <tr>
                    <td>Website :</td>
                    <td><input type="text" id="website" name="website"/></td>
                </tr>
                <tr>
                    <td>E-mail:</td> 
                    <td><input type="text" readonly="readonly" id="email" name="email" value="<%=request.getParameter("email")%>"></td>

                </tr>
                <tr>
                    <td>Mobile :</td>
                    <td><input type="text" id="mobile" name="mobile"/></td>
                </tr> 
                <tr>
                    <td>Phone Number :</td>
                    <td><input type="text" id="phone" name="phone"/></td>
                </tr>
                <tr>
                    <td>Address :</td>
                    <td><input type="text" id="address" name="address"/></td>
                </tr>
                <tr>
                    <td>City :</td>
                    <td><input type="text" id="city" name="city"/></td>
                </tr>

                <tr>
                    <td>State :</td>
                    <td><input type="text" id="state" name="state"></td>
                </tr>
                <tr>
                    <td>Country :</td>
                    <td><input type="text" id="country" name="country"></td>
                </tr>

                <tr>
                    <td>Pin Code:</td>
                    <td><input type="text" id="pincode" name="pincode"></td>
                </tr>
            </tbody>
        </table>
        <input type="submit" id="sub" name="sub" value="Submit"/>


    </form>

</body>
</html>
