<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html>
<%@include file="header.jsp"%>
<body>
	<h1>${ post.title }</h1>
	<p>${ post.text }</p>
	<%@include file="footer.jsp"%>
</body>
</html>