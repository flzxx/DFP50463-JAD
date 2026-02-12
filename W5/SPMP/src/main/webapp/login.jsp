<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
    <h2>Login</h2>

    <form method="post" action="authenticate.jsp">
        <label for="username">Username</label><br>
        <input type="text" id="username" name="name" required><br><br>

        <label for="password">Password</label><br>
        <input type="password" id="password" name="katalaluan" required><br><br>

        <input type="submit" value="Login">
    </form>
</body>
</html>
