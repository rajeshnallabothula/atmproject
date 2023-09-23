package com.jsp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/VerifyWithDrawPin")
public class VerifyWithDrawPin extends HttpServlet
{
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 resp.setContentType("text/html");
		  PrintWriter out=resp.getWriter();
		int pin=Integer.parseInt(req.getParameter("pin"));
		
		HttpSession sessionObject=req.getSession();
		sessionObject.setAttribute("pin", pin);
	    AtmDao dao=new AtmDao();
	    System.out.println(pin);
	    if(pin!=0)
	    {
	    	if(dao.verifyPin(pin))
	    	{
	    	
	    	RequestDispatcher dispatcher=req.getRequestDispatcher("WithdrawAmount.jsp");
			dispatcher.forward(req, resp);
	    	}
	    else
	    {
	 	   out.println("<center> <h1 style='color:red;'>ENTER VALID PIN NUMBER...!!</h1></center>");
			RequestDispatcher dispatcher=req.getRequestDispatcher("CashWithdraw.jsp");
			dispatcher.forward(req, resp);
			//System.out.println(phoneNumber);  
	    }
	    }
	}

}
