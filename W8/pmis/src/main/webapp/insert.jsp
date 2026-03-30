<%@page import="java.sql.*"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PMIS | INSERT</title>
</head>
<%
Class.forName("com.mysql.cj.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pmis", "root", "");
Statement stmt = conn.createStatement();
ResultSet rsResultSet = stmt.executeQuery("SELECT * FROM roles");

String successString = request.getParameter("success");
%>
<body>
	<%
	if ("1".equals(successString)) {
	%>
	<script>
		alert("User Inserted Successfully");
	</script>
	<%
	}
	%>
	<form action="InsertProcess.jsp" method="post">
		<label>Username</label> <input type="text" name="username" required />
		<br /> <label>Password</label> <input type="password" name="password"
			required /> <br /> Role <select name="peranan">
			<%
			while (rsResultSet.next()) {
			%>
			<option value="<%=rsResultSet.getInt("id")%>">
				<%=rsResultSet.getString("role_name")%>
			</option>
			<%
			}
			%>
		</select>
		<button type="submit" value="submit">Insert Data</button>
	</form>
</body>
</html>