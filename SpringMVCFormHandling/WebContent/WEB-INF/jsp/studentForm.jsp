<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Form</title>
</head>
<body>
<form action="/SpringMVCFormHandling/StudentDetails" method="post">
<table>
<tr>
<td>Name:</td>
<td><input type="text" name="studentName"/></td>
</tr>
<tr>
<td>Age:</td>
<td><input type="text" name="studentAge"/></td>
</tr>
<tr>
<td>ID:</td>
<td><input type="text" name="studentId"/></td>
</tr>
<tr>
<td/>
<td><input type="submit" value="submit"/></td>
</tr>
</table>
</form>
</body>
</html>