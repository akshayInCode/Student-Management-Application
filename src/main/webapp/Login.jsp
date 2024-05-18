<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LOGIN PAGE</title>
</head>
<body>
	<h2>Enter the Login Details!</h2>
	<form action="LoginController" method="post"/>
	<table>
	<tr>
	<td>Username</td>
	<td><input type="text" name="username" required placeholder="Enter username here"/></td>
	</tr>
	<tr>
	<td>Password</td>
	<td><input type="password" name="password" required placeholder="Enter password here"/></td>
	</tr>
	<tr>
	<td><input type="submit" value="login"/></td>
	</tr>
	</table>
	</form>
	
	<a href="index.jsp"><input type="submit" value="Home"/></a>
	<%
		if(request.getAttribute("msg")!= null){
			out.println(request.getAttribute("msg"));
			
		}
	%>
</body>
</html>