<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cafe Board | Login</title>
</head>
<body>
<h2>Login</h2>
<form action="processLogin.jsp" method="post">
<label>Username</label><br>
<input type = "text" name="username" required><br/><br/>
<label>Password</label><br>
<input type = "password" name="password" required><br/><br/>
<button type = "submit">Login</button>
</form>
</body>
</html>