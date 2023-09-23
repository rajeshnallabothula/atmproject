package com.jsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SetPinServlet")
public class SetPinServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		   resp.setContentType("text/html");
 		  PrintWriter out=resp.getWriter();
		   int pin=Integer.parseInt(req.getParameter("pinNumber")) ;
	       AtmDao dao=new AtmDao();
	       System.out.println(pin);
	       if(dao.verifypinNumber(pin))
	       {
	    	   //PingenerationSucces
	       	RequestDispatcher dispatcher =req.getRequestDispatcher("SetNewPin.jsp");
	       	dispatcher.forward(req, resp);
	       }
	       else
	       {
	    	   out.println("<center> <h1 style='color:red;'>NOT GENERATED YOUR PIN...!!</h1></center>");
	    	   out.println("<center> <h1 style='color:red;'>THIS PASSWORD ALREADY USING ANOTHER USER...!!</h1></center>");
	   		RequestDispatcher dispatcher=req.getRequestDispatcher("SetPin.jsp");
	   		dispatcher.include(req, resp);
	   		//System.out.println(phoneNumber);
		     //  System.out.println(pinNumber);  
	       }
	}
}
