<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Registration Confirmed</title>
    <style>
        body { font-family: Arial, sans-serif; margin: 40px; background: #f0f2f5; }
        .container { max-width: 500px; margin: auto; background: white;
                     padding: 30px; border-radius: 8px; box-shadow: 0 2px 8px rgba(0,0,0,0.1); }
        .success { color: #27ae60; font-size: 22px; font-weight: bold; }
        table { width: 100%; margin-top: 20px; border-collapse: collapse; }
        td { padding: 10px; border: 1px solid #ddd; }
        td:first-child { font-weight: bold; background: #f8f9fa; width: 40%; }
        a { display: inline-block; margin-top: 15px; padding: 8px 18px;
            background: #3498db; color: white; text-decoration: none; border-radius: 4px; }
    </style>
</head>
<body>
<div class="container">
    <p class="success">✔ Registration Successful!</p>
    <p>Your registration details:</p>
    <table>
        <tr><td>Full Name</td>     <td><%= request.getParameter("name") %></td></tr>
        <tr><td>Student ID</td>    <td><%= request.getParameter("student_id") %></td></tr>
        <tr><td>Workshop</td>      <td><%= request.getParameter("workshop") %></td></tr>
    </table>
    <a href="list.jsp">View All Registrations</a>
    <a href="register.jsp">Register Another</a>
    <a href="index.jsp">Home</a>
</div>
</body>
</html>