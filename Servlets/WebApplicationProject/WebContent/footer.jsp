<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>footer</title>
<style type="text/css">
.footer {
   position: fixed;
   left: 0;
   bottom: 0;
   width: 100%;
   height: 10%;
   background-color: grey;
   color: white;
   text-align: center;
   font-size: 16px;
   font-family:'Times New Roman'
}

</style>
</head>
<body>
   <div class="footer">
     <p> Copyright@WebApp 2020
     Last Update :<%= new java.util.Date() %> </p>
    
   </div>
</body>
</html>