<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="com.practise.servletsJsps.DatabaseUtil, java.sql.ResultSet, java.sql.*" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Your Tweets</title>
</head>
<body>

  
    <% 
      
     String username = session.getAttribute("uname").toString();
      System.out.println(username);
    
     // String sql ="SELECT * FROM STUDENT WHERE ROLL_NO=101";
      Class.forName("oracle.jdbc.driver.OracleDriver");
      Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.227:1521/orcl", "system", "oracle");
      Statement st= con.createStatement();
      
      ResultSet rs = st.executeQuery("SELECT TWEET FROM TWEETS where USERNAME='"+username+"'");
      while(rs.next()){
    	  out.println(rs.getString("TWEET"));
    	  out.println("<br>");
      }
    %>
    
    
   
   
    
 
    
   
</body>
</html>