package com.practise.servletsJsps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.servlets.dao.User;



public class Service {
	 User user;
	public User check(String username, String password){
		
			try {
	            Class.forName("oracle.jdbc.driver.OracleDriver");
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        }
			
			
			try (Connection conn = DriverManager.getConnection(
	                "jdbc:oracle:thin:@192.168.1.227:1521/orcl", "system", "oracle")){
	             
	        	 Statement statement = conn.createStatement();
		ResultSet resultSet = statement.executeQuery("SELECT * FROM USERS_REGISTERED where USERNAME='"+username+"'");
		if(resultSet.next()) {
       	
          user = new User(username,password);
       	  String uname = resultSet.getString("USERNAME");
       	  String pass = resultSet.getString("PASSWORD");
     	  user.setUsername(uname);
     	  user.setPassword(pass);
		}	
		} catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }	
		
			
			
		return user;
	}
}

