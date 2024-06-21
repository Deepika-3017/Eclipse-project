<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.time.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sample Java Server Page</title>
</head>
<body>
	
	<%@ include file="header.jsp" %>
	
	<h3>Hello, Todays date is</h3> 
	
	<% 
		LocalDateTime today = LocalDateTime.now();
		out.println(today);
		request.setAttribute("email","digitech1993@gmail.com");

	%>
	
	<h3>My Email Id  is: </h3>
	<%
		out.println(request.getAttribute("email")) ;
	%>
	
	<%@ include file="footer.jsp" %>
	
	
	<h4>End of the Page</h4>
	
</body>
</html>