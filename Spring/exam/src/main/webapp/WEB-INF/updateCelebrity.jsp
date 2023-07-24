<%--
  Created by IntelliJ IDEA.
  User: odayi
  Date: 7/24/2023
  Time: 12:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<html>
<head>
	<title>edit ${celebrity.name}</title>
	<link rel="stylesheet" href="/style.css">
</head>
<body>
<h1>edit ${celebrity.name}</h1>
<a href="/">home</a>
<form:form action="/celebrity/${celebrity.id}/update" method="post" modelAttribute="celebrity">
	<input type="hidden" name="manager" value="${currentUser.id}"/>
	<form:label path="name">name:</form:label>
	<form:input path="name"/>
	<form:errors path="name"/>
	<form:label path="details">details:</form:label>
	<form:input path="details"/>
	<form:errors path="details"/>
	<input type="submit" value="update celebrity"/>
</form:form>
</body>
</html>
