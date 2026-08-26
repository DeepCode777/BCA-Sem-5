<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP Registration</title>
</head>
<body>
	<div align="center">
		<h1>Registration Form</h1>
		
		<form action="SaveRecords.jsp" method="Post">
			<div>
				<label>Name : </label>
				<input type="text" name="name">
			</div>
			<div>
				<label>Email : </label>
				<input type="text" name="email">
			</div>
			<div>
				<label>Password : </label>
				<input type="password" name="password">
			</div>
			
			<div>
				<button type="submit">Submit</button>
			</div>
		</form>
		<a href="Display.jsp">View Records</a>
	</div>
</body>
</html>