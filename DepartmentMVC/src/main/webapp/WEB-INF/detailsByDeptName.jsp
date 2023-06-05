<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Department Name</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl"
	crossorigin="anonymous">
<link rel="stylesheet" href="/resources/css/employeestyle.css">

</head>
<body>
	<div class="bg-image p-5 shadow-1-strong rounded mb-5"
		style="background-image: url('https://mdbootstrap.com/img/new/fluid/nature/045.jpg'); height: 100vh;">
		<div class="container">
			<div class="row g-3">
				<div class="col-sm-4">
					<label for="deptname" class="form-label">Department Name</label>
				</div>
				<div class="col-md-5 offset-1">
					<div class="dropdown">
						<select class="form-select" id="idSelect" name="department">
							<option>Select Department</option>
							<c:forEach items="${departmentNames}" var="name">
								<option value="${name.departmentId}">${name.departmentName}</option>
							</c:forEach>

						</select>
					</div>
				</div>
			</div>
			<div class="row g-3">
				<pre></pre>
			</div>
			<div class="row">
				<div class="col-12">
					<button type="submit" id="btn" class="btn btn-primary text-center">Submit</button>
				</div>
			</div>
			<div class="row g-3">
				<pre></pre>
			</div>
			<table id="employee" class="table">
			</table>
			<script
	src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.6.0/dist/umd/popper.min.js"
	integrity="sha384-KsvD1yqQ1/1+IA7gi3P0tyJcT3vR+NdBTt13hSJ2lnve8agRGXTTyNaBYmCR/Nwi"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.min.js"
	integrity="sha384-nsg8ua9HAw1y0W1btsyWgBklPnCUAFLuTMS2G72MMONqmOymq585AcH49TLBQObG"
	crossorigin="anonymous"></script>
<script src="https://code.jquery.com/jquery-3.5.1.js"
	integrity="sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc="
	crossorigin="anonymous"></script>
	<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.0/jquery.validate.min.js"></script>
	<script src="/resources/js/detailsByDeptNames.js"></script>
</body>
</html>