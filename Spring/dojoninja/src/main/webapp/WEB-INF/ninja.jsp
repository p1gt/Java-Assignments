<%--
  Created by IntelliJ IDEA.
  User: odayi
  Date: 7/22/2023
  Time: 2:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<html>
<head>
	<link rel="stylesheet" href="/CSS/style.css">
	<title>add ninja</title>
</head>
<body>
<form:form action="/ninja" method="post" modelAttribute="ninja">
	<form:label path="firstName">First Name</form:label>
	<form:input path="firstName" placeholder="First Name"/>
	<form:errors path="firstName" cssClass="error"/>
	
	<form:label path="lastName">Last Name</form:label>
	<form:input path="lastName" placeholder="Last Name"/>
	<form:errors path="lastName" cssClass="error"/>
	
	<form:label path="age">Age</form:label>
	<form:input path="age" placeholder="Age"/>
	<form:errors path="age" cssClass="error"/>
	
	<form:label path="dojo">Dojo</form:label>
	<form:select path="dojo">
		<form:option value="0" label="Select a Dojo"/>
		<form:options items="${dojos}" itemValue="id" itemLabel="name"/>
	</form:select>
	
	<input type="submit" value="Add Ninja">
</form:form>
</body>
</html>
