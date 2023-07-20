<%--
  Created by IntelliJ IDEA.
  User: odayi
  Date: 7/20/2023
  Time: 5:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title><c:out value="${expense.name}"/></title>
	<link rel="stylesheet" href="/CSS/style.css">
</head>
<body>
<h1><c:out value="${expense.name}"/> details</h1>
<table>
	<tr>
		<td>name:</td>
		<td><c:out value="${expense.name}"/></td>
	</tr>
	<tr>
		<td>vendor:</td>
		<td><c:out value="${expense.vendor}"/></td>
	</tr>
	<tr>
		<td>amount:</td>
		<td><c:out value="${expense.amount}"/></td>
	</tr>
	<tr>
		<td>description:</td>
		<td><c:out value="${expense.description}"/></td>
	</tr>
</table>
</body>
</html>
