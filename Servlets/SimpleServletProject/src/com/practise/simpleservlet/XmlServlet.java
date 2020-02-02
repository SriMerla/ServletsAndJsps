package com.practise.simpleservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class XmlServlet extends HttpServlet{
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		 
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
		String userId = request.getParameter("userId");
		
		out.println("Hello from GET Method ! </br> Request Parameter has username as : " + username + " " + userId);
		//out.println("</br> Session Parameter has username as : " + (String)session.getAttribute("SavedUserName"));
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
		 
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
		String userId = request.getParameter("userId");
		String prof = request.getParameter("profession");
		String location = request.getParameter("location");
		
		out.println("Hello from POST Method ! </br> UserName : " + username + " </br> UserId : " 
		            + userId + "</br> profession : " + prof + "</br> Location : " + location
		             );
		String[] hobby = request.getParameterValues("hobbies");
	     for(String h : hobby){
	    	 
	    	 out.println(" </br> Hobbies : " + h);
	     }
	}

}
