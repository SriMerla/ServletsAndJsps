package com.web.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.HeaderUtil;

/**
 * Servlet implementation class TweetView
 */
public class TweetView extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 HeaderUtil.writeHeader(response);  
		String username = request.getParameter("username");
		PrintWriter out = response.getWriter();
		//Set<String> userTweets = new HashSet<String>();
		try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
		
		try (Connection conn = DriverManager.getConnection(
                "jdbc:oracle:thin:@192.168.1.227:1521/orcl", "system", "oracle")){
             
        	 Statement statement = conn.createStatement();
        	ResultSet userTweets = statement.executeQuery("SELECT TWEET FROM TWEETS where USERNAME='"+username+"'");
        	out.println(username + " Tweets :");
        	while(userTweets.next()){
        		String data = userTweets.getString("TWEET");
        	out.println("</br>"+data  );
        	}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
}
	
}	 
	
	
