<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="blog-post">
	<h2 class="blog-post-title"><a href="<%=request.getContextPath()%>/post/show/<c:out value="${param.id}"/>"><c:out value="${param.title }" /></a></h2>
	<c:out value="${param.text }" />
</div>