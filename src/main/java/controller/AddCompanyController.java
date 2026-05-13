package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/addCompany")
public class AddCompanyController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		RequestDispatcher header = request.getRequestDispatcher("Admin/header.html");
		header.include(request, response);
		
		out.println("<form action='viewCompany'  method='POST'>");

		out.println("<div class='card shadow-lg border-0 rounded'>");

		out.println("<div class='card-body p-5'>");

		out.println("<div class='row'>");

		out.println("<div class='col-md-12 text-center mb-4'>");
		out.println("<h2 class='font-weight-bold heading'>Add Company</h2>");
		out.println("<hr class='w-25 mx-auto'>");
		out.println("</div>");

		// Company Name
		out.println("<div class='col-md-6 mb-4'>");
		out.println("<label class='font-weight-bold text-dark'>Company Name</label>");

		out.println("<input type='text' ");
		out.println("class='form-control form-control-lg shadow-sm' ");
		out.println("name='company_name' ");
		out.println("placeholder='Enter company name'>");

		out.println("</div>");

		// Company Package
		out.println("<div class='col-md-6 mb-4'>");
		out.println("<label class='font-weight-bold text-dark'>Company Package</label>");

		out.println("<input type='number' ");
		out.println("class='form-control form-control-lg shadow-sm' ");
		out.println("name='company_package' ");
		out.println("placeholder='Enter company package'>");

		out.println("</div>");

		// Company Location
		out.println("<div class='col-md-6 mb-4'>");
		out.println("<label class='font-weight-bold text-dark'>Company Location</label>");

		out.println("<input type='text' ");
		out.println("class='form-control form-control-lg shadow-sm' ");
		out.println("name='company_location' ");
		out.println("placeholder='Enter company location'>");

		out.println("</div>");

		// Company Criteria
		out.println("<div class='col-md-6 mb-4'>");
		out.println("<label class='font-weight-bold'>Company Criteria</label>");

		out.println("<input type='number' step='0.01' ");
		out.println("class='form-control form-control-lg shadow-sm' ");
		out.println("name='company_criteria' ");
		out.println("placeholder='Enter Criteria' required>");

		out.println("</div>");

		// Button
		out.println("<div class='col-md-12 text-center mt-3 p-0'>");

		out.println("<button class='btn btn-primary btn-md px-5 shadow'>");
		out.println("Add Company");
		out.println("</button>");

		out.println("</div>");

		out.println("</div>");

		out.println("</div>");

		out.println("</div>");

		
		out.println("</form>");

		RequestDispatcher footer= request.getRequestDispatcher("Admin/footer.html");
		footer.include(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
