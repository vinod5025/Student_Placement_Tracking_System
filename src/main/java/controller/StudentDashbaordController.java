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

		if (session != null
				&& session.getAttribute("studentEmail") != null) {

			// Get Session Data
			String email =
					(String) session.getAttribute("studentEmail");

			int studentId =
					(Integer) session.getAttribute("sid");

			// Header
			RequestDispatcher header =
					request.getRequestDispatcher(
							"Student/header.html");

			header.include(request, response);

			// Dashboard UI
			out.println("<div class='container mt-5'>");

			out.println("<div class='card shadow border-0'>");

			out.println("<div class='card-body p-5'>");

			out.println("<h2 class='text-primary font-weight-bold'>");
			out.println("Mail is "+email+" & ID is "+studentId);
			out.println("</h2>");

			out.println("<hr>");
			out.println("<div class='mt-4'>");

			out.println("</div>");

			out.println("</div>");

			out.println("</div>");

			out.println("</div>");

			// Footer
			RequestDispatcher footer =
					request.getRequestDispatcher(
							"Student/footer.html");

			footer.include(request, response);

		} else {

			response.sendRedirect("studentLogin");
		}
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}
}