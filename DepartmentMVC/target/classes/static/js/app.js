$(document).ready(function() {

	const canvas = document.getElementById('canvas');
	const ctx = canvas.getContext('2d');

	ctx.strokeStyle = 'red';
	ctx.fillStyle = 'rgb(255,0,0,0.5)';
	ctx.lineWidth = 5;

	ctx.beginPath();
	ctx.arc(150, 70, 60, 80, 0, 1.5 * Math.PI);
	ctx.stroke();
	ctx.fill();

	draw();
	function draw() {
		var context = document.getElementById('myCanvas').getContext("2d");
		var img = new Image();
		img.src = "/resources/pic/car.jpg";

		img.onload = function() {
			context.drawImage(img, 1, 1, 1000, 400, 5, 5, 200, 100);
		};
	}

	$("#canvas").click(function() {
		$("#myCanvas").hide("slide", { direction: "left" }, 2000);
	});

	$("#canvas").click(function() {
		$("#myCanvas").show("slide", { direction: "right" }, 2000);
	});

	$("#deptname").keyup(function() {
		if (validateName()) {
			$("#deptname").css("border", "1px solid black");
			$("#deptMsg").html("");
		}
		else {
			$("#deptname").css("border", "1px solid red");
			$("#deptMsg").html("<p class='text-danger'><b>Department name is Invalid</b></p>");
		}
	});

	$("#strength").keyup(function() {
		if (validateStrength()) {
			$("#strength").css("border", "1px solid black");
			$("#strengthMsg").html("");
		}
		else {
			$("#strength").css("border", "1px solid red");
			$("#strengthMsg").html("<p class='text-danger'><b>Invalid Strength for department</b></p>");
		}

	});
});
function validateName() {
	var name = $("#deptname").val();

	var reg_name = /^[A-Za-z ]{3,40}$/

	if (reg_name.test(name)) {
		return true;
	} else {
		return false;
	}
}
function validateStrength() {

	var validNum = $("#strength").val();

	if (validNum >= 100 && validNum <= 500) {
		return true;
	}
	else {
		return false;
	}

}