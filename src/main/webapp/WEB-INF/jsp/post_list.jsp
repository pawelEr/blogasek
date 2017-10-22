<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
<%@include file="header.jsp"%>
<body>
	<c:forEach var="post" items="${posts}">
		<a href="show/${post.id}">${post.title }</a>
	</c:forEach>

	<%@include file="footer.jsp"%>
</body>
</html>