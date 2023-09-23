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
@WebServlet("/VerifyBalance")
public class VerifyBalance extends HttpServlet 
{
 @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 resp.setContentType("text/html");
	  PrintWriter out=resp.getWriter();
	String pin=req.getParameter("pin");
    AtmDao dao=new AtmDao();
    ResultSet rs=dao.cheakBalance(pin);
    System.out.println(pin);
    if(rs!=null)
    {
    	
    	try {
    		out.println("<center> <u><h1 style='color:red;'>YOUR ACCOUNT BALANCE...!!</h1> </u></center>");
    		out.println("<center> <h1 style='color:white;'>"+rs.getString(4)+"</h1></center>");
        	//out.println(rs.getString(4));
        	RequestDispatcher dispatcher=req.getRequestDispatcher("ShowBalance.jsp");
    		dispatcher.include(req, resp);
			//out.println(rs.getString(4));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
    }
    else
    {
 	   out.println("<center> <h1 style='color:red;'>ENTER VALID PIN NUMBER...!!</h1></center>");
		RequestDispatcher dispatcher=req.getRequestDispatcher("Atm.jsp");
		dispatcher.forward(req, resp);
		//System.out.println(phoneNumber);
	       
 	  
 	   
    }
}
}
