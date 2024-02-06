<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Enter a Name</title>
</head>
<body>
	<h1>Register Order Information</h1>
	<form action="getNameServlet" method="post">
		Enter your first name:
		<input type="text" name="firstName" size="20">
		Enter your last name:
		<input type="text" name="lastName" size="20">
		<input type="submit" value="Format Name" />
	</form>
	
	<a href="index.jsp">Home Page</a> <br />
</body>
</html>