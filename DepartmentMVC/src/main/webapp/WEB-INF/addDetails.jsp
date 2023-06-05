<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Department Details</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl"
	crossorigin="anonymous">
<link rel="stylesheet" href="/resources/css/style.css">
</head>
<body>
	<form action="addDepartment" method="post">
		<div id="img"
			class="bg-image p-5 text-center shadow-1-strong rounded mb-5 needs-validation"
			style="background-image: url('https://mdbootstrap.com/img/new/standard/city/047.jpg'); height: 100vh; background-repeat: no-repeat; background-size: cover;">
			<div class="container">

				<div class="row g-3">
					<div class="col-sm-4">
						<label for="deptname" class="form-label">Department Name</label>
					</div>
					<div class="col-md-5 offset-1">
						<input type="text" class="form-control" name="departmentName"
							id="deptname" placeholder="Department" required><span
							id="deptMsg"></span>
					</div>
					<div class="invalid-feedback">You must Enter Department Name
						Before submitting.</div>
				</div>
				<div class="row g-3">
					<pre></pre>
				</div>
				<div class="row g-3">
					<div class="col-sm-4">
						<label for="strength" class="form-label">Department
							Strength</label>
					</div>
					<div class="col-md-5 offset-1">
						<input type="number" class="form-control" name="totalStrength"
							id="strength" placeholder="total strength" required><span
							id="strengthMsg"></span>
					</div>
					<div class="invalid-feedback">You must enter total strength
						before submitting.</div>
				</div>
				<div class="row g-3">
					<pre></pre>
				</div>
				<div class="row">
					<div class="col-12">
						<button type="submit" id="btn" class="btn btn-primary">Submit</button>
					</div>
				</div>
				<div class="row g-3">
					<pre></pre>
				</div>
				<div class="row g-3">
					<pre></pre>
				</div>
				<div class="row g-3">
					<pre></pre>
				</div>
				<div class="row g-3">
					<pre></pre>
				</div>
				<div class="row g-3">
					<pre></pre>
				</div>
				<div class="row g-3">
					<pre></pre>
				</div>
				<div class="row g-3">
					<pre></pre>
				</div>
				<div class="row g-3">
					<pre></pre>
				</div>
				<div class="row g-3">
					<pre></pre>
				</div>
				<div class="row g-3">
				<div class="col-sm-4">
					<canvas id="canvas"></canvas>
					</div>
					<div class="col-sm-4"></div>
					<div class="col-sm-4">
					<canvas id="myCanvas" >
						</canvas>
						</div>
				</div>
			</div>
		</div>
		<script src="https://code.jquery.com/jquery-3.5.1.js"
			integrity="sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc="
			crossorigin="anonymous"></script>
		<script
			src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
		<script src="https://code.jquery.com/ui/1.11.1/jquery-ui.js"></script>
		<script src="/resources/js/app.js"></script>
		<script
			src="https://cdnjs.cloudflare.com/ajax/libs/canvasjs/1.7.0/jquery.canvasjs.js"></script>
	</form>
</body>
</html>