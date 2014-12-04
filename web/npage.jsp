<%-- 
    Document   : npage
    Created on : Jul 29, 2014, 1:45:29 PM
    Author     : rana
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="com.classifieds.org.DBHelp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        if(request.getQueryString()!=null){
        
            String j=request.getQueryString();
            String k=j.replace("name=", " ").trim();
            
            DBHelp helper=new DBHelp();
            ResultSet rs=helper.getSt().executeQuery("select * from classifieds.tblnews where NID="+k);
            String l="";
            while(rs.next()){
                l=rs.getString(2);
            }
            char t[]=l.toCharArray();
            out.println("<center>");
            
            for(char k1:t){
                out.println("<h1>"+k1+"</h1><br>");
            }
            out.println("</center>");
        }
        
        
        
        %>
    </body>
</html>
