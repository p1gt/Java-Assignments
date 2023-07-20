<%--
  Created by IntelliJ IDEA.
  User: odayi
  Date: 7/20/2023
  Time: 2:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>expenses</title>
	<link rel="stylesheet" href="/CSS/style.css">
</head>
<body>
<h1>all travels</h1>
<table>
	<tr>
		<th>expense</th>
		<th>vendor</th>
		<th>amount</th>
		<th>actions</th>
	</tr>
	<c:forEach items="${travels}" var="travel">
		<tr>
			<td>${travel.name}</td>
			<td>${travel.vendor}</td>
			<td>${travel.amount}</td>
			<td>
				<a href="/expenses/${travel.id}">show</a>
				<a href="/expenses/${travel.id}/edit">edit</a>
				<a href="/expenses/${travel.id}/delete">delete</a>
			</td>
		</tr>
	</c:forEach>
</table>
<a href="/expenses/new">add expense</a>
</body>
</html>
