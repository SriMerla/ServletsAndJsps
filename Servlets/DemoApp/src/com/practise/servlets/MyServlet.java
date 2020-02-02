package com.practise.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		PrintWriter out = response.getWriter();
		out.println("Hello from My Servlet<br/>");
		
		ServletContext contx = getServletContext();
		String name = contx.getInitParameter("name");
		String phone = contx.getInitParameter("Phone");
		out.println(name+"  "+ phone);
		
	}

}
