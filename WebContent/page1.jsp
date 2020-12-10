<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>1st Page</title>
</head>
<body>
	
	<% 
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); /*This is to prevent accessing page when
	pressing the back button in browser after logging out*/ 
	
	if (session.getAttribute("storedusername")==null) {
		response.sendRedirect("index.jsp");
	}
	
	%>
	<h1>Welcome to the 1st Page ${storedusername}!</h1> <!-- The dollar and curly-bracket symbols are JSTL symbols/tags -->
	<a href="page2.jsp">Next Page</a>
	<form action="Out">
		<input type="submit" value="Logout" />
	</form>

</body>
</html>