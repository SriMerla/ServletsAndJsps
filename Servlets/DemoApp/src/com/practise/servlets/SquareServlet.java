package com.practise.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SquareServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
	{     
		//int k = Integer.parseInt(request.getParameter("k"));
		HttpSession session = request.getSession();
	    int k = (int)session.getAttribute("k");
		k = k*k;     
		   PrintWriter write = response.getWriter();
		  write.println("The response from Square Servlet : " + k);
		
		System.out.println("Square Servlet Called");
	}

}
