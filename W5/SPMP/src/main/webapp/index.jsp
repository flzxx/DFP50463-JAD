<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String username = (String) session.getAttribute("pengguna");
    Boolean loggedin = (Boolean) session.getAttribute("sudahLogin");
    
    if(loggedin == null || !loggedin){
    	response.sendRedirect("login.jsp");
    }
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SPMP | landing page</title>
</head>
<body>
<h1>Selamat datang::<%= username %></h1>
<a href="LogOutServlet">Logout</a>
</body>
</html>