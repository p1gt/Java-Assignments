<%--
  Created by IntelliJ IDEA.
  User: odayi
  Date: 7/19/2023
  Time: 4:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<html>
<head>
	<title>add a book</title>
	<link rel="stylesheet" href="/CSS/style.css">
</head>
<body>
<h1>New burger</h1>
<form:form action="/burgers/new" method="post" modelAttribute="burger">
	<p>
		<form:label path="burgerName">burger name:</form:label>
		<form:errors path="burgerName"/>
		<form:input path="burgerName"/>
	</p>
	<p>
		<form:label path="restaurantName">restaurant name:</form:label>
		<form:errors path="restaurantName"/>
		<form:input path="restaurantName"/>
	</p>
	<p>
		<form:label path="rating">rating (out of 5)</form:label>
		<form:errors path="rating"/>
		<form:input type="number" path="rating"/>
	</p>
	<p>
		<form:label path="note">notes:</form:label>
		<form:errors path="note"/>
		<form:textarea type="note" path="note"/>
	</p>
	<input type="submit" value="Submit"/>
</form:form>
</body>
</html>
