<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cafe Board | Process</title>
</head>
<body>
<%
String validUser = "root";
String validPass = "pass";

String username = request.getParameter("username");
String password = request.getParameter("password");

if(username.equals(validUser) && password.equals(validPass)){
	session.setAttribute("name", username);
	response.sendRedirect("index.jsp");
} else if(username.equals("student") && password.equals("katalaluan")){
	session.setAttribute("name", username);
	response.sendRedirect("index.jsp");
} else{
	response.sendRedirect("error.jsp");
}

%>
</body>
</html>