<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.jsp.RegistrationForm" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
 *{
        margin:0px;
        padding: 0px;
    }
    section{
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
        width: 100%;
       background-image:url("pxfuel.jpg");
       background-position:right;
       background-size:contain;
    }
    .form-box{
      
        position: relative;
        width: 400px;
        height: 200px;
        background: transparent;
        display: flex;
        justify-content: center;
        align-items: center;
       
    }
    h2{
        font-size: 30px;
        color: black;
        text-align: center;
    }
    .inputbox{
        position: relative;
        margin: 30px 0px;
        width: 310px;
        border-bottom: 2px solid white;
    }
    .inputbox label{
        position: absolute;
        top: 50%;
        left: 5px;
        transform: translateY(-50%);
        color: black;
        font-size: 1em;
        pointer-events: none;/
        transition: -5s;
    }
    input:focus ~ label,
    input:valid ~ label{
        top: -5px;
    }
    .inputbox input{
        width: 100%;
        height: 30px;
        background: transparent;
        border: none;
        outline: none;
        font-size:1em;
        padding: 0 35px 0 5px;
        color: black;
    }
    .forget{
        margin: -15px 0 15px;
        font-size: .9em;
        color: navy;
        display: flex;
        justify-content: center;
    }
    .forget label input{
        margin-right: 3px;
    }
    .forget label a{
        color: black;
        text-decoration: none;
    }
    .forget label a:hover{
        text-decoration: underline;
    }
    button{
        width: 100%;
        height: 40px;
        border-radius: 40px;
        background: white;
        border: none;
        outline: none;
        cursor: pointer;
        font-size: 1em;
        font-weight: 600;
    }
    .register{
        font-size: .9em;
        color: navy;
        text-align: center;
        margin: 25px 0 10px;
    }
    .register p a{
        text-decoration: none;
        color: red;
        font-weight: 600;
    }
    .register p a:hover{
        text-decoration: underline;
    }
    h3{
   position: absolute;
   bottom: 440px;
   left:580px;
     }
     .form-value{
    background-color:buttonface;
    margin-right: 300px;
    margin-bottom: 100px;
     }
   .inputbox  label{
     color: navy;
     }
</style>
</head>
<body>
<section>
        <div class="form-box">
             <div class="form-value">
                <form action="RegistrationForm" method="post">
                    <h2>Registration Form</h2>
                    <div class="inputbox">
                        <input type="text" name=accountHoldername required="required" >
                        <label for=""> AccountHolderName</label>
                    </div>
                    <div class="inputbox">
                        <input type="number" name="AccountNumber" required="required"  pattern="[0-9]{11}" title="Enter exactly 11 numbers">
                        <label for="">AccountNumber</label>
                    </div>
                    <div class="inputbox">
                        <input type="number" name="pin" required="required"  pattern="[0-9]{4}" title="Enter exactly 4 digits">
                        <label for="">pin</label>
                    </div>
                   
                     <div class="inputbox">
                        <input type="number" name="phonenumber" required="required"  pattern="[0-9]{10}" title="Your mobile number must contain 10 digits">
                        <label for="">PhoneNumber</label>
                    </div>
                    <div class="forget">
                        <label for=""><input type="checkbox" required="required"> term&conditions </label>
                        
                    </div>
                    <button>Register</button>
                    <div class="register">
                        <p>I have a account <a href="LoginPage.jsp">Login</a></p>
                    </div>
                     </form>
             </div>
        </div>
    </section>
        		
</body>
</html>