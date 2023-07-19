<%--suppress ALL --%>
<%--
  Created by IntelliJ IDEA.
  User: odayi
  Date: 7/19/2023
  Time: 2:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>burger tracker</title>
	<link rel="stylesheet" href="CSS/style.css">
</head>
<body>
	<h1>burger tracker</h1>
	<table>
		<tr>
			<th>burger name</th>
			<th>restaurant name</th>
			<th>rating (out of 5)</th>
			<th>action</th>
		</tr>
		<c:forEach var="burger" items="${burgers}">
			<tr>
				<td><c:out value="${burger.burgerName}"/></td>
				<td><c:out value="${burger.restaurantName}"/></td>
				<td><c:out value="${burger.rating}"/></td>
				<td><a href="/burgers/${burger.id}/edit">edit</a></td>
			</tr>
		</c:forEach>
	</table>
	<a href="/burgers/new">add a burger</a>
</body>
</html>
