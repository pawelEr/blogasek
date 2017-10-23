<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
<%@include file="header.jsp"%>
<body>
	<c:forEach var="post" items="${posts}">
		<a href="show/${post.id}">${post.title}</a>
		<jsp:include page="post_partial.jsp">
			<jsp:param name="title" value="${post.title}"/>
			<jsp:param name="text" value="${post.text}"/>		
		</jsp:include>
	</c:forEach>

	<%@include file="footer.jsp"%>
</body>
</html>