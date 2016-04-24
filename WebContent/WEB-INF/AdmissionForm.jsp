<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${headerMessage}</title>
</head>
<body>
AdmissionForm

<form:errors path="student1.*"/>

<form action="/FirstSpringMVCProject_07/submitAdmissionForm.html" method="post">
	<!--<p>name <input type="text" name="studentName"></p>
	<p>hobby <input type="text" name="studentHobby"></p>-->
	<table>
		<tr>
			<td>name</td><td> <input type="text" name="name"></td>
		</tr>
		<tr>
			<td>hobby</td><td> <input type="text" name="hobby"></td>
		</tr>
		<tr>
			<td>Mobile</td><td> <input type="text" name="mobile"></td>
		</tr>
		<tr>
			<td>Date of Birth</td><td> <input type="text" name="dob"></td>
		</tr>
		<tr>
			<td>Student's skills set:</td><td> <select name="studentSkills" multiple>
									<option value="Core Java">Core Java</option>
									<option value="Spring Core">Spring Java</option>
									<option value="Spring MVC">Spring MVC</option>
								</select></td>
		</tr>
		<tr>
			<td>Student's Address</td>
		</tr>
		<tr>
			<td>country</td><td> <input type="text" name="address.country"></td>
			<td>city</td><td> <input type="text" name="address.city"></td>
			<td>street</td><td> <input type="text" name="address.street"></td>
			<td>pincode</td><td> <input type="text" name="address.pincode"></td>
		</tr>
	</table>
	
	<input type="submit" value="Submit Form"/>
</form>
</body>
</html>