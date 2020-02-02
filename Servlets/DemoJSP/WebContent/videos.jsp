<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Video Links Page</title>
</head>
<body>
     <% 
            response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
            
            response.setHeader("Pragma", "no-cache"); // HTTP 1.0
     
            response.setHeader("Expires", "0"); // Proxies
            if(session.getAttribute("username")==null)
            {
            	response.sendRedirect("login.jsp");
            }
      %>
     
     <iframe width="560" height="315" src="https://www.youtube.com/embed/OuBUUkQfBYM" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
     <br>
     <br>
    <br>
       <form action="logout">
    
       <input type="submit" value="Logout">
    
    </form>    
</body>
</html>