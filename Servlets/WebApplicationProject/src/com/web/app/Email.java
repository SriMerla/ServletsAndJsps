package com.web.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import util.HeaderUtil;

/**
 * Servlet implementation class Email
 */
public class Email extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 HeaderUtil.writeHeader(response);  
		String toEmail = request.getParameter("mailId");
		 String textInMail = request.getParameter("textInMail");
		 
		 HttpSession session = request.getSession();
         String username = (String) session.getAttribute("username");
		 
		 try {
	            Class.forName("oracle.jdbc.driver.OracleDriver");
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        }
			
			try (Connection conn = DriverManager.getConnection(
	                "jdbc:oracle:thin:@192.168.1.227:1521/orcl", "system", "oracle")){
	             
	        	Statement statement = conn.createStatement();
	        	statement.executeQuery("INSERT INTO EMAIL VALUES('" + username + "','" + toEmail + "','" + textInMail + "')" );
	        	PrintWriter out = response.getWriter();
	        	out.println("Email Sent Succesfully");
	        
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
	}

}
