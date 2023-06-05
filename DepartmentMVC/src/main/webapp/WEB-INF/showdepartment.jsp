<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Details</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl"
	crossorigin="anonymous">
</head>
<body>
	<h3>Department Details</h3>
	<div class="body" align="center">

		<table class="table table-success table-striped">
			<tr>
				<th align="left"><pre>NAME	</pre></th>
				<th align="left"><pre>STRENGTH	</pre></th>
			</tr>
			<c:forEach items="${details}" var="dept">
				<tr>
					<td align="left">${dept.departmentName}</td>
					<td align="left">${dept.totalStrength}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<h3>
		Back to Home Page <a href='/Dept/Home'>back</a>
	</h3>
	<script src="https://code.jquery.com/jquery-3.5.1.js"
		integrity="sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc="
		crossorigin="anonymous"></script>
</body>
</html>