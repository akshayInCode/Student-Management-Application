<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="Menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="savereg" method="post">
	<table>
	<tr>
	<td></td>
	<td><input type="hidden" name="id" value="0" required placeholder="Enter id here"/></td>
	</tr>
	
	<tr>
	<td>Name</td>
	<td><input type="text" name="name" required placeholder="Enter name here"/></td>
	</tr>
	
	<tr>
	<td>Course</td>
	<td><input type="text" name="course" required placeholder="Enter course here"/></td>
	</tr>
	
	<tr>
	<td>Email</td>
	<td><input type="text" name="email" required placeholder="Enter email here"/></td>
	</tr>
	<tr>
	<td>Mobile</td>
	<td><input type="text" name="mobile" required placeholder="Enter mobile here"/></td>
	</tr>
	<tr>
	<td><input type="submit" value="save"/></td>
	</tr>
	</table>
	</form>
	<%
	if(request.getAttribute("msg")!=null){
		out.println(request.getAttribute("msg"));
	}
	%>
</body>
</html>