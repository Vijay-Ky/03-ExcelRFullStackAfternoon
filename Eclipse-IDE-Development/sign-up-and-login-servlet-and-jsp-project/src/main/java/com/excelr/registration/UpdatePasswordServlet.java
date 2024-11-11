package com.excelr.registration;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/updatePassword")
public class UpdatePasswordServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String newPassword = request.getParameter("newPassword");

        Connection con = null;
        try {
            String url = "jdbc:mysql://localhost:3306/signup?useSSL=false";
            String username = "root";
            String password = "admin";
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);

            // Update the password in the database
            PreparedStatement updatePasswordStmt = con.prepareStatement("UPDATE users SET upwd = ? WHERE uemail = ?");
            updatePasswordStmt.setString(1, newPassword);
            updatePasswordStmt.setString(2, email);
            int rowsAffected = updatePasswordStmt.executeUpdate();

            if (rowsAffected > 0) {
                // Password updated successfully
                request.setAttribute("status", "success");
                request.getRequestDispatcher("change-password-success.jsp").forward(request, response);
            } else {
                // No rows affected, possibly due to invalid email
                request.setAttribute("status", "failed");
                request.getRequestDispatcher("change-password.jsp").forward(request, response);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            // Handle exceptions appropriately
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
