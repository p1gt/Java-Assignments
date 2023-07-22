<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login and Registration</title>
</head>
<body>
<h1>Welcome!</h1>
<h3>Join our growing community</h3>
<form:form action="/register" method="post" modelAttribute="newUser">
    <h2>Registration</h2>
    <form:label path="userName">User Name:</form:label>
    <form:errors path="userName" style="color:red;"/>
    <form:input path="userName" class="form-control"/>
    
    <form:label path="email">Email:</form:label>
    <form:errors path="email" style="color:red;"/>
    <form:input type="email" path="email" class="form-control"/>
    
    <form:label path="password">Password:</form:label>
    <form:errors path="password" style="color:red;"/>
    <form:input type="password" path="password" class="form-control"/>
    
    <form:label path="confirm">Confirm PW:</form:label>
    <form:errors path="confirm" style="color:red;"/>
    <form:input type="password" path="confirm" class="form-control"/>
    
    <input id="button" type="submit" value="Submit" class="btn btn-primary"/>
</form:form>

<form:form action="/login" method="post" modelAttribute="newLogin">
    <h2>Login</h2>
    <form:label path="email">Email:</form:label>
    <form:errors path="email" style="color:red;"/>
    <form:input type="email" path="email" class="form-control"/>
    
    <form:label path="password">Password:</form:label>
    <form:errors path="password" style="color:red;"/>
    <form:input type="password" path="password" class="form-control"/>
    
    <input id="button" type="submit" value="Submit" class="btn btn-primary"/>
</form:form>
</body>
</html>
