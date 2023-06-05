$(document).ready(function() {
	$("#btn").on("click", function() {
		var deptId = $('#idSelect').val();
		$.ajax({
			type: 'GET',
			url: '/showEmployeesByDeptName/' + deptId,
			data:{},
			dataType:'json',
			success: function(data) {
				var s = '<tr><th>NAME</th><th>GENDER</th><th>SKILLS</th></tr>';
				for (var i = 0; i < data.length; i++) {
					s += '<tr><td>' + data[i].employeeName + '</td><td>' + data[i].gender + '</td><td>' + data[i].skills + '</td></tr>';
				}
				$('#employee').html(s);
			}
		});
	});
});