<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/Spring_ModelAttribute/Submit" method="post">
	Name: <input type="text" name="studentName"/><br/>
	<!-- Number: <input type="number" name="studentNumber"/><br/>
	Marks: <input type="text" pattern="\d*" name="studentMarks"/><br/> -->
	Number: <input type="text" name="studentNumber"/><br/>
	Marks: <input type="text" name="studentMarks"/><br/>
	<input type="submit" value="submit"/><br/>
	
	</form>
</body>
</html>