<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login or SignUp Page</title>
 <h3>WebApp Login</h3>
</head>
<body>
    
   <jsp:include page="user.jsp"/>
        
        <form action="login" method="post"> 
        UserName <input type="text" name="username">
        Password <input type="text" name="password">
        <input type="submit" value="Login">

</body>
</html>