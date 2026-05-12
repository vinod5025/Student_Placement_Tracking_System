package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/addStudent")
public class AddStudentController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		// Header
		RequestDispatcher header =
				request.getRequestDispatcher("Admin/header.html");

		header.include(request, response);

		// Bootstrap CDN
		out.println("<link rel='stylesheet' "
				+ "href='https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css'>");

		// Form Start
		out.println("<div class='container mt-5'>");

		out.println("<div class='row justify-content-center'>");

		out.println("<div class='col-md-8'>");

		out.println("<div class='card shadow'>");

		out.println("<div class='card-header bg-primary text-white'>");
		out.println("<h3 class='text-center'>Add Student</h3>");
		out.println("</div>");

		out.println("<div class='card-body'>");

		out.println("<form action='' method='post'>");

		// Student Name
		out.println("<div class='form-group'>");
		out.println("<label>Student Name</label>");
		out.println("<input type='text' name='name' "
				+ "class='form-control' "
				+ "placeholder='Enter Student Name'>");
		out.println("</div>");

		// Email
		out.println("<div class='form-group'>");
		out.println("<label>Email</label>");
		out.println("<input type='email' name='email' "
				+ "class='form-control' "
				+ "placeholder='Enter Email'>");
		out.println("</div>");

		// Mobile
		out.println("<div class='form-group'>");
		out.println("<label>Mobile</label>");
		out.println("<input type='text' name='mobile' "
				+ "class='form-control' "
				+ "placeholder='Enter Mobile Number'>");
		out.println("</div>");

		// Branch
		out.println("<div class='form-group'>");
		out.println("<label>Branch</label>");

		out.println("<select name='branch' class='form-control'>");

		out.println("<option>Select Branch</option>");
		out.println("<option>CSE</option>");
		out.println("<option>IT</option>");
		out.println("<option>ENTC</option>");
		out.println("<option>Mechanical</option>");
		out.println("<option>Civil</option>");

		out.println("</select>");
		out.println("</div>");

		// Percentage
		out.println("<div class='form-group'>");
		out.println("<label>Percentage</label>");
		out.println("<input type='text' name='percentage' "
				+ "class='form-control' "
				+ "placeholder='Enter Percentage'>");
		out.println("</div>");

		// Passout Year
		out.println("<div class='form-group'>");
		out.println("<label>Passout Year</label>");
		out.println("<input type='text' name='year' "
				+ "class='form-control' "
				+ "placeholder='Enter Passout Year'>");
		out.println("</div>");

		// Submit Button
		out.println("<button type='submit' "
				+ "class='btn btn-success btn-block'>Add Student</button>");

		out.println("</form>");

		out.println("</div>");
		out.println("</div>");
		out.println("</div>");
		out.println("</div>");
		out.println("</div>");

		// Footer
		RequestDispatcher footer =
				request.getRequestDispatcher("Admin/footer.html");

		footer.include(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}
}