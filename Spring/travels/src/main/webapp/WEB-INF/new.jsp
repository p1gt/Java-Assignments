<%--
  Created by IntelliJ IDEA.
  User: odayi
  Date: 7/20/2023
  Time: 2:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<html>
<head>
	<title>add expense</title>
	<link rel="stylesheet" href="/CSS/style.css">
</head>
<body>
<h1>add expense</h1>
<form:form method="post" action="/expenses/new" modelAttribute="expense">
	<form:label path="name">name</form:label>
	<form:input path="name" placeholder="name"/>
	<form:errors path="name" cssClass="error"/>
	<br/>
	<form:label path="vendor">vendor</form:label>
	<form:input path="vendor" placeholder="vendor"/>
	<form:errors path="vendor" cssClass="error"/>
	<br/>
	<form:label path="amount">amount</form:label>
	<form:input path="amount" placeholder="amount"/>
	<form:errors path="amount" cssClass="error"/>
	<br/>
	<form:label path="description">description</form:label>
	<form:input path="description" placeholder="description"/>
	<form:errors path="description" cssClass="error"/>
	<input type="submit" value="add expense"/>
</form:form>
</body>
</html>
