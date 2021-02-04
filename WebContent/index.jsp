<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" href="./makeup.css" type="text/css"/>
</head>
<body>
	<div class="main">
		<div class="content">
			<h1>Login</h1>
			<form action="Survyy" method="post"> <!--unlike "get" method, "post" method hides submitted data from the url on the browser-->
				<input type="text" name="username" placeholder="first name"/><br/>
				<input type="password" name="userpass" placeholder="password"/> <br/>
				<input type="submit" name="logbutton" value="Login" />
				<p style="color:red" >${message}</p>
			</form>
			<p>Don't have an account? <a href="Registration.jsp">Register Now</a></p>
		</div>
	</div>
	
</body>
</html>