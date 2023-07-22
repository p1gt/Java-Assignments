<%--
  Created by IntelliJ IDEA.
  User: odayi
  Date: 7/22/2023
  Time: 2:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title><c:out value="${dojo.name} ninjas"/></title>
	<link rel="stylesheet" href="/CSS/style.css">
</head>
<body>
<h1>all <c:out value="${dojo.name}"/> ninjas</h1>
<table>
	<tr>
		<th>first name</th>
		<th>last name</th>
		<th>age</th>
	</tr>
	<c:forEach var="ninja" items="${dojo.ninjas}">
		<tr>
			<td><c:out value="${ninja.firstName}"/></td>
			<td><c:out value="${ninja.lastName}"/></td>
			<td><c:out value="${ninja.age}"/></td>
		</tr>
	</c:forEach>
</table>
</body>
</html>
