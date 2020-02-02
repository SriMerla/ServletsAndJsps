package com.web.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.naming.ldap.Rdn;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import util.HeaderUtil;

/**
 * Servlet implementation class UserLogin
 */
public class UserLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HeaderUtil.writeHeader(response);
		  	
		String name =request.getParameter("username");
		PrintWriter out = response.getWriter();
		 

		//Fetching data from database
		DatabaseUtil databaseUtil = new DatabaseUtil();
	   User userInDB = databaseUtil.getUserByUserName(name);
	      if(userInDB == null){
	    	  
	    	  out.println("<h3>Error : Login Failed, Try Again<h3>");
				
	      }
	      else{
	    	    HttpSession session = request.getSession();
	 	        session.setAttribute("username", name);
	 	        out.println("Login Succcecfull");
	    	    RequestDispatcher rd = request.getRequestDispatcher("checkInbox");
				rd.forward(request, response);
	    	  
	      }
	   
			
			
		
		
	}

}
