package com.excelr.registration;

//imports necessary Java libraries for handling HTTP requests and database operations.
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/*
 @WebServlet("/login") annotation is used to specify the URL pattern that maps to this servlet. In this case, it indicates that this servlet will handle HTTP requests sent to the /login path on the web server.
 
 When a client makes an HTTP request to the specified URL pattern (/login), the servlet container will invoke the doPost method of the LoginServlet class to process the request. This annotation is part of the Java Servlet API and helps in defining servlet mappings without the need for explicit configuration in deployment descriptors like web.xml.
 */
@WebServlet("/login")
//class named LoginServlet which extends HttpServlet.
public class LoginServlet extends HttpServlet
{
	/*
	 The `serialVersionUID` is a unique identifier for serializable classes. When a serializable class is written to an ObjectOutput stream, its `serialVersionUID` is included in the serialized form. When the class is later read from an ObjectInput stream, the runtime compares the `serialVersionUID` of the incoming class with the `serialVersionUID` of the class on the local machine. If the IDs don't match, it indicates that the class versions are incompatible, and deserialization may fail.

In this servlet, the `serialVersionUID` field is declared as `private static final long serialVersionUID = 1L;`. Here's what each part means:

- `private`: The field is only accessible within the same class.
- `static`: The field belongs to the class itself, not to instances of the class.
- `final`: The field's value cannot be changed once initialized.
- `long`: The data type of the field is `long`.
- `serialVersionUID`: The name of the field, representing the serial version UID.
- `= 1L`: Initialization of the field with the value `1L`. 

Setting `serialVersionUID` to a specific value (in this case, `1L`) explicitly specifies the version of the class for serialization purposes. If the class later undergoes changes (e.g., by adding or removing fields or methods), developers typically update the `serialVersionUID` to reflect the changes and maintain compatibility during serialization and deserialization across different versions of the class.	
	 */
	private static final long serialVersionUID = 1L;
//	This method is invoked when an HTTP POST request is sent to the servlet. It takes two parameters: HttpServletRequest request and HttpServletResponse response.
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		//Request Parameters: It retrieves the username and password parameters from the HTTP request.
		
//		retrieves the value of a parameter named "username" from the HTTP request. 
		//request.getParameter("username"): This method is part of the HttpServletRequest interface in Java Servlet API. It retrieves the value of a request parameter specified by its name. 
		//String uemail = ...: The retrieved parameter value is stored in a String variable named uemail. 
		//essentially, this line of code is extracting the value entered by the user in the username field of a form submitted via an HTTP POST request,
		String uemail = request.getParameter("username");
		/*This line of code is similar to the previous one, but it retrieves the value of a parameter named "password" from the HTTP request. Let's break it down:

- `request.getParameter("password")`: Like before, this method is used to retrieve the value of a request parameter specified by its name. Here, it's looking for a parameter named "password" in the HTTP request.

- `String upwd = ...`: The retrieved parameter value is stored in a `String` variable named `upwd`. The variable name `upwd` suggests that it's meant to represent the user's password.

Just like with the email address, this line of code is extracting the value entered by the user in the password field of a form submitted via an HTTP POST request, and storing it in a variable named `upwd` for further processing, such as validation or database interaction.*/
		String upwd = request.getParameter("password");
		Connection con = null;
		
		HttpSession session = request.getSession();
		RequestDispatcher dispatcher = null;
		
		try
		{
			String url = "jdbc:mysql://localhost:3306/signup?useSSL=false";
			String username = "root";
			String password = "admin";
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, username, password);
			PreparedStatement pst = con.prepareStatement("select * from users where uemail = ? and upwd = ?");
			pst.setString(1, uemail);
			pst.setString(2, upwd);
			
			ResultSet rs = pst.executeQuery();
			
			if(rs.next())
			{
				session.setAttribute("name", rs.getString("uname"));
				dispatcher = request.getRequestDispatcher("index.jsp");
			}
			else
			{
				request.setAttribute("status", "failed");
				dispatcher = request.getRequestDispatcher("login.jsp");
			}
			dispatcher.forward(request, response);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
