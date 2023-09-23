
<%@page import="org.apache.tomcat.jdbc.pool.interceptor.ResetAbandonedTimer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.jsp.Newpin" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
body {
	background-image: url("pxfuel.jpg");
	background-position: center;
	background-size: cover;
}

h2 {
	width: 700px;
	font-size: 30px;
}

.hi {
	margin-top: 50px;
	margin-left: 340px;
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
	font-size: 30px;
	border-radius: 20px;
}
</style>
</head>
<body style="background-color: blue">
     
        <div class="main">
        <center><h1>SBI</h1></center>
        <center><h2 style="background-color: white ">ENTER NEW PIN</h2></center>
        <center>
         <form action="Newpin" method="post">
        <input type="number" name="newpin" class="input" required="required"  pattern="[0-9]{4}" title="Enter exactly 4 numbers"><br><br>
        <input type="password" name="conform" class="input" required="required"  pattern="[0-9]{4}" title="Enter exactly 4 numbers"><br><br>
        </div>
        <div class="hi" >
     <input type="submit" value="CONTINUE" class="id1"><br><br>
     </form>
       <a href="Atm.jsp"><button class="id2">GO TO HOME</button></a>
        </center>
         </div>
       
      
</body>
</html>





