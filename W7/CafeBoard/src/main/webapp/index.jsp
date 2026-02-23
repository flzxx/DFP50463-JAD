<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cafe Board | Home</title>
</head>
<body>
<%
/*String user = request.getParameter("user");
if(user==null ){
	user = "Guest";
}else {
	user = "Admin";
}*/
//1. print your name
//2. print guest atau admin
%>
<%
String name = (String) session.getAttribute("name");
String role;
if (name.equals( "student")){
	role="Guest";
} else{
	role = "Administrator";
}
%>
<%= name %> is a <%=role %>
</body>
</html>