<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Test page</title>
</head>
<body>
	<h1>Test</h1>
	${message }


	<form action="post/add" method="POST">
		<input type="text" name="post_title" /> 
		<input type="text" name="post_text" /> 
		<input type="submit" />
	</form>
	
	<a href="post/list">Posts list</a>
</body>
</html>