package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/studentDashboard")
public class StudentDashbaordController extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		HttpSession session =
				request.getSession(false);

		if(session != null)
		{
			String email =
			(String)session.getAttribute(
					"studentEmail");

			RequestDispatcher header =
					request.getRequestDispatcher(
							"Student/header.html");

			header.include(request, response);

			out.println("<div class='container mt-5'>");

			out.println("<div class='card shadow p-4'>");

			out.println("<h2 class='text-success'>");
			out.println("Welcome : " + email);
			out.println("</h2>");

			out.println("</div>");

			out.println("</div>");

			RequestDispatcher footer =
					request.getRequestDispatcher(
							"Student/footer.html");

			footer.include(request, response);
		}
		else
		{
			response.sendRedirect(
					"studentLogin");
		}
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}
}