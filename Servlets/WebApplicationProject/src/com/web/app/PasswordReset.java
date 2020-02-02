package com.web.app;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.HeaderUtil;

/**
 * Servlet implementation class PasswordReset
 */
public class PasswordReset extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 HeaderUtil.writeHeader(response);  
		String username = request.getParameter("username");
		String currentPass = request.getParameter("currentPassword");
		String newPass = request.getParameter("newPassword");
		try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
		
		try (Connection conn = DriverManager.getConnection(
                "jdbc:oracle:thin:@192.168.1.227:1521/orcl", "system", "oracle")){
             
        	 Statement statement = conn.createStatement();
        	ResultSet result = statement.executeQuery("SELECT PASSWORD FROM USERS_REGISTERED where USERNAME='"+username+"'");
        	String pass = null;
        	if(result.next()){
        		pass = result.getString("PASSWORD");
        	}
        	if(pass.equals(currentPass)){
        		
        		statement.executeQuery("UPDATE USERS_REGISTERED SET PASSWORD='"+newPass+"' WHERE USERNAME= '"+username+"'");
        		
        	}
        
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
