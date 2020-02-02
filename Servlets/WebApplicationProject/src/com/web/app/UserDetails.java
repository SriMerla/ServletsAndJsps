package com.web.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class UserDetails
 */
public class UserDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("username");
		String fname = request.getParameter("firstname");
		String lname = request.getParameter("lastname");
		
	
		
		try {
	            Class.forName("oracle.jdbc.driver.OracleDriver");
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        }
			
			try (Connection conn = DriverManager.getConnection(
	                "jdbc:oracle:thin:@192.168.1.227:1521/orcl", "system", "oracle")){
	             
	        	Statement statement = conn.createStatement();
	        	statement.executeQuery("INSERT INTO USERS VALUES(USERS_SEQ.NEXTVAL,'" + uname + "','" + fname + "','" + lname + "')" );
	        	PrintWriter out = response.getWriter();
	        	out.println("User Details Updated Succesfully");
	        
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
	}

}
