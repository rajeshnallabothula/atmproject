<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.jsp.Login" %>
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
	width: 620px;
	font-size: 40px;
}

.hi {
	margin-top: 150px;
	margin-left: 340px;
}

.id1 {
	margin-left: 900px;
	background-color: aqua;
	font-size: 30px;
	margin-bottom: 30px;
	border-radius: 30px;
	width: 250px;
	height: 70px;
}

.id2 {
	margin-left: 900px;
	background-color: aqua;
	font-size: 30px;
	border-radius: 30px;
	width: 250px;
	height: 70px;
}

.main {
	margin-top: 30px;
	font-size: 20px;
}

.input {
	width: 300px;
	margin-top: 30px;
	font-size: 40px;
	border-radius: 8px;
}
</style>
</head>
<body style="background-color: blue">
        <div class="main">
        <form action="Login" method="post">
        <center><h1>SBI</h1></center>
        <center><u> <h2 style="background-color: white ">Login</h2></u></center>
        <center>
        <input type="number" class ="input" placeholder="Enter PhoneNumber" name="PhoneNumber" required="required"><br><br>
        <input type="number" class ="input" placeholder="Enter your Pin" name="pin" required="required"><br><br>
        </div>
        <div class="hi" >
       <input type="submit" class="id1"  value="CONTINUE"></input><br><br>
       </form>
       <a href="RegistrationPage.jsp"><button class="id2">CANCEL</button></a>
        </center>
        </div>
</body>
</html>