<%--
  Created by IntelliJ IDEA.
  User: odayi
  Date: 7/22/2023
  Time: 12:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<link rel="stylesheet" href="/CSS/style.css">
	<title>dashboard</title>
</head>
<body>
<h1>dashboard</h1>
<table>
	<tr>
		<th>dojo #</th>
		<th>dojo name</th>
		<th># of ninjas</th>
	</tr>
	<c:forEach items="${dojos}" var="dojo">
		<tr>
			<td><a href="dojo/${dojo.id}">${dojo.id}</a></td>
			<td>${dojo.name}</td>
			<td>${dojo.ninjas.size()}</td>
		</tr>
	</c:forEach>
</table>
<a href="/dojo">new dojo</a>
<a href="/ninja">new ninja</a>
</body>
</html>
