package com.cybage.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.cybage.model.User;

public class LoginDao {
	
	public User getUser(String email, String password) {
		User user=null; 
	     Connection connection;
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinereservationsystem" ,"root","P9637333109k@");
	    PreparedStatement statement1= connection.prepareStatement("select * from user where emailid=? and password=?");
	    statement1.setString(1, email);
	    statement1.setString(2, password);	
	    ResultSet rs=statement1.executeQuery();
	    
	    while(rs.next()) {
	    	user=new User();
	    	user.setPid(rs.getInt(1));
	    	user.setFname(rs.getString(2));
	    	user.setLname(rs.getString(3));
	    	user.setGender(rs.getString(4));
	    	user.setAge(rs.getInt(5));
	    	user.setContactNo(rs.getString(6));
	    	user.setAddress(rs.getString(7));
	    	user.setEmailid(rs.getString(8));
	    	user.setPassword(rs.getString(9));
	    
	    }
	    	
	}
	
	catch(Exception e) {
		e.printStackTrace();
	}
	return user;

}


}