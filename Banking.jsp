<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">


body {
	background-image: url("pxfuel.jpg");
	background-position:center;
	background-size: cover;
  }
  h1{
  width: 700px;
  font-size: 80px;
  }


.left {
	width: 350px;
	height: 60px;
	margin-top: 70px;
	margin-left: 8px;
	border-radius: 30px;
 }

button {
	font-size: 15px;
}

.right {
	width: 350px;
	height: 60px;
	margin-top: 60px;
	margin-left: 400px;
	border-radius: 30px;
}

#left {
	float: left;
	width: 50%;
	height: 50%;
}

#right {
	float: left;
	width: 50%;
	height: 90%;
}
</style>
</head>
<body>
	<center>
		<h1>SBI BANK</h1>
	</center>
	<br>
	<div id="left">
		<a href="Atm.jsp"><button class="left">H0ME
			</button></a> <br>
	</div>
	<div id="right">
		<a href="CashWithdraw.jsp"><button class="right">WITHDRAWAL</button></a>
		<br>
		<a href="BalanceEnquiry.jsp"><button class="right">BALANCE INQUIRY</button></a>
		<br>
		<button class="right">TRANSFER</button>
		<br> <br>
		<button class="right">SERVIES</button>
		<br>
	</div>
</body>
</html>