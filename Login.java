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
@WebServlet("/Login")
public class Login extends HttpServlet
{	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		  PrintWriter out=resp.getWriter();
		   String phoneNumber=req.getParameter("PhoneNumber");
		   int pin=Integer.parseInt(req.getParameter("pin"));
		 
	     AtmDao dao=new AtmDao();
	    // System.out.println(phoneNumber);
	     if(dao.loginPage(phoneNumber, pin))
	     {
	      
	     	RequestDispatcher dispatcher =req.getRequestDispatcher("Atm.jsp");
	     	dispatcher.forward(req, resp);

	     }
	     else
	     {
	  	   out.println("<center> <h1 style='color:red;'>ENTER VALID MOBILE NUMBER AND PIN...!!</h1></center>");
	 		RequestDispatcher dispatcher=req.getRequestDispatcher("LoginPage.jsp");
	 		dispatcher.include(req, resp);
	 		//System.out.println(phoneNumber);
	  	   
	     }
	}

}
