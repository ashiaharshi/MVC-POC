<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl"
	crossorigin="anonymous">
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<h3 align="center">Employee Details</h3>
	<div class="body" align="center">
		<table class="table table-striped table-hover">
			<tr>
				<th align="left">NAME</th>
				<th align="left">GENDER</th>
				<th align="left">SKILLS</th>
				<th align="left">DEPARTMENT</th>
			</tr>
			<c:forEach items="${details}" var="emp">
				<tr>
					<td align="left">${emp.employeeName}</td>
					<td align="left">${emp.gender}</td>
					<td align="left">${emp.skills}</td>
					<td align="left">${emp.department.departmentName}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<h3>
		Back to Home Page <a href='/Home'>back</a>
	</h3>
	<script src="https://code.jquery.com/jquery-3.5.1.js"
		integrity="sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc="
		crossorigin="anonymous"></script>
	<script src="js/app.js"></script>
</body>
</html>