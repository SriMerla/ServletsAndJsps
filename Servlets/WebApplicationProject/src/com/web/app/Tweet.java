package com.web.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import util.HeaderUtil;

/**
 * Servlet implementation class Tweet
 */
public class Tweet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  HeaderUtil.writeHeader(response);
		  
		  PrintWriter out = response.getWriter();
          out.println("From Tweet Servlet");
          
          HttpSession session = request.getSession();

          String username = (String) session.getAttribute("username");
	  	  String tweet = request.getParameter("tweet");
	  	  
		 DatabaseUtil databaseUtil = new DatabaseUtil();
	  databaseUtil.executeSQL(("INSERT INTO TWEETS VALUES ('" + username + "','" + tweet + "')" ));
		 
	}

}