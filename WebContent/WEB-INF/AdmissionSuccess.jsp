<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${headerMessage}</title>
</head>
<body>
${msg}

<table>
		<tr>
			<td>name</td><td>${student1.name}</td>
		</tr>
		<tr>
			<td>hobby</td><td>${student1.hobby}</td>
		</tr>
		<tr>
			<td>Mobile</td><td>${student1.mobile}</td>
		</tr>
		<tr>
			<td>Date of Birth</td><td>${student1.dob}</td>
		</tr>
		<tr>
			<td>Student's skills set:</td><td>${student1.studentSkills}</td>
		</tr>
		<tr>
			<td>Student's Address</td>
		</tr>
		<tr>
			<td>country</td><td> ${student1.address.country}</td>
			<td>city</td><td> ${student1.address.city}</td>
			<td>street</td><td> ${student1.address.street}</td>
			<td>pincode</td><td> ${student1.address.pincode}</td>
		</tr>
	</table>
</body>
</html>