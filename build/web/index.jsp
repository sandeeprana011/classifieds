<%-- 
    Document   : index
    Created on : 24 Jul, 2014, 12:42:40 PM
    Author     : nilu
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="Business%20Events_files/style.css" rel="stylesheet" type="text/css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Business Classifieds : Foods,Technology,Softwares....</title>
    </head>
    <body style="background-image: url('Busiess%20Events_files/blank.gifn')"> 
        <div>
            <form style="padding-right: -15%;" action="./search" method="get">
                <input type="text" name="search" id="search" />
                <input type="submit" name="sub" id="sub" value="Search"/>
            </form>

        </div>
        <div id="headerPan">
            <div id="headerleftPan"><img src="Busiess%20Events_files/blank.gifn" alt="" height="1" width="1"></div>
            <div id="headermiddlePan">
                <div id="menuPan">
                    <ul>
                        <li class="home">Home</li>
                        <li><a href="AboutUs.jsp">About Us</a></li>
                        <li><a href="Services.jsp">Services</a></li>
                        <li><a href="./blogs">Blogs</a></li>
                        <li class="contact"><a href="Contact.jsp" class="contact">Contact</a></li>
                        <li class="contact"><a href="./addUserMaster.jsp" class="contact">Post Advertisement</a></li>



                    </ul>
                </div>
                <div id="headerbodyPan">
                    <img src="Business Events_files/header.jpg"/><br>




                </div>
            </div>

        </div>

        <div id="bodyPan">
            <h2>latest updates</h2>
            <p class="date">About Us</p>
            <p>This web site allows users to browse through several categories of services and their providers</p>
            <p class="more"><a href="AboutUs.jsp">....know more</a></p>
            <p class="border"><img src="Business%20Events_files/blank.gif" alt="" height="1" width="1"></p>
            <p class="date">Current Events</p>

            <marquee direction="up" onmouseover="stop()" onmouseout="start()">
                <%
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/classifieds", "root", "");
                    Statement st = conn.createStatement();
                    ResultSet rs = st.executeQuery("select * from classifieds.tblnews");
                    out.println("<div>");
                    int i = 0;
                    while (rs.next()) {
                        i++;
                        String h = rs.getString(2);
                        out.println("<a href=npage.jsp?name=" + i + ">" + h + "</a><br>");

                    }

                    out.println("</div>");
                %> 



            </marquee>
            <p class="more"><a href="#">....know more</a></p>
        </div>
        <div id="bodybottomPan">
            <div id="bottomleftPan">
                <h2>Services <br>
                    <span>Categories</span></h2>
                <ul>
                    <li><a href="#">We provide the users to browse</a></li>
                    <li><a href="#">through several categories of</a></li>
                    <li><a href="#">services like Education,Tours and Travel</a></li>
                    <li><a href="#"></a></li>
                </ul>
                <p class="more"><a href="#">want to know more solutions</a></p>
            </div>

            <div id="bottomrightPan">
                <h2>Services <br>
                    <span>Categories</span></h2>
                <ul>
                    <li><a href="#">Information& Technology</a></li>
                    <li><a href="#">Infrastructure,Food</a></li>
                    <li><a href="#">Autmobiles and</a></li>
                    <li><a href="#">Lifestyle</a></li>
                </ul>
                <p class="more"><a href="#">want to know more solutions</a></p>
            </div>
        </div>

        <div id="footermainPan">
            <div id="footerPan">

                <center>
                    <p class="copyright">©Nilakshi. All right reserved.</p>
                </center>

                </body>
                </html>
