<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Department Details</title>
<link rel="stylesheet" href="/resources/css/welcomestyle.css">
</head>
<body>
	<div class="navbar">
			<a href="#home">Home</a>
			<div class="dropdown">
				<button class="dropbtn">
					Department <i class="fa fa-caret-down"></i>
				</button>
				<div class="dropdown-content">
					<div class="row">
						<div class="column">
							<a href="http://localhost:8055/Dept/Department">Add Department
								Details</a> <a href="http://localhost:8055/Dept/showDepartment">Show
								Department Details</a>
						</div>
					</div>
				</div>
			</div>

			<div class="dropdown">
				<button class="dropbtn">
					Employee <i class="fa fa-caret-down"></i>
				</button>
				<div class="dropdown-content">
					<div class="row">
						<div class="column">
							<a href="http://localhost:8055/Employees">Add Employee
								Details</a> <a href="http://localhost:8055/showEmployees">Show
								All Employee Details</a> <a
								href="http://localhost:8055/showDeptNames">Show Employee
								Details By DepartmentName</a>
						</div>
					</div>
				</div>
			</div>
			</div>
<!-- 			<div class="bg-image" -->
<!-- 		style="background-image: url('https://mdbootstrap.com/img/Photos/Others/images/77.jpg'); height: 100vh;"> -->
		<div class="parallax"></div>
		<div class="container-fluid">

			<h3 id="welcome" style="text-align: center;">Welcome to Department
				Association</h3>
			<h2 style="color: yellow">Vision</h2>
			<p style="color: white">To become an outstanding Technological
				University at the cutting edge of Science and Technology that
				produces world class Knowledge-delivery, Research, Extension and
				Leadership in Technology innovation for Industry and Society.</p>
			<h2 style="color: #ffbeca;">Mission</h2>
			<p style="color: white">To plan the development of technical
				education, to establish value-based and need-based education and
				training in engineering and technology, with a view to generate
				qualified and competent manpower, responsive to technological and
				societal needs.</p>
		</div>
<!-- 	</div> -->
<div class="parallax"></div>
<div style="height:100px;background-color: #fcdccc;font-size:25px">
This Application has Employee details assigned to a particular department.
Each Employee has attributes like name, gender, skills, and department.
Where each departments consists of department name and total strength.
</div>
<div class="parallax"></div>
	<div class="footer"><p style="text-align: center; color: white; background-color: black;">Copyright@Mindtree</p></div>
		<script src="https://code.jquery.com/jquery-3.5.1.js"
			integrity="sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc="
			crossorigin="anonymous"></script>
			<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
<script src="https://code.jquery.com/ui/1.11.1/jquery-ui.js"></script>
	<script src="/resources/js/welcomeapp.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</body>
</html>