<%@page import="java.util.logging.ErrorManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String username;
String password;
String errorMessages = "";

username = request.getParameter("name");
password = request.getParameter("katalaluan");

if ("mj".equals(username) && "mjpmu".equals(password)) {
	HttpSession sesi2 = request.getSession();
	sesi2.setAttribute("pengguna", username);
	sesi2.setAttribute("sudahLogin", true);
	response.sendRedirect("index.jsp");

} else {
	errorMessages = "Invalid username or password";
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SPMP | Authentication</title>
</head>
<body>
	<%
	if (errorMessages != "") {
	%>
	<p><%=errorMessages%></p>
	<%
	}
	%>
	<a href="login.jsp">Try Login Again</a>
</body>
</html>