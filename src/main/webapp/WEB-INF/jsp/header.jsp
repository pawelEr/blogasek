<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<head>
<meta charset="UTF-8">
<meta name="description" content="Spring warmup blog project" />
<meta name="author" content="Vampiur" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css"
	integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb"
	crossorigin="anonymous">
<link href="<%=request.getContextPath()%>/resources/blog.css"
	rel="stylesheet">
<title><c:out value="${empty param.page_title? 'Blogasek' : param.page_title.concat(' - Blogasek')}" /></title>
</head>