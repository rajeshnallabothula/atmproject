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
@WebServlet("/Newpin")
public class Newpin extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.setContentType("text/html");
	  PrintWriter out=resp.getWriter();
	   int newpin=Integer.parseInt(req.getParameter("newpin"));  
	   int conformpin=Integer.parseInt(req.getParameter("conform")) ;  
	   HttpSession sessionObject =req.getSession();
      String phoneNumber =(String)sessionObject.getAttribute("phoneNumber");
     AtmDao dao=new AtmDao();
  	if(newpin==conformpin)
  	{
    // System.out.println(phoneNumber);
     if(dao.setPin(newpin, phoneNumber))
     {
      
     	RequestDispatcher dispatcher =req.getRequestDispatcher("PingenerationSucces.jsp");
     	dispatcher.forward(req, resp);

     }
     else
     {
  	   out.println("<center> <h1 style='color:red;'> INVALID CRENDTIAL ENTER VALID DEATAILS...!!</h1></center>");
 		RequestDispatcher dispatcher=req.getRequestDispatcher("VerifyMobile.jsp");
 		dispatcher.include(req, resp);
 		//System.out.println(phoneNumber);
     }
  	}
  	else
  	{
  		 out.println("<center> <h1 style='color:red;'>ENTER SAME PIN NUMBER IN BOTH...!!</h1></center>");
  	}
}
}
