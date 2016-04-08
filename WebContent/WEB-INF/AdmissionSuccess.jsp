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
			<td>name</td><td>${studentCustom.name}</td>
		</tr>
		<tr>
			<td>hobby</td><td>${studentCustom.hobby}</td>
		</tr>
		<tr>
			<td>Mobile</td><td>${studentCustom.mobile}</td>
		</tr>
		<tr>
			<td>Date of Birth</td><td>${studentCustom.dob}</td>
		</tr>
		<tr>
			<td>Student's skills set:</td><td>${studentCustom.studentSkills}</td>
		</tr>
		<tr>
			<td>Student's Address</td>
		</tr>
		<tr>
			<td>country</td><td> ${studentCustom.address.country}</td>
			<td>city</td><td> ${studentCustom.address.city}</td>
			<td>street</td><td> ${studentCustom.address.street}</td>
			<td>pincode</td><td> ${studentCustom.address.pincode}</td>
		</tr>
	</table>
</body>
</html>