package com.practise.simpleservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SimpleServlet
 */
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			String username = request.getParameter("username");
			HttpSession session = request.getSession();
			ServletContext context = getServletContext();
			if(username != " " && username != null){
			
			session.setAttribute("SavedUserName", username);
			context.setAttribute("savedUserName", username);
			}
			out.println("Hello from GET Method ! </br> Request Parameter has username as : " + username);
			out.println("</br> Session Parameter has username as : " + (String)session.getAttribute("SavedUserName"));
			out.println("</br> Context Parameter has username as : " + (String)context.getAttribute("savedUserName"));

		}
	

}
