package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import model.AddCompanyModel;
import service.ViewStudentCompanyServiceImpl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet("/viewStudentCompany")
public class StudentViewComapanyController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		int cnt = 0;

		RequestDispatcher header = request.getRequestDispatcher("Student/header.html");
		header.include(request, response);

		HttpSession session = request.getSession(false);
		int studentId = 0;

		if (session != null && session.getAttribute("sid") != null) {
			studentId = (Integer) session.getAttribute("sid");
		}

		ViewStudentCompanyServiceImpl service = new ViewStudentCompanyServiceImpl();

		ArrayList<AddCompanyModel> list = service.getAllCompanies();

		out.println("<div class='card shadow mt-4 border-0'>");
		out.println("<div class='card-body'>");

		out.println("<h2 class='text-center mb-4 font-weight-bold text-dark heading text-white'>");
		out.println("Available Companies");
		out.println("</h2>");

		out.println("<table class='table table-hover table-striped'>");

		out.println("<thead class='bg-dark text-white'>");
		out.println("<tr>");
		out.println("<th class='text-center'>SR.</th>");
		out.println("<th class='text-center'>Company Name</th>");
		out.println("<th class='text-center'>Package</th>");
		out.println("<th class='text-center'>Location</th>");
		out.println("<th class='text-center'>Criteria</th>");
		out.println("<th class='text-center'>Action</th>");
		out.println("</tr>");
		out.println("</thead>");

		out.println("<tbody>");

		for (AddCompanyModel company : list) {

		    ++cnt;

		    boolean applied =
		            service.isApplied(studentId,
		            company.getId());

		    out.println("<tr>");

		    out.println("<td class='text-center'>"
		            + cnt + "</td>");

		    out.println("<td class='text-center font-weight-bold text-dark'>"
		            + company.getCompany_name() + "</td>");

		    out.println("<td class='text-center'>₹ "
		            + company.getCompany_package() + "</td>");

		    out.println("<td class='text-center'>"
		            + company.getLocation() + "</td>");

		    out.println("<td class='text-center'>"
		            + company.getCompany_criteria() + "%</td>");
		    
		    out.println("<td class='text-center'>");

		    if (applied) {

		        out.println(
		        "<button class='btn btn-secondary btn-sm px-4' disabled>Applied</button>");

		    } else {

		        out.println(
		        "<a href='applyCompany?cid="
		        + company.getId()
		        + "' class='btn btn-success btn-sm px-4'>Apply</a>");
		    }

		    out.println("</td>");
		    out.println("</tr>");
		}

		out.println("</tbody>");
		out.println("</table>");
		out.println("</div>");
		out.println("</div>");

		// ================= FOOTER =================
		RequestDispatcher footer = request.getRequestDispatcher("Student/footer.html");
		footer.include(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}
}