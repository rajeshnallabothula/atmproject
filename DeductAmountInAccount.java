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
@WebServlet("/DeductAmountInAccount")
public class DeductAmountInAccount extends HttpServlet
{
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.setContentType("text/html");
	  PrintWriter out=resp.getWriter();
		double amount=Double.parseDouble(req.getParameter("amount"));
		double amount1=Double.parseDouble(req.getParameter("amount"));
		HttpSession sessionObjectReciver=req.getSession();
		String reciverAccount=(String)sessionObjectReciver.getAttribute("reciverAccount");
		 
		HttpSession sessionObject=req.getSession();
	    String senderAccount=(String)sessionObject.getAttribute("senderAccount1");
		//System.out.println(senderAccount);
		//System.out.println(amount);
	    AtmDao dao=new AtmDao();
	    //System.out.println(reciverAccount);
	   
    	if(dao.addMoneyReciverAccount(reciverAccount, amount))
    	{
    
    	}
    	if(dao.deductSenderAccount(senderAccount, amount))
    	{
    		RequestDispatcher dispatcher=req.getRequestDispatcher("TransforSucces.jsp");
    		dispatcher.forward(req, resp);
    	}

    	else
    	{
    		RequestDispatcher dispatcher=req.getRequestDispatcher("TransforSucces.jsp");
    		dispatcher.forward(req, resp);
    	}
}
}
