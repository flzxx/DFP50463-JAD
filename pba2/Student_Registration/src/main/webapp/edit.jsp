<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Edit Registration</title>
    <style>
        body { font-family: Arial, sans-serif; margin: 40px; background: #f0f2f5; }
        .container { max-width: 500px; margin: auto; background: white;
                     padding: 30px; border-radius: 8px; box-shadow: 0 2px 8px rgba(0,0,0,0.1); }
        label { display: block; margin-top: 15px; font-weight: bold; }
        input, select { width: 100%; padding: 8px; margin-top: 5px;
                        border: 1px solid #ccc; border-radius: 4px; box-sizing: border-box; }
        button { margin-top: 20px; padding: 10px 25px; background: #f39c12;
                 color: white; border: none; border-radius: 4px; cursor: pointer; font-size: 16px; }
        a { color: #3498db; }
    </style>
</head>
<body>
<div class="container">
    <h2>Edit Registration</h2>
    <%
        int id = Integer.parseInt(request.getParameter("id"));
        Connection conn = null;
        String name = "", studId = "", workshop = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/workshop_db", "root", "");
            PreparedStatement ps = conn.prepareStatement(
                "SELECT * FROM students WHERE id = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                name     = rs.getString("name");
                studId   = rs.getString("student_id");
                workshop = rs.getString("workshop");
            }
        } catch (Exception e) { %>
            <p style="color:red;">Error: <%= e.getMessage() %></p>
        <% } finally {
            if (conn != null) try { conn.close(); } catch (Exception e) {}
        }
    %>

    <form method="post" action="update.jsp">
        <input type="hidden" name="id" value="<%= id %>">

        <label>Full Name:</label>
        <input type="text" name="name" value="<%= name %>" required>

        <label>Student ID:</label>
        <input type="text" name="student_id" value="<%= studId %>" required>

        <label>Select Workshop:</label>
        <select name="workshop" required>
            <option value="Web Development"      <%= "Web Development".equals(workshop)      ? "selected" : "" %>>Web Development</option>
            <option value="Database Management"  <%= "Database Management".equals(workshop)  ? "selected" : "" %>>Database Management</option>
            <option value="Cybersecurity Basics" <%= "Cybersecurity Basics".equals(workshop) ? "selected" : "" %>>Cybersecurity Basics</option>
            <option value="Python Programming"   <%= "Python Programming".equals(workshop)   ? "selected" : "" %>>Python Programming</option>
            <option value="Cloud Computing"      <%= "Cloud Computing".equals(workshop)      ? "selected" : "" %>>Cloud Computing</option>
        </select>

        <button type="submit">Update Registration</button>
    </form>
    <br><a href="list.jsp">← Back to List</a>
</div>
</body>
</html>