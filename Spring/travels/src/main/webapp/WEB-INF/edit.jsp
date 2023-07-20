<%--
  Created by IntelliJ IDEA.
  User: odayi
  Date: 7/20/2023
  Time: 4:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<html>
<head>
	<title>edit expense</title>
	<link rel="stylesheet" href="/CSS/style.css">
</head>
<body>
<h1>edit expense</h1>
<form:form modelAttribute="expense" method="post" action="/expenses/update">
	<form:hidden path="id" value="${expense.id}"/>
	<form:label path="name">expense</form:label>
	<form:input path="name"/>
	<form:errors path="name" cssClass="error"/>
	<br/>
	<form:label path="vendor">vendor</form:label>
	<form:input path="vendor"/>
	<form:errors path="vendor" cssClass="error"/>
	<br/>
	<form:label path="amount">amount</form:label>
	<form:input path="amount"/>
	<form:errors path="amount" cssClass="error"/>
	<br/>
	<form:label path="description">description</form:label>
	<form:input path="description"/>
	<form:errors path="description" cssClass="error"/>
	<br/>
	<button type="submit">update</button>
</form:form>
</body>
</html>
