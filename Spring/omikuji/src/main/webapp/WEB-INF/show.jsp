<%--
  Created by IntelliJ IDEA.
  User: odayi
  Date: 7/16/2023
  Time: 3:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
	<style>
        * {
            font-family: cursive;
            text-align: center;
	        margin: 0 auto;
        }
        body {
	        width: 400px;
        }
	</style>
	<title>omikuji</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
	<link rel="stylesheet" href="style.css">
</head>
<body>
	<h1>here's your omikuji</h1>
	<br>
	<br>
	<div>
		<h1>
			in <c:out value="${number}"/>, you will live in <c:out value="${city}"/> with <c:out value="${name}"/> as your roommate, <c:out value="${profession}"/> for a living. the next time you see a <c:out value="${creature}"/>, you will have good luck. also, <c:out value="${nice}"/>.
		</h1>
	</div>
	<a href="/omikuji"></a>
</body>
</html>
