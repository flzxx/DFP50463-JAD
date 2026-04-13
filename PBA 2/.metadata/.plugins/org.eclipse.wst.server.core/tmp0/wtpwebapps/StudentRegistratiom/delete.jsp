<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ page import="java.sql.*" %>
<%
    int id = Integer.parseInt(request.getParameter("id"));
    Connection conn = null;
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/workshop_db", "root", "");

        PreparedStatement ps = conn.prepareStatement(
            "DELETE FROM students WHERE id = ?");
        ps.setInt(1, id);
        ps.executeUpdate();

        response.sendRedirect("list.jsp");
    } catch (Exception e) { %>
        <p style="color:red;">Delete failed: <%= e.getMessage() %></p>
        <a href="list.jsp">Back to List</a>
    <% } finally {
        if (conn != null) try { conn.close(); } catch (Exception e) {}
    }
%>