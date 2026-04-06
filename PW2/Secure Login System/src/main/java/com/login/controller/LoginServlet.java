package com.login.controller; // Make sure this matches your folder structure

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/LoginServlet") // This must match your <form action="LoginServlet">
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        String user = request.getParameter("username");
        String pass = request.getParameter("password");
        
        // Database credentials
        String url = "jdbc:mysql://localhost:3306/company_db";
        String dbUser = "root"; 
        String dbPass = ""; // Put your actual password here if you have one
        
        
        if ("admin".equals(user) && "1234".equals(pass)) {
            // SUCCESS: Go to home page
            response.sendRedirect("welcome.jsp");
        } else {
            // FAILURE: Connect to error.jsp
            response.sendRedirect("error.jsp");
        }
        
        
        try {
            // 1. Load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // 2. Establish connection
            Connection conn = DriverManager.getConnection(url, dbUser, dbPass);
            
            // 3. Create the query
            String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, pass);
            
            // 4. Execute
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                // Login Success - Create Session
                HttpSession session = request.getSession();
                session.setAttribute("username", user);
                response.sendRedirect("welcome.jsp");
            } else {
                // Login Fail
                response.sendRedirect("login.jsp?error=invalid");
            }
            
            conn.close();
        } catch (ClassNotFoundException e) {
            response.getWriter().println("Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            response.getWriter().println("SQL Error: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}