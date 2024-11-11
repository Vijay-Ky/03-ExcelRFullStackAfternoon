package com.excelr.registration;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ForgotPassword
 */
@WebServlet("/forgotPassword")
public class ForgotPassword extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");

        Connection con = null;
        try {
            String url = "jdbc:mysql://localhost:3306/signup?useSSL=false";
            String username = "root";
            String password = "admin";
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);

            // Check if the email exists in the database
            PreparedStatement checkEmailStmt = con.prepareStatement("SELECT * FROM users WHERE uemail = ?");
            checkEmailStmt.setString(1, email);
            ResultSet rs = checkEmailStmt.executeQuery();

            if (rs.next()) {
                // Email exists, forward to the password change form
                request.getRequestDispatcher("change-password.jsp").forward(request, response);
            } else {
                // Email not found, display error message
                request.setAttribute("status", "failed");
                request.getRequestDispatcher("forgot-password.jsp").forward(request, response);
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
