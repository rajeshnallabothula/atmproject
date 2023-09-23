<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.jsp.SenderAccountForTransfor" %>
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
	margin-top: 120px;
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
	margin-top: 50px;
	font-size: 30px;
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
         <form action="SenderAccountForTransfor" method="post">
        <center><h1>SBI</h1></center>
        <center><h2 style="background-color: white ">ENTER SENDER ACCOUNT NUMBER</h2></center>
        <center>
        <input type="number" class ="input" name="senderAccount"><br><br>
        </div>
        <div class="hi" >
        <button type="submit" class="id1" >CONTINUE</button><br><br>
        </form>
       <a href="Atm.jsp"><button class="id2">GO TO HOME</button></a>
        </center>
        </div>
</body>
</html>