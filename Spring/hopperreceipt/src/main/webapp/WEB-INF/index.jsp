<%--
  Created by IntelliJ IDEA.
  User: odayi
  Date: 7/13/2023
  Time: 1:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!-- New line below to use the JSP Standard Tag Library -->
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>customer name: <c:out value="${name}"/></h1>
    <h3>item name: <c:out value="${itemName}"/></h3>
    <h3>price: <c:out value="${price}"/></h3>
    <h3>description <c:out value="${description}"/></h3>
    <h3>vendor:<c:out value="${vendor}"/></h3>
</body>
</html>