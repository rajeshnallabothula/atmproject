<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.jsp.WithdrawAmount" %>
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
     width:300px;
	margin-top: 30px;
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
         <form action="WithdrawAmount" method="post">
        <center><h1>SBI</h1></center>
        <center><h2 style="background-color: white ">ENTER AMOUNT</h2></center>
        <center>
       
        <input type="number" class ="input" name="amount"><br><br>
        
        </div>
        <div class="hi" >
       <input type="submit" class="id1"  value="CONTINUE"><br><br>
       <a href="Atm.jsp"><button class="id2">GO TO HOME</button></a>
        </center>
        </form>
        
        </div>
</body>
</html>