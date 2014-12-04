<%-- 
    Document   : addNewBlogProcess
    Created on : Jul 25, 2014, 1:53:14 AM
    Author     : rana
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.classifieds.org.DBHelp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%!
            public java.util.Date PrintDate() {
                return (new java.util.Date());
            }
        %>
        
        <%
            int l = 0;
            DBHelp dbhelp = new DBHelp();
            ResultSet rs = dbhelp.getSt().executeQuery("SELECT count(*) from tblblogs");
            PreparedStatement preState = dbhelp.getCon().prepareStatement("INSERT INTO classifieds.tblblogs (BLID, BLOGS, AUTH, LTIME) VALUES (?,?,?,?)");
            while (rs.next()) {
                if (rs.isLast()) {
                    l = rs.getInt(1);
                    dbhelp.setTransport(l);
                }

            }

            preState.setInt(1, dbhelp.getTransport()+1);
            preState.setString(2, request.getParameter("blogTitle"));
            preState.setString(3, request.getParameter("author"));
            preState.setString(4, String.valueOf(PrintDate()));
            preState.execute();
        %>

<%--<%=dbhelp.getTransport()%>--%>
<%--<%=l%>--%>

        <h3>Blog Added Successfully <br>@Time <%=PrintDate()%>.<br>Wanna Check?....<br>Go to <a href="./blogs">Blogs</a> </h3>



    </body>
</html>
