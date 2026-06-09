package controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import model.AddCompanyModel;
import service.ComanyServiceImpl;

@WebServlet("/addCompany")
public class AddCompanyController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		RequestDispatcher header = request.getRequestDispatcher("Admin/header.html");

		header.include(request, response);

		
		out.println("<div class='col-md-12'>");

		out.println("<div class='card shadow border-0'>");

		out.println("<div class='card-header  text-white text-center py-3'>");

		out.println("<h2 class='mb-0 heading'>Add Company</h2>");

		out.println("</div>");

		out.println("<div class='card-body p-3'>");

		out.println("<form action='addCompany' method='post'>");

		// FIRST ROW
		out.println("<div class='row'>");

		out.println("<div class='col-md-6'>");

		out.println("<div class='form-group'>");

		out.println("<label class='font-weight-bold'>Company Name</label>");

		out.println(
				"<input type='text' name='company_name' class='form-control' placeholder='Enter Company Name' required>");

		out.println("</div>");

		out.println("</div>");

		out.println("<div class='col-md-6'>");

		out.println("<div class='form-group'>");

		out.println("<label class='font-weight-bold'>Package</label>");

		out.println(
				"<input type='number' name='company_package' class='form-control' placeholder='Enter Package' required>");

		out.println("</div>");

		out.println("</div>");

		out.println("</div>");

		// SECOND ROW
		out.println("<div class='row'>");

		out.println("<div class='col-md-6'>");

		out.println("<div class='form-group'>");

		out.println("<label class='font-weight-bold'>Location</label>");

		out.println("<input type='text' name='location' class='form-control' placeholder='Enter Location' required>");

		out.println("</div>");

		out.println("</div>");

		out.println("<div class='col-md-6'>");

		out.println("<div class='form-group'>");

		out.println("<label class='font-weight-bold'>Criteria</label>");

		out.println(
				"<input type='number' step='0.01' name='company_criteria' class='form-control' placeholder='Enter Criteria' required>");

		out.println("</div>");

		out.println("</div>");

		out.println("</div>");

		// BUTTON
		out.println("<div class='text-center mt-4'>");

		out.println("<button type='submit' class='btn btn-success px-5 mr-3'>");

		out.println("Add Company");

		out.println("</button>");

		out.println("</div>");

		out.println("</form>");

		out.println("</div>");

		out.println("</div>");

		out.println("</div>");


		RequestDispatcher footer = request.getRequestDispatcher("Admin/footer.html");

		footer.include(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String company_name = request.getParameter("company_name");

		int company_package = Integer.parseInt(request.getParameter("company_package"));

		String location = request.getParameter("location");

		double company_criteria = Double.parseDouble(request.getParameter("company_criteria"));

		AddCompanyModel amodel = new AddCompanyModel();

		amodel.setCompany_name(company_name);

		amodel.setCompany_package(company_package);

		amodel.setLocation(location);

		amodel.setCompany_criteria(company_criteria);

		ComanyServiceImpl cs = new ComanyServiceImpl();

		boolean b = cs.isAddCompany(amodel);

		if (b) {
			response.sendRedirect("viewCompany");
		} else {
			response.sendRedirect("addCompany");
		}
	}
}