package com.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AtmDao {
	private Connection connect;
	private PreparedStatement ps;
	private ResultSet rs;
	private String quary;
	private String url = "jdbc:mysql://localhost:3306?user=root&password=12345";
	private String driver = "com.mysql.jdbc.Driver";

	
	public boolean loginPage(String phoneNumber ,int pin)
 {
		quary = "select * from teja25.atmdata where MobileNumber=? and pin=?";

		try {
			Class.forName(driver);
			connect = DriverManager.getConnection(url);
			ps = connect.prepareStatement(quary);
			ps.setString(1, phoneNumber);
			ps.setInt(2, pin);
			rs = ps.executeQuery();
			if (rs.next()) {
				return true;
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean verifyPhoneNumber(String phoneNumber)
 {
		quary = "select * from teja25.atmdata where MobileNumber=?";

		try {
			Class.forName(driver);
			connect = DriverManager.getConnection(url);
			ps = connect.prepareStatement(quary);
			ps.setString(1, phoneNumber);
			rs = ps.executeQuery();
			if (rs.next()) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
    public boolean verifyPin(int pin)
 {
		quary ="select * from teja25.atmdata where pin=?";
	
		try {
			Class.forName(driver);
			connect = DriverManager.getConnection(url);
			ps = connect.prepareStatement(quary);
			ps.setInt(1, pin);
			System.out.println(pin);
			rs = ps.executeQuery();
			if (rs.next()) {
				return true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public boolean setPin(int newpin, String phoneNumber)
 {
		quary ="update teja25.atmdata set pin=? where MobileNumber=?";
	
		try {
			Class.forName(driver);
			connect = DriverManager.getConnection(url);
			ps = connect.prepareStatement(quary);
			ps.setInt(1, newpin);
			System.out.println(newpin);
			ps.setString(2, phoneNumber);
			System.out.println(phoneNumber);
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

	public boolean verifypinNumber(int pin)
	{
		quary ="select * from teja25.atmdata where pin=?";
	
		try {
			Class.forName(driver);
			connect = DriverManager.getConnection(url);
			ps = connect.prepareStatement(quary);
			ps.setInt(1, pin);
			System.out.println(pin);
			rs=ps.executeQuery();
			if (rs.next()) {
				return true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	public ResultSet cheakBalance(String pin)
	{
		quary ="select * from teja25.atmdata where pin=?";
		
		try {
			Class.forName(driver);
			connect = DriverManager.getConnection(url);
			ps = connect.prepareStatement(quary);
			ps.setString(1, pin);
			System.out.println(pin);
			rs=ps.executeQuery();
			if (rs.next()) {
				return rs;
			}
		} 
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
    
    public boolean AmountWithdraw(double amount,int pin)
	{
		quary ="update teja25.atmdata set Balance=Balance-? where pin=?";
		
		try {
			Class.forName(driver);
			connect = DriverManager.getConnection(url);
			ps = connect.prepareStatement(quary);
			ps.setDouble(1,amount);
			ps.setInt(2, pin);
			System.out.println(amount);
			int rs=ps.executeUpdate();
			if (rs>=1) {
				return true;
			}
		} 
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean VerifyAccountNumber(String accountNumber)
	{
		quary ="select * from teja25.atmdata where AccountNumber=?";
		
		try {
			Class.forName(driver);
			connect = DriverManager.getConnection(url);
			ps = connect.prepareStatement(quary);
			ps.setString(1, accountNumber);
			//System.out.println(senderAccount);
			 rs=ps.executeQuery();
			if (rs.next()) {
				return true;
			}
		} 
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
    public boolean addMoneyReciverAccount(String reciverAccount,double amount)
	{
      quary ="update teja25.atmdata set Balance=Balance+? where AccountNumber=?";
		
		try {
			Class.forName(driver);
			connect = DriverManager.getConnection(url);
			ps = connect.prepareStatement(quary);
			ps.setDouble(1, amount);
			ps.setString(2, reciverAccount);
			//System.out.println(reciverAccount);
			int rs=ps.executeUpdate();
			if (rs>1) {
				return true;
			}
		} 
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}
	
    public boolean deductSenderAccount(String senderAccount,double amount)
	{
      quary ="update teja25.atmdata set Balance=Balance-? where AccountNumber=?";
		
		try {
			Class.forName(driver);
			connect = DriverManager.getConnection(url);
			ps = connect.prepareStatement(quary);
			ps.setDouble(1, amount);
			ps.setString(2, senderAccount);
			//ps.setDouble(3, amount);
			//System.out.println(amount);
			int rs=ps.executeUpdate();
			if (rs>1) {
				return true;
			}
		} 
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
    public boolean registerPage(String AccountNumber,String accountHoldername,String ifsc,double balance, String mobilenumber,String pin )
	{
		quary ="insert into teja25.atmdata values(?,?,?,?,?,?)";

		try {
			Class.forName(driver);
			connect = DriverManager.getConnection(url);
			ps = connect.prepareStatement(quary);
			ps.setString(1, AccountNumber);
			ps.setString(2, accountHoldername);
			ps.setString(3, ifsc);
			ps.setDouble(4, balance);
			ps.setString(5, mobilenumber);
			ps.setString(6, pin);
			int rs=ps.executeUpdate();
			if (rs>=1) {
				return true;
			}
		} 
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}

	public boolean deposit(String AccountNumber,double balance)
	{
		 quary ="update teja25.atmdata set Balance=Balance+? where AccountNumber=?";
		try {
			Class.forName(driver);
			connect = DriverManager.getConnection(url);
			ps = connect.prepareStatement(quary);
			ps.setDouble(1, balance);
			ps.setString(2, AccountNumber);
			int rs=ps.executeUpdate();
			if (rs>=1) {
				return true;
			}
		} 
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
