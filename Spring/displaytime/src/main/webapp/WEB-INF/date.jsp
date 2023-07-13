<%--
  Created by IntelliJ IDEA.
  User: odayi
  Date: 7/13/2023
  Time: 4:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.Date"%>
<%@ page import="java.text.DateFormat"%>
<%@ page import="java.text.SimpleDateFormat"%>

<html>
<head>
    <link rel="stylesheet" href="/CSS/style.css">
    <title>date</title>
</head>
<body onload="alert('this is the date template')">
<%
    DateFormat dateFormat = new SimpleDateFormat("EEEE, MMMM d, yyyy, h:mm a");
    Date date = new Date();
    String formattedDate = dateFormat.format(date);
%>
<p><%= formattedDate %></p>
</body>
</html>