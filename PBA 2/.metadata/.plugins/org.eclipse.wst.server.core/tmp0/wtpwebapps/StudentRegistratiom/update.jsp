<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ page import="java.sql.*" %>
<%
    int id          = Integer.parseInt(request.getParameter("id"));
    String name     = request.getParameter("name");
    String studId   = request.getParameter("student_id");
    String workshop = request.getParameter("workshop");

    Connection conn = null;
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/workshop_db", "root", "");

        PreparedStatement ps = conn.prepareStatement(
            "UPDATE students SET name=?, student_id=?, workshop=? WHERE id=?");
        ps.setString(1, name.trim());
        ps.setString(2, studId.trim());
        ps.setString(3, workshop);
        ps.setInt(4, id);
        ps.executeUpdate();

        response.sendRedirect("list.jsp");
    } catch (Exception e) { %>
        <p style="color:red;">Update failed: <%= e.getMessage() %></p>
        <a href="list.jsp">Back to List</a>
    <% } finally {
        if (conn != null) try { conn.close(); } catch (Exception e) {}
    }
%>