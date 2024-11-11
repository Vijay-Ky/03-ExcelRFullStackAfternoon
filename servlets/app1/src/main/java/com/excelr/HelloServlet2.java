package com.excelr;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet2 extends HttpServlet
{
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		PrintWriter out = response.getWriter();
		
		String s1 = request.getParameter("param1");
		String s2 = request.getParameter("firstName");
		out.println("Parameter1: " + s1);
		out.println("FirstName: " + s2);
		
		out.println("Hello World from a HelloServlet2 via out");
		System.out.println("Hello World from a HelloServlet2 via SOP");
		
		
	}
}
