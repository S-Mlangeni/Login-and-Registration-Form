<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
<link rel="stylesheet" type="text/css" href="MakeUp.css" />
</head>
<body>
	<h1>Register</h1>
	<p>Provide your details below.</p>
	<form action="Reg" method="get"> <!--unlike "get" method, "post" method hides submitted data from the url on the browser-->
		<input type="text" name="regname" placeholder="first name"/><br/>
		<input type="text" name="regsurname" placeholder="last name"/><br/>
		<input type="text" name="regage" placeholder="age"/><br/>
		<input type="text" name="regemail" placeholder="email"/><br/>
		<input type="password" name="regpassword" placeholder="password"/> <br/>
		<input type="submit" name="regbutton" value="Register"/> <br/>
		<p>Already have an account? <a href="index.jsp">Login</a></p>
		
	</form>
</body>
</html>