<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.jsp.VerifyWithDrawPin" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.hi {
	margin-top: 120px;
	margin-left: 340px;
}

.id1 {
	margin-left: 900px;
	background-color: aqua;
	font-size: 30px;
	margin-bottom: 10px;
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
     width:300px;
	margin-top: 10px;
	font-size: 40px;
	border-radius: 8px;
}
body {
	background-image: url("pxfuel.jpg");
	background-position:center;
	background-size: cover;
  }
  h2{
  width: 700px;
  font-size: 40px;
  }

</style>
</head>
<body style="background-color: blue">
        <div class="main">
         <form action="VerifyWithDrawPin" method="post">
        <center><h1>SBI</h1></center>
        <center><h2 style="background-color: white ">ENTER YOUR PIN NUMBER</h2></center>
        <center>
        <input type="password" class ="input" name="pin"><br><br>
        </div>
        <div class="hi" >
        <button type="submit" class="id1" >CREDIT</button><br><br>
       <button type="submit" class="id1" >CURRENT</button><br><br>
       <button class="id2">SAVINGS</button>
        </center>
          </form>
        </div>
</body>
</html>