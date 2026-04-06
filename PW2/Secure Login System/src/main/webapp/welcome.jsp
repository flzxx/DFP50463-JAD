<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DASHBOARD</title>
</head>
<%
String user = (String) session.getAttribute("username");
String rolename = (String) session.getAttribute("role");
%>
<body>
<h2 style="text-transform: uppercase;">Welcome back, <%= user %>!</h2>

<a href="login.jsp">Logout</a>
</body>
</html>