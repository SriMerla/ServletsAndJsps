package com.practise.servletsJsps;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String uname = request.getParameter("username");
        String pass = request.getParameter("password");
        HttpSession session = request.getSession();
        session.setAttribute("uname", uname);
       if(uname != null && pass != null){ 
       Service service = new Service();
       if( service.check(uname, pass) != null){
    	   response.sendRedirect("tweet.jsp");
       }
       else {   	   
    	   response.sendRedirect("login.jsp");    	   
       }   
       }
         
	}
}
