<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="Menu.jsp" %>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
    .center {
        text-align: center;
    }
</style>
</head>
<body>
<div class="center">
	<table border="1" cellspacing="0">
	<tr>
	    <th>id</th>
	    <th>name</th>
	    <th>course</th>
	    <th>email</th>
	    <th>mobile</th>
	    <th>Action</th>
	    <th>Action</th>
	</tr>
	<%
	try {
	    ResultSet result = (ResultSet)request.getAttribute("res");
	    while (result.next()) {
	%>
	    <tr>
	        <td><%= result.getString(1) %></td>
	        <td><%= result.getString(2) %></td>
	        <td><%= result.getString(3) %></td>
	        <td><%= result.getString(4) %></td>
	        <td><%= result.getString(5) %></td>
	        <td><a href="delete?email=<%=result.getString(4) %>">delete</a></td>
	        <td><a href="update?email=<%=result.getString(4)%>&mobile=<%=result.getString(5)%>">update</a></td>
	    </tr>
	<%
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	}
	%>
	</table>
	</div>
	<br><br>
	<a href="logout">
	<input type="submit" value="logout"/>
	</a>
	<%
	if(request.getAttribute("msg")!=null){
		out.println(request.getAttribute("msg"));
	}
	%>
	

</body>
</html>
