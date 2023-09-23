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
@WebServlet("/WithdrawAmount")
public class WithdrawAmount extends HttpServlet
{
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		double amount=Double.parseDouble(req.getParameter("amount"));
		HttpSession sessionObject=req.getSession();
	     int pin=(Integer)sessionObject.getAttribute("pin");
	     resp.setContentType("text/html");
		  PrintWriter out=resp.getWriter();
	    AtmDao dao=new AtmDao();
	    System.out.println(amount);
	    //System.out.println(amount);
	    if(amount>0)
	    {
	    	if(dao.AmountWithdraw(amount, pin))
	    	{

	    		RequestDispatcher dispatcher=req.getRequestDispatcher("WithdrawSucces.jsp");
	    		dispatcher.forward(req, resp);
	    	}
	    	else
	    	{
	    		out.println("<center> <h1 style='color:red;'>ENTER VALID PIN NUMBER...!!</h1></center>");
	    		RequestDispatcher dispatcher=req.getRequestDispatcher("CashWithdraw.jsp");
	    		dispatcher.include(req, resp);
	    		//System.out.println(phoneNumber);  
	    	}
	    }
	    else
	    {
	    	out.println("<center> <h1 style='color:red;'>ENTER VALID AMOUNT...!!</h1></center>");
	    	out.println("<center> <h1 style='color:red;'>REENTER YOUR PIN...!!</h1></center>");
    		RequestDispatcher dispatcher=req.getRequestDispatcher("CashWithdraw.jsp");
    		dispatcher.include(req, resp);
	    }
	}
}


