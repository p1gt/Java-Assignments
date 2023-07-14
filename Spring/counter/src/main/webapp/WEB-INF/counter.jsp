<%--
  Created by IntelliJ IDEA.
  User: odayi
  Date: 7/14/2023
  Time: 3:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
	<title>counter</title>
	<link rel="stylesheet" href="/CSS/style.css">
</head>
<body>
	<h3>you have visited this site
		<c:out value="${counter}"/>
		<c:if test="${counter == 1}">time</c:if>
		<c:if test="${counter != 1}">times</c:if>
	</h3>
	<a href="/counter">refresh</a>
	||
	<a href="/clear">reset</a>
	||
	<a href="/doubleit">increment by 2</a>
</body>
</html>
