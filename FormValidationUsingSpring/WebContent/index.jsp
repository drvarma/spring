<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Account creation</title>
</head>
<body>
	 <%-- <form:form method="post" action="/submit" commandName="user">
		<table>
			<tr>
				<td>Name: <font color="red"><form:errors path="name" /></font></td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td>Age: <font color="red"><form:errors path="age" /></font></td>
				<td><form:input path="age" /></td>
			</tr>
			<tr>
				<td>Email: <font color="red"><form:errors path="email" /></font></td>
				<td><form:input path="email" /></td>
			</tr>
			<tr>
				<td>Phone Number: <font color="red"><form:errors
							path="phone" /></font></td>
				<td><form:input path="phone" /></td>
			</tr>
			<tr>
				<td>Gender: <font color="red"><form:errors path="gender" /></font></td>
				<td><form:select path="gender">
						<form:option value="">Select Gender</form:option>
						<form:option value="Male">Male</form:option>
						<form:option value="Female">Female</form:option>
					</form:select></td>
			</tr>
			<tr>
				<td>DOB: <font color="red"><form:errors path="dob" /></font></td>
				<td><form:input path="dob" /></td>
			</tr>
			<tr>
				<td />
				<td><input type="submit" name="submit"></td>
			</tr>
		</table>
	</form:form> 
 
 	<form:errors path="user.*"/> --%>
	 <form action="/FormValidationUsingSpring/Submit" method="post">
		<table>
			<tr>
				<td>Name:</td>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td>Age:</td>
				<td><input type="number" name="age" /></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="text" name="email" /></td>
			</tr>
			<tr>
				<td>Phone:</td>
				<td><input type="number" name="phone" /></td>
			</tr>
			<tr>
				<td>Gender:</td>
				<td><select name="gender">
					<option value="">Select Gender</option>
					<option value="male">Male</option>
					<option value="female">Female</option>
				</select></td>
			</tr>
			<tr>
				<td>DOB:</td>
				<td><input type="text" placeholder="MM/DD/YYYY"/></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="submit" /></td>
			</tr>
		</table>
	</form>
</body>
</html>