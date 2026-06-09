package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import model.PlacementModel;
import service.ViewAppliedStudentServiceImpl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet("/placed_students")
public class PlacedStudentsController
        extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		// ================= HEADER =================

		RequestDispatcher header = request.getRequestDispatcher("Admin/header.html");

		header.include(request, response);

		// ================= FETCH DATA =================

		ViewAppliedStudentServiceImpl vs = new ViewAppliedStudentServiceImpl();

		ArrayList<PlacementModel> list = vs.getAppliedStudents();

		// ================= UI =================

		out.println("<div class='card  border-0 mt-4 mb-4'>");

		out.println("<div class='card-header text-white text-center py-3'>");

		out.println("<h3 class='mb-0 font-weight-bold heading'>Placed Students</h3>");

		out.println("</div>");

		out.println("<div class='card-body'>");

		out.println("<div class='table-responsive'>");

		out.println("<table class='table table-hover'>");

		out.println("<thead class='bg-dark text-white'>");

		out.println("<tr>");

		out.println("<th class='text-center'>SR NO</th>");

		out.println("<th class='text-center'>Student Name</th>");

		out.println("<th class='text-center'>Company Name</th>");

		out.println("<th class='text-center'>Apply Date</th>");

		out.println("<th class='text-center'>Status</th>");

		out.println("</tr>");

		out.println("</thead>");

		out.println("<tbody>");

		int count = 0;

		for (PlacementModel p : list) {

			// SHOW ONLY PLACED STUDENTS
			if (p.getStatus().equals("Placed")) {

				count++;

				out.println("<tr>");

				out.println("<td class='text-center font-weight-bold'>" + count + "</td>");

				out.println("<td class='text-center'>" + p.getStudentName() + "</td>");

				out.println("<td class='text-center'>" + p.getCompanyName() + "</td>");

				out.println("<td class='text-center'>" + p.getApply_date() + "</td>");

				out.println("<td class='text-center'>");

				out.println("<span class='badge badge-success text-dark px-3 py-2'>");

				out.println(p.getStatus());

				out.println("</span>");

				out.println("</td>");

				out.println("</tr>");
			}
		}

		out.println("</tbody>");

		out.println("</table>");

		out.println("</div>");

		out.println("</div>");

		out.println("</div>");

		// ================= FOOTER =================

		RequestDispatcher footer = request.getRequestDispatcher("Admin/footer.html");

		footer.include(request, response);
	}

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        doGet(request, response);
    }
}