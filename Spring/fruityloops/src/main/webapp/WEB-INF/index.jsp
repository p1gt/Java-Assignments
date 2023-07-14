<%--
  Created by IntelliJ IDEA.
  User: odayi
  Date: 7/14/2023
  Time: 2:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
	<title>Fruit store</title>
	<link rel="stylesheet" href="/CSS/style.css">
</head>
<body>
	<h3>fruit Store</h3>
	<table>
		<tr>
			<th>Name</th>
			<th>Price</th>
		</tr>
		<c:forEach var="fruit" items="${fruits}">
			<tr>
				<td>${fruit.name}</td>
				<td>${fruit.price}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
