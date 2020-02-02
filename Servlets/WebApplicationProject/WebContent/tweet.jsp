<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Post a Tweet</title>
</head>
<body>
   <jsp:include page="header.jsp"/>
   <div class="content">
    <form action="tweet" method="post">
          <h2>Tweet :<h2> 
          <textarea rows="5" cols="30" name="tweet">Write your tweet</textarea>
          <input type="submit" value="Post">
      </form>
   </div>
  <jsp:include page="footer.jsp"/>
</body>
</html>