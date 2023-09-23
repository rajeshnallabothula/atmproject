package com.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class TransactionDao
{
	private Connection connect;
	private PreparedStatement ps;
	private ResultSet rs;
	private String quary;
	private String url = "jdbc:mysql://localhost:3306?user=root&password=12345";
	private String driver = "com.mysql.jdbc.Driver";

	  public boolean deposit_Statement(String accountNumber, double amount)
	  {
		  
			quary ="insert into teja25.transactions values(?,null,null,0.0,0.0,?,deposit,date,time)";
		  try {
				Class.forName(driver);
				connect = DriverManager.getConnection(url);
				ps = connect.prepareStatement(quary);
				ps.setString(1, accountNumber);
				ps.setDouble(6, amount);
				
				int rs = ps.executeUpdate();
				if (rs >= 1) {
					return true;
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return false;
	  
	  
	  }
	 
}
