<%--
  Created by IntelliJ IDEA.
  User: odayi
  Date: 7/24/2023
  Time: 1:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<html>
<head>
	<title>followers</title>
</head>
<body>
<c:forEach var="follower" items="${followers}">
	test
	<p><c:out value="${follower.userName}"/> - <c:out value="${follower.email}"/></p>
</c:forEach>
</body>
</html>
