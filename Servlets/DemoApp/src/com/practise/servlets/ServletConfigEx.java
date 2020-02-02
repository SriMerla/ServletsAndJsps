package com.practise.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletConfigEx extends HttpServlet{
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		PrintWriter out = response.getWriter();
		out.println("Hello from ServletConfigEx<br/>");
		
		ServletConfig cg = getServletConfig();
		String name = cg.getInitParameter("name");
		out.println(name);
		
	}
	
}
