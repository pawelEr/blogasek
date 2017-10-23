<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html>
<%@include file="header.jsp"%>
<body>
	<header>
		<div class="blog-masthead">
			<div class="container">
				<nav class="nav">
					<a class="nav-link active" href="<%=request.getContextPath()%>">Home</a>
					<a class="nav-link" href="categories/list">Categories</a>
					<a class="nav-link" href="post/add">Add post</a>
				</nav>
			</div>
		</div>
		<div class="blog-header">
			<div class="container">
				<h1 class="blog-title">Blogasek</h1>
				<p class="lead blog-description">Simple Spring/Hibernate warmup project</p>
			</div>
		</div>
	</header>
	<main role="main" class="container">
		<div class="row">
			<div class="col-sm-8 blog-main">
				<jsp:include page="post_partial.jsp">
					<jsp:param name="title" value="${latest_post.title}"/>
					<jsp:param name="text" value="${latest_post.text}"/>		
				</jsp:include>
			</div>
			
		</div>
	</main>
	<%@include file="footer.jsp"%>
</body>
</html>