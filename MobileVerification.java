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
@WebServlet("/MobileVerification")
public class MobileVerification extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.setContentType("text/html");
	  PrintWriter out=resp.getWriter();
	   String phoneNumber=req.getParameter("phoneNumber");
	   HttpSession sessionObject =req.getSession();
       sessionObject.setAttribute("phoneNumber",phoneNumber );
     AtmDao dao=new AtmDao();
 
    // System.out.println(phoneNumber);
     if(dao.verifyPhoneNumber(phoneNumber))
     {
      
     	RequestDispatcher dispatcher =req.getRequestDispatcher("SetPin.jsp");
     	dispatcher.forward(req, resp);

     }
     else
     {
  	   out.println("<center> <h1 style='color:red;'>ENTER VALID MOBILE NUMBER...!!</h1></center>");
 		RequestDispatcher dispatcher=req.getRequestDispatcher("VerifyMobile.jsp");
 		dispatcher.include(req, resp);
 		//System.out.println(phoneNumber);
	       
  	  
  	   
     }
}
}
