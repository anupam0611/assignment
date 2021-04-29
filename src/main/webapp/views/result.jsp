<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result</title>
</head>
<body>
	<h1>Result</h1>
	<h3>Number 1: <%= request.getAttribute("a") %></h3>
	<h3>Number 2: <%= request.getAttribute("b") %></h3>
	<h2>Result: <%= request.getAttribute("c") %></h2>
	<a href="/demo">Back</a>
</body>
</html>