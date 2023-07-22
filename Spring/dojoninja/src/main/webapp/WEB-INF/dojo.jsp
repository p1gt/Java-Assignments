<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<html>
<head>
	<link rel="stylesheet" href="/CSS/style.css">
	<title>Title</title>
</head>
<body>
<h1>new dojo</h1>
<form:form action="/dojo" method="post" modelAttribute="dojo">
	<form:label path="name" label="name"/>
	<form:input path="name" placeholder="name"/>
	<form:errors path="name" cssClass="error"/>
	<input type="submit" value="add"/>
</form:form>
</body>
</html>
