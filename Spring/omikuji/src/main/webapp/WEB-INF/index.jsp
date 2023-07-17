<%--suppress ALL --%>
<%--suppress JspAbsolutePathInspection --%>
<%--
  Created by IntelliJ IDEA.
  User: odayi
  Date: 7/16/2023
  Time: 1:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<title>Send an Omikuji</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!-- Bootstrap Stylesheet -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
	<link rel="stylesheet" href="style.css">
</head>
<body>
<div class="container mt-5">
	<h1 class="text-center mb-5">Send an Omikuji!</h1>
	<form action="/omikuji/process" method="POST">
		<div class="form-group">
			<label for="number">Pick any number from 5 to 25:</label>
			<input type="number" class="form-control" id="number" name="number" required>
		</div>
		<div class="form-group">
			<label for="city">Enter the name of any city:</label>
			<input type="text" class="form-control" id="city" name="city" required>
		</div>
		<div class="form-group">
			<label for="name">Enter the name of any real person:</label>
			<input type="text" class="form-control" id="name" name="name" required>
		</div>
		<div class="form-group">
			<label for="professional">Enter the professional endeavor or hobby:</label>
			<input type="text" class="form-control" id="profession" name="profession" required>
		</div>
		<div class="form-group">
			<label for="creature">Enter any type of living thing:</label>
			<input type="text" class="form-control" id="creature" name="creature" required>
		</div>
		<div class="form-group">
			<label for="nice">Say something nice to someone:</label>
			<input type="text" class="form-control" id="nice" name="nice" required>
		</div>
		<button type="submit" class="btn btn-primary mt-3">Submit</button>
	</form>
</div>
<!-- Bootstrap JavaScript -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>