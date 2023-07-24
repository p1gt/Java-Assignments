<%--
  Created by IntelliJ IDEA.
  User: odayi
  Date: 7/24/2023
  Time: 1:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<html>
<head>
	<link rel="stylesheet" href="/style.css">
	<title>result</title>
</head>
<body>
<h1>list of celebrities with the name <c:out value="${name}"/></h1>
<a href="/">home</a>
<table>
	<tr>
		<th>name</th>
		<th>manager</th>
		<th># of followers</th>
	</tr>
	<c:forEach items="${celebrities}" var="celebrity">
		<tr>
			<td><a href="/celebrity/${celebrity.id}">${celebrity.name}</a></td>
			<td>${celebrity.manager.userName}</td>
			<td>${celebrity.followers.size()}</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>
