<%--
  Created by IntelliJ IDEA.
  User: odayi
  Date: 7/24/2023
  Time: 11:02 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<html>
<head>
	<title>add celebrity</title>
	<link rel="stylesheet" href="/style.css">
</head>
<body>
<h1>new celebrity page</h1>
<a href="/">home</a>
<form:form action="/celebrity/new" method="post" modelAttribute="celebrity">
	<input type="hidden" name="manager" value="${currentUser.id}"/>
	<form:label path="name">name:</form:label>
	<form:input path="name"/>
	<form:errors path="name"/>
	<form:label path="details">details:</form:label>
	<form:input path="details"/>
	<form:errors path="details"/>
	<br/>
	<input type="submit" value="add celebrity"/>
</form:form>
</body>
</html>
