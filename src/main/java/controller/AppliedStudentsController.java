package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import model.PlacementModel;
import service.ViewAppliedStudentServiceImpl;
import service.UpdatePlacementStatusServiceImpl;

@WebServlet("/applied_students")
public class AppliedStudentsController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		// ================= UPDATE STATUS =================

		String pid = request.getParameter("pid");

		String action = request.getParameter("action");

		if (pid != null && action != null) {

			int placementId = Integer.parseInt(pid);

			UpdatePlacementStatusServiceImpl us = new UpdatePlacementStatusServiceImpl();

			us.updateStatus(placementId, "Placed");

			response.sendRedirect("applied_students");

			return;
		}

		// ================= HEADER =================

		RequestDispatcher header = request.getRequestDispatcher("Admin/header.html");

		header.include(request, response);

		// ================= FETCH DATA =================

		ViewAppliedStudentServiceImpl vs = new ViewAppliedStudentServiceImpl();

		ArrayList<PlacementModel> list = vs.getAppliedStudents();

		// ================= UI =================

		out.println("<div class='card shadow border-0 mt-4 mb-4'>");

		out.println("<div class='card-header text-white text-center py-3'>");

		out.println("<h3 class='mb-0 font-weight-bold text-center heading'>Applied Students</h3>");

		out.println("</div>");

		out.println("<div class='card-body'>");

		out.println("<div class='table-responsive'>");

		out.println("<table class='table table-hover'>");

		out.println("<thead class='bg-primary text-white'>");

		out.println("<tr>");

		out.println("<th class='text-center'>SR NO</th>");

		out.println("<th class='text-center'>Student Name</th>");

		out.println("<th class='text-center'>Company Name</th>");

		out.println("<th class='text-center'>Apply Date</th>");

		out.println("<th class='text-center'>Status</th>");

		out.println("<th class='text-center'>Action</th>");

		out.println("</tr>");

		out.println("</thead>");

		out.println("<tbody>");

		int count = 0;

		for (PlacementModel p : list) {

			count++;

			out.println("<tr>");

			out.println("<td class='text-center font-weight-bold'>" + count + "</td>");

			out.println("<td class='text-center'>" + p.getStudentName() + "</td>");

			out.println("<td class='text-center'>" + p.getCompanyName() + "</td>");

			out.println("<td class='text-center'>" + p.getApply_date() + "</td>");

			// ================= STATUS =================

			out.println("<td class='text-center'>");

			if (p.getStatus().equals("Placed")) {

				out.println("<span class='badge badge-success px-3 py-2 text-dark'>Placed</span>");

			} else {

				out.println("<span class='badge badge-warning px-3 py-2 text-dark'>Applied</span>");
			}

			out.println("</td>");

			// ================= ACTION =================

			out.println("<td class='text-center'>");

			if (p.getStatus().equals("Placed")) {

				out.println("<button class='btn btn-success btn-sm text-dark' disabled>Placed</button>");

			} else {

				out.println("<a href='applied_students?pid=" + p.getId()
						+ "&action=placed' class='btn btn-primary btn-sm'>Move To Place</a>");
			}

			out.println("</td>");

			out.println("</tr>");
		}

		out.println("</tbody>");

		out.println("</table>");

		out.println("</div>");

		out.println("</div>");

		out.println("</div>");

		RequestDispatcher footer = request.getRequestDispatcher("Admin/footer.html");

		footer.include(request, response);
	}
}