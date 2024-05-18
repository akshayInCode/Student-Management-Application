<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>STUDENT MANAGEMENT SYSTEM</title>
<style>
    body {
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
        margin: 0;
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        background-color: #eef2f3;
    }
    .container {
        text-align: center;
        padding: 40px;
        border: 2px solid #ccc;
        border-radius: 10px;
        background-color: #ffffff;
        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
    }
    h1 {
        color: #333;
        font-size: 36px;
        margin-bottom: 10px;
    }
    h2 {
        color: #555;
        font-size: 24px;
        margin-bottom: 30px;
    }
    .btn-large {
        width: 150px;
        height: 50px;
        font-size: 18px;
        margin: 10px;
        color: #fff;
        background-color: #007bff;
        border: none;
        border-radius: 5px;
        cursor: pointer;
        transition: background-color 0.3s ease;
    }
    .btn-large:hover {
        background-color: #0056b3;
    }
</style>
</head>
<body>
<div class="container">
    <h1>STUDENT MANAGEMENT SYSTEM</h1>
    <h2>Welcome to all</h2>
    <a href="Signup.jsp"><input type="button" value="Signup" class="btn-large"/></a>
    <a href="Login.jsp"><input type="button" value="Login" class="btn-large"/></a>
</div>
</body>
</html>
