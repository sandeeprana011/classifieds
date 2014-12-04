<%-- 
    Document   : Services
    Created on : 24 Jul, 2014, 3:52:03 PM
    Author     : nilu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Design by YOURSITENAMEm</title>

<!--<link href="style.css" rel="stylesheet" type="text/css" />-->
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
</head>

<body>
<div id="wrap">
<div id="topbar">
  <div id="menus">
  <ul id="topmenu">
<li  class="active"><a href="index.jsp"style="float: left"">Home</a>
</li>
</ul>
    <img src="services-banner.jpg"/>
<div id="content">
<div id="mainpage">
    <h2>Services!</h2>
<p>We provide a wide range of services.One stop for many.We understand that our customers need an excellent product.So, we allow people to select from many services like Education,Infrastructure,Information and Technology,Finance,Tours and Travel,Automobiles,Lifestyle and Food</a>. You want to know about the retail stores and malls in town we welcome you!You will recieve all the information required by you in this website.  <br />
			  <br />
Catering to your needs we have the premium institutions ,the latest technology trends,fashion,automobiles everything within this.Want to leave the busy city life for a relaxing tour ?We will help you!Giving you the accord of all affordable and premium tourist destinations within your budget. There is a wide range of choices to select from.Each product is available with several price options.We can guide you to choose the best service from many.</p>
</div>
<div id="sidebar">

</div>
<div id="sidebarcontents"> 
<ul id="menu">
<li>
  <h2>Our Services</h2>
</li>
<li>
	<ul><li>Finance</li>
				  			<li>Automobiles</li>
				 
							<li>Lifestyle</li>
							<li>Blogs</li>
							
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
<p>Copyright &copy; 2014| <a href="#">Nilakshi</a></p>
</div>
</body>
</html>

    </body>
</html>
