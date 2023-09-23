package com.jsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/Deposit")
public class Deposit extends HttpServlet
{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
{
	String AccountNumber=req.getParameter("AccountNumber");
	double amount=Double.parseDouble(req.getParameter("amount")) ;
	 resp.setContentType("text/html");
	  PrintWriter out=resp.getWriter();
	  HttpSession sessionObject=req.getSession();
	  sessionObject.setAttribute("AccountNumber", AccountNumber);
       AtmDao dao=new AtmDao();
       TransactionDao tdao=new TransactionDao();
      
   //System.out.println(senderAccount);
   if(AccountNumber!=null)
   {
   	if(dao.VerifyAccountNumber(AccountNumber))
   	{
   		if(dao.deposit(AccountNumber, amount))
   	  	{
   			tdao.deposit_Statement(AccountNumber, amount);
   	  		RequestDispatcher dispatcher=req.getRequestDispatcher("DepositSucces.jsp");
   	  		dispatcher.forward(req, resp);	
   	  	}
   	}
   	else
   	{
 	   out.println("<center> <h1 style='color:red;'>INVALID CREDENTIAL...!!</h1></center>");
 		RequestDispatcher dispatcher=req.getRequestDispatcher("Deposit.jsp");
 		dispatcher.include(req, resp); 
   	}
   	
   }
   else
   {
	   out.println("<center> <h1 style='color:red;'>ENTER VALID ACCOUNT NUMBER AND VALID AMOUNT...!!</h1></center>");
		RequestDispatcher dispatcher=req.getRequestDispatcher("Deposit.jsp");
		dispatcher.include(req, resp); 
    }
   
	
}
}
