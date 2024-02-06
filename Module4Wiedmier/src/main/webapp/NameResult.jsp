<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>Formatted name: <br /> 
		${userNameInfo.getFullName()} <br /> 
	</p> 
	<a href="index.jsp">Home Page</a> <br />
	<a href="EnterOrderInfo.jsp">Enter an order</a><br />
	<a href="EnterAName.jsp">Format another name</a><br />
</body>
</html>