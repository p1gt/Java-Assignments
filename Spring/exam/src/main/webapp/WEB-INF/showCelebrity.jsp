<%--
  Created by IntelliJ IDEA.
  User: odayi
  Date: 7/24/2023
  Time: 12:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<html>
<head>
	<title><c:out value="${celebrity.name}"/></title>
	<link rel="stylesheet" href="/style.css">
</head>
<body>
<a href="/">home</a>
<h1><c:out value="${celebrity.name}"/></h1>
<p>page manager: <c:out value="${celebrity.manager.userName}"/></p>
<p>contact: <c:out value="${celebrity.manager.email}"/></p>
<p>details: <c:out value="${celebrity.details}"/></p>
<c:if test="${!celebrity.followers.contains(currentUser)}">
	<button><a href="/celebrity/${celebrity.id}/follow">follow</a></button>
</c:if>
<c:if test="${celebrity.followers.contains(currentUser)}">
	<button><a href="/celebrity/${celebrity.id}/unfollow">unfollow</a></button>
</c:if>
<a href="/celebrity/${celebrity.id}/update">update</a> | <a href="/celebrity/${celebrity.id}/delete">delete</a>
<h1>followers</h1>
<c:forEach items="${celebrity.followers}" var="follower">
	<p><c:out value="${follower.userName}"/> - <c:out value="${follower.email}"/></p>
</c:forEach>
</body>
</html>
