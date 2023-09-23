package com.jsp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/SenderAccountForTransfor")
public class SenderAccountForTransfor extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String senderAccount=req.getParameter("senderAccount");
		 resp.setContentType("text/html");
		  PrintWriter out=resp.getWriter();
		HttpSession sessionObject=req.getSession();
		sessionObject.setAttribute("senderAccount",senderAccount);
		HttpSession sessionObject1=req.getSession();
		sessionObject.setAttribute("senderAccount1",senderAccount);
	    AtmDao dao=new AtmDao();
	    
	    //System.out.println(senderAccount);
	    if(senderAccount!=null)
	    {
	    	if(dao.VerifyAccountNumber(senderAccount))
	    	{
	    	RequestDispatcher dispatcher=req.getRequestDispatcher("TransforingAccount.jsp");
			dispatcher.forward(req, resp);
	    	}
	    else
	      {
	 	   out.println("<center> <h1 style='color:red;'>ENTER VALID ACCOUNT NUMBER...!!</h1></center>");
			RequestDispatcher dispatcher=req.getRequestDispatcher("Transfor.jsp");
			dispatcher.include(req, resp); 
	       }
	    }
	}
    

}
