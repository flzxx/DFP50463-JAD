<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LOGIN</title>
</head>
<body>
<form action ="LoginServlet" method="post">
<label>Username</label>
<input type="text" name="username" required>
<br/>
<label>Password</label>
<input type="password" name="password" required>
<button type="submit">Login</button>
</form>
</body>
</html>