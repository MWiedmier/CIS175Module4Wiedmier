<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order Payment Result</title>
</head>
<body>
	<h1>Order Payment Information</h1>
	<p>Payment information: <br /> 
		${userRegInfo.getAmountOwed()} is owed <br /> 
		${userRegInfo.getChangeBack()} returned in change <br />
	</p> 
	<a href="index.jsp">Home Page</a> <br />
	<a href="EnterOrderInfo.jsp">Enter another order</a><br />
	<a href="EnterAName.jsp">Format a name</a><br />
</body>
</html>