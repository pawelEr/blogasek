<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html>
<jsp:include page="header.jsp">
	<jsp:param value="Add category" name="page_title"/>
</jsp:include>
<body>
	<header>
		<div class="blog-masthead">
			<div class="container">
				<nav class="nav">
					<a class="nav-link" href="<%=request.getContextPath()%>">Home</a>
					<a class="nav-link" href="<%=request.getContextPath()%>/category/list">Categories</a>
					<a class="nav-link" href="<%=request.getContextPath()%>/post/add">Add post</a>
				</nav>
			</div>
		</div>
	</header>
	<main role="main" class="container">
		<div class="row">
			<div class="col-sm-8 blog-main">
				<form action="<%=request.getContextPath()%>/category/add" method="POST">
					<div class="form-group">
						<label for="category_name">Category name:</label>
						<input type="text" class="form-control" id="category_name" name="category_name"/>
					</div> 
					<button type="submit" class="btn btn-primary">Add category</button>
				</form>
			</div>		
		</div>
	</main>
	<%@include file="footer.jsp"%>
</body>
</html>