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
					<a class="nav-link" href="<%=request.getContextPath()%>">Home</a>
					<a class="nav-link" href="categories/list">Categories</a>
					<a class="nav-link active" href="<%=request.getContextPath()%>/post/add">Add post</a>
				</nav>
			</div>
		</div>
	</header>
	<main role="main" class="container">
		<div class="row">
			<div class="col-sm-8 blog-main">
				<form action="add" method="POST">
					<div class="form-group">
						<label for="post_title">Post title:</label>
						<input type="text" class="form-control" id="post_title" name="post_title"/>
					</div> 
					<div class="form-group">
						<label for="post_text">Post content:</label>
						<textarea class="form-control" id="post_text" name="post_text" rows="10"></textarea>
					</div> 
					<button type="submit" class="btn btn-primary">Publish</button>
				</form>
			</div>		
		</div>
	</main>
	<%@include file="footer.jsp"%>
</body>
</html>