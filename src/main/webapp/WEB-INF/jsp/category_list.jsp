<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
<jsp:include page="header.jsp">
	<jsp:param value="All categories" name="page_title" />
</jsp:include>
<body>
	<header>
		<div class="blog-masthead">
			<div class="container">
				<nav class="nav">
					<a class="nav-link" href="<%=request.getContextPath()%>">Home</a> <a
						class="nav-link active" href="/list">Categories</a> <a
						class="nav-link" href="<%=request.getContextPath()%>/post/add">Add
						post</a>
				</nav>
			</div>
		</div>
	</header>
	<main role="main" class="container">
	<div class="row">
		<div class="col-sm-8 blog-main">
			<ul>
				<c:forEach var="category" items="${categories}">
					<li>${category.name}</li>
				</c:forEach>
			</ul>
			<a href="add/" class="btn btn-primary">Add new</a>
		</div>
	</div>
	</main>

	<%@include file="footer.jsp"%>
</body>
</html>