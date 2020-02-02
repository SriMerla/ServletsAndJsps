package com.web.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.table.DefaultTableModel;

/**
 * Servlet implementation class CheckInbox
 */
public class CheckInbox extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 HttpSession session = request.getSession();
         String username = (String) session.getAttribute("username");
        PrintWriter out = response.getWriter();
         try {
             Class.forName("oracle.jdbc.driver.OracleDriver");
         } catch (ClassNotFoundException e) {
             e.printStackTrace();
         }
 		
 		try (Connection conn = DriverManager.getConnection(
                 "jdbc:oracle:thin:@192.168.1.227:1521/orcl", "system", "oracle")){
              
         	 Statement statement = conn.createStatement();
         	ResultSet userInbox = statement.executeQuery("SELECT * FROM EMAIL where MAILTO='"+username+"'");
      
         	out.println(username + " INBOX :");
         	out.println("<html>\n"+
                    "<body>\n"+
                    "<table width = \"100%\" border =\"1\" align = \"center\">\n>"+
                    "<tr>\n" +
                        "<th>MAILFROM</th>\n"+
                        "<th>EMAIL</th>\n"+
                     "</tr>\n");
            
             while(userInbox.next()){
            	
          		String from = userInbox.getString("MAILFROM");
          		String data = userInbox.getString("EMAIL");
          		 out.println("<tr>\n");
                out.println("<td align = \"center\">" + from + "</td>\n"+
                     "<td align = \"center\">"+ data +"</td>");
                out.println("</tr>\n");
             }
             
             out.println(
                     "</table>\n"+
                     "</body>\n"+
                 "</html>\n");
 		} catch (SQLException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
	}

}
