<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Error</title>
<style>
    body { font-family: sans-serif; text-align: center; padding: 50px; }
    .error-box { border: 1px solid red; display: inline-block; padding: 20px; background: #fff0f0; }
</style>
</head>
<body>

    <div class="error-box">
        <h2 style="color:red">Authentication Error</h2>
        <p>Login Failed. Invalid Username or Password</p>
        
        <%-- Optional: Display technical details if an exception occurred --%>
        <% if (exception != null) { %>
            <p>Details: <%= exception.getMessage() %></p>
        <% } %>

        <a href="login.jsp">Return to Login Page</a>
    </div>

</body>
</html>