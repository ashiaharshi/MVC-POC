<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><%@ taglib
	prefix="form" uri="http://www.springframework.org/tags/form"%><%@ taglib
	prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl"
	crossorigin="anonymous">

<link rel="stylesheet" href="/resources/css/style.css">
</head>
<body>
	<div class="container">
		<form:form action="/Dept/updatedList" method="post"
			modelAttribute="details">
			<form:hidden value="${details.departmentName}" path="departmentName"/>
			<form:hidden value="${details.departmentId}" path="departmentId"/>
			<div class="row">
				<div class="col-sm-4">
					<form:label for="strength" path="totalStrength" class="form-label">Department
						Strength</form:label>
				</div>
				<div class="col-md-5 offset-1">
					<form:input type="number" class="form-control" path="totalStrength"
						value="${details.totalStrength}" id="strength" placeholder="total strength"/>
				</div>
			</div>

			<div class="row">
				<div class="col-12" style="align-content: center;">
					<button type="submit" class="btn btn-primary">Update</button>
				</div>
			</div>
		</form:form>
	</div>
	<script src="https://code.jquery.com/jquery-3.5.1.js"
		integrity="sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc="
		crossorigin="anonymous"></script>
	<script src="/resources/js/app.js"></script>
</body>
</html>