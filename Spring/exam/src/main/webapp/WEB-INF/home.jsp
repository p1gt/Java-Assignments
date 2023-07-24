<%--
  Created by IntelliJ IDEA.
  User: odayi
  Date: 7/24/2023
  Time: 10:29 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
	<title>home</title>
	<link rel="stylesheet" href="/style.css">
</head>
<body>
<h1>welcome <c:out value="${currentUser.userName}"/></h1>
<a href="/logout">logout</a> | <a href="/celebrity/new">add celebrity page</a>
<form action="/celebrity/search" method="get">
	<input type="text" name="name" placeholder="search by name">
	<input type="submit" value="search">
</form>
<h1>all celebrities</h1>
<table>
	<tr>
		<th>name</th>
		<th>page manager</th>
		<th># of followers</th>
	</tr>
	<c:forEach var="celebrity" items="${celebrities}">
		<tr>
			<td><a href="/celebrity/${celebrity.id}"><c:out value="${celebrity.name}"/></a></td>
			<td><c:out value="${celebrity.manager.userName}"/></td>
			<td><c:out value="${celebrity.followers.size()}"/></td>
		</tr>
	</c:forEach>
</table>
</body>
</html>
