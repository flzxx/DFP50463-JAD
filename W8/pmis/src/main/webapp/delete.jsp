<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
Class.forName("com.mysql.cj.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pmis", "root", "");
%>
<html>
<head>
<meta charset="UTF-8">
<title>PMIS | DELETE</title>
</head>
<body>
<%
String msg = request.getParameter("msg");
if (msg !=null){
%>

<p style="color: RED;	"><%= msg %></p>
<%
}
%>

	<table border="1">
		<tr>
			<th>ID</th>
			<th>Firstname</th>
			<th>Lastname</th>
			<th>Username</th>
			<th>Role</th>
			<th>Action</th>
			
		</tr>
		<tr>
			<%
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt
					.executeQuery("SELECT * FROM users join roles on users.role_id=roles.id");
			while (rs.next()) {
			%>
		
		<tr>
			<td><%=rs.getInt("id")%></td>
			<td><%=rs.getString("firstname")%></td>
			<td><%=rs.getString("lastname")%></td>
			<td><%=rs.getString("username")%></td>
			<td><%=rs.getString("role_name")%></td>
			<td><a href="delete_user.jsp?id=<%= rs.getInt("id") %>">Delete</a></td>
			
		 </tr>
		  <%
		  }
		  %>

	</table>
</body>
</html>