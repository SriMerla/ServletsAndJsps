<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Roles</title>
<link rel="stylesheet" type="text/css" href="global.css">
</head>
<body>
  <div class="form-container">
  <form action="roles">
   <b>Username</b> <br>
   <input type="text" name="username" placeholder="username"><br>
   <b>Password</b> <br>  
   <input type="password" name="password" placeholder="********"><br>
   <input type="submit" value="login">
  
  </form>
       
  </div> 
  
  <jsp:include page="footer.jsp"/>   
</body>
</html>