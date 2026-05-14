package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.AddCompanyModel;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/updateCompany")
public class UpdateCompanyCotroller extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String id = request.getParameter("id");

		RequestDispatcher header = request.getRequestDispatcher("Admin/header.html");
		header.include(request, response);

		out.println("<div class='container mt-4'>");
		out.println("<h3>Update Company</h3>");

		out.println("<form action='updateCompany' method='post'>");

		// hidden id
		out.println("<input type='hidden' name='id' value='" + id + "'>");

		// company name
		out.println("<div class='mb-3'>");
		out.println("<label>Company Name</label>");
		out.println("<input type='text' name='company_name' class='form-control' required>");
		out.println("</div>");

		// location
		out.println("<div class='mb-3'>");
		out.println("<label>Location</label>");
		out.println("<input type='text' name='location' class='form-control' required>");
		out.println("</div>");

		// package
		out.println("<div class='mb-3'>");
		out.println("<label>Package (LPA)</label>");
		out.println("<input type='number' name='company_package' class='form-control' required>");
		out.println("</div>");

		// criteria
		out.println("<div class='mb-3'>");
		out.println("<label>Criteria (%)</label>");
		out.println("<input type='number' step='0.1' name='company_criteria' class='form-control' required>");
		out.println("</div>");

		out.println("<button type='submit' class='btn btn-success'>Update Company</button>");

		out.println("</form>");
		out.println("</div>");

		RequestDispatcher footer = request.getRequestDispatcher("Admin/footer.html");
		footer.include(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		int id = Integer.parseInt(request.getParameter("id"));
		String company_name = request.getParameter("company_name");
		String location = request.getParameter("location");
		int company_package = Integer.parseInt(request.getParameter("company_package"));
		double company_criteria = Double.parseDouble(request.getParameter("company_criteria"));

		// 👉 Model set
		AddCompanyModel model = new AddCompanyModel();
		model.setId(id);
		model.setCompany_name(company_name);
		model.setLocation(location);
		model.setCompany_package(company_package);
		model.setCompany_criteria(company_criteria);

		// 👉 Call service (you already have this layer)
		// AddCompanyService service = new AddCompanyService();
		// service.updateCompany(model);

		PrintWriter out = response.getWriter();
		out.println("<script>");
		out.println("alert('Company Updated Successfully');");
		out.println("window.location='viewCompany';");
		out.println("</script>");
	}
	
	
}