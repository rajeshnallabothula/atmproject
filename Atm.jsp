<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
h1 {
	color:
   }

body {
	background-image: url("pxfuel.jpg");
	background-position: right;
	background-size: contain;
  }

h1 {
	font-size: 80px;
	width: 1000px;
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
		<h1>STATE BANK OF INDIA</h1>
	</center>
	<br>
	<div id="left">
		<a href="VerifyMobile.jsp"><button class="left">PIN
				CHANGE</button></a> <br>
		<a href="Deposit.jsp"><button class="left">DEPOSIT</button></a>
		<br>
		<button class="left">MINI-STATEMENT</button>
		<br>
		<button class="left">QUICK CASH</button>
	</div>
	<div id="right">
		<br> <br>
		<a href="Banking.jsp"><button class="right">BANKING</button></a>
		<br>
		<a href="CashWithdraw.jsp"><button class="right">WITHDRAWAL</button></a>
		<br>
		<a href="BalanceEnquiry.jsp"><button class="right">BALANCE INQUIRY</button></a>
		<br>
		<a href="Transfor.jsp"><button class="right">TRANSFER</button>
	</div>
	
</body>
</html>