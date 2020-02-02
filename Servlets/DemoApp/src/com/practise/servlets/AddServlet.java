package com.practise.servlets;

import java.io.IOException;
import java.io.PrintWriter;




import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		System.out.println(request.getMethod());
		int i = Integer.parseInt(request.getParameter("num1"));
		int j = Integer.parseInt(request.getParameter("num2"));
		
		int k = i + j;
		
		 HttpSession session = request.getSession();
		 session.setAttribute("k", k);
		 
	     response.sendRedirect("square");
		
		
		
		
		//response.sendRedirect("square?k=" + k);  
		
		
//		request.setAttribute("k", k);	
//	RequestDispatcher rd = request.getRequestDispatcher("square");
//	rd.forward(request, response);
//		PrintWriter out = response.getWriter();
//		out.println("The result is : " + k);
		
	}

}
 