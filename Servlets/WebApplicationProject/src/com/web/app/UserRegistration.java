package com.web.app;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.HeaderUtil;

public class UserRegistration extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		HeaderUtil.writeHeader(response);
		  
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		DatabaseUtil databaseUtil = new DatabaseUtil();
		databaseUtil.insertNewUser(username, password);	
	
		PrintWriter writer = response.getWriter();
		writer.println("Entered Username : " + username + "</br> Password : " + password);
		
		
		
	}

}
