<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*" isELIgnored = "false"  %>

<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<body>
	<h2>JSTL Demo</h2>
	<c:set var="income" scope="session" value="${4000*4}"/>
	
	<p>Your income is : <c:out value="${income}"/> </p>
	
	
	<c:choose>
		<c:when test="${income <= 10000}">
			Income is not good.
		</c:when>
		<c:when test="${income > 20000}">
			Income is very good.
		</c:when>
		<c:otherwise>
			Income is undetermined...
		</c:otherwise>
	</c:choose>
	<%
		Map<String, String> countryCapitalMap = new HashMap<>();
		countryCapitalMap.put("United States", "Washington DC");
		countryCapitalMap.put("India", "Delhi");countryCapitalMap.put("Germany", "Berlin");
		countryCapitalMap.put("France", "Paris");countryCapitalMap.put("Italy", "Rome");
		request.setAttribute("capital", countryCapitalMap);
	%>
	<%--JSP Code --%>
	<table border="1">
		<tr><th bgcolor="green">COUNTRY</th><th bgcolor="green">CAPITAL</th></tr>
		<c:forEach var="c" items="${capital}">
			<tr><td>${c.key}</td><td>${c.value}</td></tr>
		</c:forEach>
	</table>
</body>
</html>
