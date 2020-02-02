package util;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HeaderUtil {

	public static void writeHeader(HttpServletResponse response) throws IOException {
		PrintWriter o = response.getWriter();
		o.println("|");
		o.println("<a href='http://localhost:8080/WebApplicationProject/tweet.html'>");
		o.println("Tweet Page ");
		o.println("</a>");
		o.println("|");
		o.println("<a href='http://localhost:8080/WebApplicationProject/login.html'>");
		o.println("Login ");
		o.println("</a>");
		o.println("|");
		o.println("<br/><br/><br/>");
	}
	
}
