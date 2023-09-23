<%@page import="java.sql.ResultSet"%>
<%@page import="org.apache.tomcat.jdbc.pool.interceptor.ResetAbandonedTimer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.jsp.SetPinServlet" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.hi {
	margin-top: 70px;
	margin-left: 340px;
}
h2{
width: 500px;
}

.id1 { 
	margin-left: 900px;
	background-color: aqua;
	font-size: 30px;
	margin-bottom: 30px;
	border-radius: 15px;
	width: 250px;
	height: 70px;
}

.id2 {
	margin-left: 900px;
	background-color: aqua;
	font-size: 30px;
	border-radius: 15px;
	width: 250px;
	height: 70px;
}

.main {
	margin-top: 50px;
	font-size: 30px;
}

 .input {
	margin-top: 30px;
	font-size: 40px;
}
body {
	background-image: url("pxfuel.jpg");
	background-position: center;
	background-size: cover;
}
</style>
</head>
<body >
        <div class="main">
        <center><h1>SBI</h1></center>
        <center><h2 style="background-color: white ">ENTER PIN</h2></center>
        <center>
        <form action="VerifyWithDrawPin" method="post">
        <input type="number" placeholder="enter pin" name="pin" class ="input"><br><br>
        </form>
        </div>
        <div class="hi" >
     <input type="submit" value="GENERATE" class="id1"><br><br>
       <a href="Atm.jsp"><button class="id2">GO TO HOME</button></a>
        </center>
        </div>
        
        
        

</body>
</html>