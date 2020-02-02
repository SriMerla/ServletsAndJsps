<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Simple JSP</title>
</head>
<body>
  <%@page import="java.util.*" %> <%-- packages to be imported  --%>
  
  <%!
    int var = 10;  /* Declaration ---------- Outside the Service () Inside the Class */
  %>
  <%
  
   
   out.println(7+5);    /* goes into service method */ 
  %>
  This is the variable given in the Declaration tag : <%= var %>
  
</body>
</html>