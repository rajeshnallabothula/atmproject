package com.jsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/RegistrationForm")
public class RegistrationForm extends HttpServlet
{
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		String AccountNumber=req.getParameter("AccountNumber");
		String accountHoldername=req.getParameter("accountHoldername");
		String ifsc="SBIN0008799";
		double balance=000.0;
		String mobilenumber=req.getParameter("phonenumber");
		String pin=req.getParameter("pin");

//		 System.out.println(AccountNumber);
//		 System.out.println(accountHoldername);
//		 System.out.println(balance);
//		 System.out.println(mobilenumber);
//		 System.out.println(pin);
		 AtmDao dao=new AtmDao();

		if(dao.registerPage(AccountNumber, accountHoldername, ifsc, balance, mobilenumber, pin))
		{
			RequestDispatcher dispatcher=req.getRequestDispatcher("RegisterSucces.jsp");
			dispatcher.forward(req, resp);
		}
		else
		{
		out.println("<center> <h1 style='color:red;'>	INVALID CREDENTIAL...!!</h1></center>"); 
		}
	}

}
