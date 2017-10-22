<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html>
<%@include file="header.jsp"%>
<body>
	<header>
		<div class="blog-masthead">
			<div class="container">
				<nav class="nav">
					<a class="nav-link active" href="<%=request.getContextPath()%>">Home</a>
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
				<h1>Test</h1>
			    <p>${message }</p>
			</div>
			
		</div>
	</main>
	<form action="post/add" method="POST">
		<input type="text" name="post_title" /> 
		<input type="text" name="post_text" /> 
		<input type="submit" />
	</form>
	
	<a href="post/list">Posts list</a>
	<%@include file="footer.jsp"%>
</body>
</html>