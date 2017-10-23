<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
<jsp:include page="header.jsp">
	<jsp:param value="All posts" name="page_title"/>
</jsp:include><body>
	<c:forEach var="post" items="${posts}">
		<a href="show/${post.id}">${post.title}</a>
		<jsp:include page="post_partial.jsp">
			<jsp:param name="title" value="${post.title}"/>
			<jsp:param name="text" value="${post.text}"/>
			<jsp:param name="id" value="${post.id}"/>				
		</jsp:include>
	</c:forEach>

	<%@include file="footer.jsp"%>
</body>
</html>