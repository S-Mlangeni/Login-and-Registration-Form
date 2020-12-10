<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>2nd Page</title>
</head>
<body>
	
	<% 
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
	
	if (session.getAttribute("storedusername")==null) {
		response.sendRedirect("index.jsp");
	}
	
	%>
	
	<h1>Welcome to the 2nd Page ${storedusername}!</h1>
	<a href="page1.jsp">Previous Page</a>
	<form action="Out">
		<input type="submit" value="Logout" />
	</form>

</body>
</html>