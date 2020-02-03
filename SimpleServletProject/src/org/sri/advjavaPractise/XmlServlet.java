package org.sri.advjavaPractise;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XmlServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("Xml Servlet called!!");
		response.setContentType("text/html");
		PrintWriter write = response.getWriter();
		String userName = request.getParameter("userName");
		//String userId = request.getParameter("userId");
		write.println("Hello from GET method " + userName +" !!");
		//write.println("UserId : " + userId );
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter write = response.getWriter();
		String userName = request.getParameter("userName");
		String lastName = request.getParameter("lastName");
		String prof = request.getParameter("prof");
		
		printHeader(write);
		
		write.println("Hello from POST method " + userName +" !!");
		
		write.println("Welcome to your page" + userName + lastName);
		
		
		
		write.println(" You are " + prof);
		
		String location = request.getParameter("location");
		write.println(" You are from "+ location);
		//write.println("UserId : " + userId );
		printFooter(write);
		
	}
	
	public void printHeader(PrintWriter printWriter) {
		printWriter.print("<table Style=\"width:100%\" border = \"1\">\r\n" + 
				"\r\n" + 
				"<tr>\r\n" + 
				"<td height=\"100\">\r\n" + 
				" <h3>Header Data</h3>\r\n" + 
			 	"</td>\r\n" + 
				"</tr>\r\n" + 
				"\r\n" + 
				"<tr>\r\n" + 
				"<td height=\"300\">");

	}
	
	public void printFooter(PrintWriter printWriter) {
		printWriter.print("</td>\r\n" + 
				"</tr>\r\n" + 
				"\r\n" + 
				"<tr>\r\n" + 
				"<td height=\"100\">\r\n" + 
				" <h3>Footer Data</h3>\r\n" + 
				"</td>\r\n" + 
				"</tr>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"</table>");

	}	

}
