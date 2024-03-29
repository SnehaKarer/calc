package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DashBoard
 */
@WebServlet("/DashBoard")
public class DashBoard extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");

		HttpSession session = request.getSession();

		PrintWriter out = response.getWriter();

		
//		Check whether the session already exists
		if ((session.getAttribute("userName") != null) && (session.getAttribute("userPassword") != null))  {

			out.println("<h3>Contact Form and Contact List Page");

			out.println("<br> You are now logged in...</h3>");

			out.println("<p><h4><a href='Logout'>LOGOUT</a></h4>");
		}

		else {
			response.sendRedirect("index.html");
		}

	}
}