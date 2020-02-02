<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Guest Page</title>
<link rel="stylesheet" type="text/css" href="common.css">
</head>
<body>
<div class="topnav">
 <a class="active" href='http://localhost:8080/WebApplicationProject/register.html'> Register </a>
 <a href='http://localhost:8080/WebApplicationProject/tweet.html'> Tweet Page </a>
 
</div>

<div class="content">
     <form action="guest">
  
      YOUR ON GUEST PAGE
  </form>
  
  <jsp:include page="footer.jsp"/>
</div>
</body>
</html>