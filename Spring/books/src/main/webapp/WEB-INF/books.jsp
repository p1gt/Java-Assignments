<%--
  Created by IntelliJ IDEA.
  User: odayi
  Date: 7/18/2023
  Time: 10:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>books</title>
</head>
<body>
	<h1>all books</h1>
	<h1>tessststst</h1>
	<table>
		<tr>
			<th>ID</th>
			<th>title</th>
			<th>language</th>
			<th># pages</th>
		</tr>
		<c:forEach var="book" items="${books}">
			<tr>
				<td><c:out value="${book.id}"/></td>
				<td><a href="/books/${book.id}"><c:out value="${book.title}"/></a></td>
				<td><c:out value="${book.language}"/></td>
				<td><c:out value="${book.numberOfPages}"/></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
