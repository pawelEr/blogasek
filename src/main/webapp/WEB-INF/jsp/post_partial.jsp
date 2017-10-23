<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="blog-post">
	<h2 class="blog-post-title"><c:out value="${param.title }" /></h2>
	<c:out value="${param.text }" />
</div>