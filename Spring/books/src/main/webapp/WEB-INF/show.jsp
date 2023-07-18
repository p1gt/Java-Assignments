<%--
  Created by IntelliJ IDEA.
  User: odayi
  Date: 7/18/2023
  Time: 5:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title><c:out value="${book.id}"/></title>
</head>
<body>
	<h1><c:out value="${book.title}"/></h1>
	<p>description: <c:out value="${book.description}"/></p>
	<p>language: <c:out value="${book.language}"/></p>
	<p>pages: <c:out value="${book.numberOfPages}"/></p>
</body>
</html>
