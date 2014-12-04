<%-- 
    Document   : AboutUs
    Created on : 25 Jul, 2014, 2:00:01 PM
    Author     : nilu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html>
    <head>
<!--        <link href="style.css" rel="stylesheet" type="text/css" />-->
        
        <!--        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>-->
        <title>JSP Page</title>
        <style>
            @charset "utf-8";
* {	
	margin: 0px; padding: 0px;
}
.clear {
	clear:both;}
.clearleft {
	display:block; 
	clear:left;}
.clearright{
	display:block;
	 clear:right;}
.hide {
	display:none;}
a {
	color:#B32C0E;
}

a:hover {
	color:#000000;
	text-decoration:none;
}
body {
	background: #FFFFFF  url(images/bg.jpg) repeat-x;
	}
#wrap{
	width:699px;
	margin:0px auto 15px auto;
	font-family:Verdana, Arial, Helvetica, sans-serif;
	font-size:12px;
	color:#666666;
}

/*Header*/

#header{
	height:242px;
	background:url(images/header.jpg) no-repeat left top;
	clear: both;
}
/*Header Menu*/
#topmenu {
	display:block;
	list-style:none;
	padding:0 0px 0px 278px;
	float: right;
	width: 415px;
}
#topmenu li {
	display:inline;
}
#topmenu a {
	display:block;
	float:left;
	height:28px;
	margin:0px 0px 0px0px;
	text-decoration:none;
	padding:9px 15px 0px 15px;
	text-align:center;
}
#topmenu a, #topmenu a:visited, #topmenu a:active {
	color:#FFFFFF;
}
#topmenu a:hover{
	color:#ffffff;
	background-color: #B52E10;
}
#topmenu .active a, #topmenu .active a:visited, #topmenu .active a:active{
	color:#FFFFFF;
	background-color: #B42D0F;
}

/*Content*/
#content {
	background-color: #FFFFFF;
}
#mainpage {
	width:450px;
	float:left;
	padding:5px 5px 5px 0px;
	height:550px
}
#mainpage p {
	line-height:22px;
	margin:10px 0px 22px 0px;
}
#mainpage blockquote {
	background:#efefef;
	display:block; 
	margin:5px;
	font:Georgia, "Times New Roman", Times, serif; 
	font-style:italic;}
h1, h2, h3, h4, h5 {
	color:#B32C0E;
	font-weight:bold;
	font-family: Arial, Helvetica, sans-serif;
}
#mainpage h1 {
	font-size:24px;
	color: #F2F7F3;
}
#mainpage h2 {
	font-size:18px;
	padding-top: 20px;
	padding-bottom: 5px;
	border-bottom: 1px solid #B52E10;
}
#mainpage h3 {
	font-size:20px;}
#mainpage h4 {
	font-size:18px;}
#mainpage h5 {
	font-size:16px;}
.style_2 {
	font-size: 7px;
	color: #000011;
	}
.style_2 a{
	font-size: 7px;
	color: #000011;
	}
.style_2 a:hover{
	font-size: 7px;
	color: #000011;
	}
#content #mainpage ol {
	margin:10px 10px 10px 25px;}
#content #mainpage ol li {
	padding:5px 5px 5px 20px;}
#content #mainpage ul li {
	display:block; 
	padding:0px; 
	border-bottom: dashed 1px #D6E4A7;}




/*Sidebar*/
#sidebar {
	margin:0px 0px 0px 0px;
	width: 225px;
	float: right;
}
#sidebarcontents {
	padding:5px 0px 5px 0px;
}

/*Sidemenu*/
#menu {
	list-style:none;
}
#menu li ul {list-style:none;}
#menu li ul li {
	display:block; 
	height:25px; 
	border-bottom:solid 1px #efefef;}
#menu li ul a, #menu li ul a:visited, #menu li ul a:active {
	display:block; 
	height:20px; 
	padding:5px 5px 0px 5px; 
	text-decoration:none; 
	color:#333333;}
#menu li ul  a:hover {
	background:#F8F9F2;
	color:#B32C0E;
}
#menu h2 {
	display:block;
	border-bottom:solid 1px #D2E6CA;
	padding:5px;
	margin:10px 0px 0px 0px;
	font-family: Arial, Helvetica, sans-serif;
	font-size:18px;
	color:#B32C0E;
	font-weight:bold;
}

/*footer*/
#footer {
	margin:0 auto;
	width:685px;
	height:75px;
	padding:10px;
	color:#FFFFFF;
	text-align: center;
	background:#333333;
	font-family: Verdana, Arial, Helvetica, sans-serif;
	font-size: 11px;
	clear: both;
}
#credit {font-size:10px; 
	padding:3px;}
#sitename a{
	text-decoration :none;
	font-size:24pxx;
	color:#FFFFFF;
	padding-top:20px;
}
#topbar{
	height:78px;
}
#caption{
	height:50px;
	background:url(images/caption.gif) repeat-x top left;
	}
	.bold{font-size:16px;
	color:#FFFFFF;
	padding-left:100px;
	padding-top:25px;
	}

            
            
            
            
        </style>
<!--      <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">-->

</head>

<body>
<div id="wrap">
<div id="topbar">
  <h1 id="sitename"><a href="http://www.zonnebank-studio-vergelijk.nl" target="_blank">Classifieds</a></h1>
  <div id="menus">
  <ul id="topmenu">
<li  class="active"><a href="index.jsp">Home</a>
</li>
  </ul>
    <img src="about-us-banner1.png"/>
<div id="content">
<div id="mainpage">
<h2>About us</h2>
<p>This website is intended to help people in their needs.There is a wide variety of service providers with their price options.You must be wondering what is the use of such a website?  <br />
			  <br />
  Instead of searching in a variety of websites we offer you the oppurtunity to just browse one and resolve your queries We are here to help and provide the information of all the service providers.We manage to build a relationship between the people and their providers.Our services include Educational institutions,Coaching institutes for Enginnering and Medical entrance and many.You can also choose a financial service provider to help you with your financial needs.</p>
<p>We will provide the best service and quality.</p>    
</div>
<div id="sidebar">

</div>
<div id="sidebarcontents"> 
<ul id="menu">
<li>
    <h2><a href="Services.jsp">Our Services</a></h2>
</li>
<li>
	<ul><li>Education</li>
				  			<li>Information and Technology</li>
				 
							<li>Infrastructure</li>
							<li>Tours and travel</li>
						
			</ul>
</li>
</ul>
</div>

  <div id="sidebarbottom"></div>
</div>
<div class="clear"></div>
</div>

</div>
<div id="footer">
 <p>Copyright &copy; 2014 Sandeep</a></p>  
</div>
</body>
</html>
 