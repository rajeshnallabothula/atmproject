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
@WebServlet("/ReciverAccountForTransfor")
public class ReciverAccountForTransfor extends HttpServlet
{
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.setContentType("text/html");
	  PrintWriter out=resp.getWriter();
		String reciverAccount=req.getParameter("reciverAccount");
		//double amount=Double.parseDouble(req.getParameter("amount"));
		HttpSession sessionObject1=req.getSession();
		sessionObject1.setAttribute("reciverAccount",reciverAccount);
		HttpSession sessionObject=req.getSession();
	    String senderAccount=(String)sessionObject.getAttribute("senderAccount");
	    AtmDao dao=new AtmDao();
	    if(reciverAccount!=senderAccount)
	    {
	    	
	    	if(dao.VerifyAccountNumber(reciverAccount))
    		{
	    	
	    		
	    		RequestDispatcher dispatcher =req.getRequestDispatcher("EnterTransforAmount.jsp");
    			dispatcher.forward(req, resp);
	    		
    		}
	    	 else
	 		{
	 			out.println("<center> <h1 style='color:red;'>INVALID RECIVERACCOUNT DEATAILS TRY AGAIN...!!</h1></center>");
	 			RequestDispatcher dispatcher=req.getRequestDispatcher("Transfor.jsp");
	 			dispatcher.include(req, resp); 
	 		}
	    }
	    else
	    {
	    out.println("<center> <h1 style='color:red;'>ENTER VALID ACCOUNT NUMBER...!!</h1></center>");
	    out.println("<center> <h1 style='color:red;'>ENTER ACCOUNT NUMBERS ARE SAME...!!</h1></center>");
		RequestDispatcher dispatcher=req.getRequestDispatcher("TransforingAccount.jsp");
		dispatcher.include(req, resp); 
	    }
	   
	    
	   
	   
//    	if(dao.deductSenderAccount(senderAccount, amount))
//    	{
//			RequestDispatcher dispatcher =req.getRequestDispatcher("TransforSucces.jsp");
//			dispatcher.forward(req, resp);
//    	}
//    	if(dao.VerifyReciverAccount(reciverAccount,amount))
//	    {
//    		RequestDispatcher dispatcher =req.getRequestDispatcher("TransforSucces.jsp");
//			dispatcher.forward(req, resp);
//    		
//    	}
	}
}
