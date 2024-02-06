<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Order Info</title>
</head>
<body>
	<h1>Register Order Information</h1>
	<form action="getRegisterServlet" method="post">
		Enter the amount of the order:
		<input type="text" name="orderCost" size="10">
		Enter the payment amount:
		<input type="text" name="userAmount" size="10">
		<input type="submit" value="Calculate Order" />
	</form>
	
	<a href="index.jsp">Home Page</a> <br />
</body>
</html>