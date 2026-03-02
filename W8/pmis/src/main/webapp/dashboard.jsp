<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PMIS | Dashboard</title>
</head>
<%
String user = (String) session.getAttribute("namapengguna");
String rolename = (String) session.getAttribute("peranan");
%>
<body>
<h2> Selamat Datang <%= user %>(<%= rolename %>) </h2>
</body>
</html>