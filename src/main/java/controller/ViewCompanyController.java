package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import model.AddCompanyModel;
import service.ComanyServiceImpl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet("/viewCompany")
public class ViewCompanyController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		RequestDispatcher header =request.getRequestDispatcher("Admin/header.html");

		header.include(request, response);

		ComanyServiceImpl cs = new ComanyServiceImpl();

		ArrayList<AddCompanyModel> list = cs.getAllCompanies();
		int count=0;

		
		out.println("<div class='card shadow border-0 table-responsive'>");

		// Heading
		out.println("<div class='card-header text-white text-center'>");
		out.println("<h2 class='heading'>Company List</h2>");
		out.println("</div>");

		out.println("<div class='card-body'>");

		// Table
		out.println("<table class='table table-hover table-striped text-center'>");

		out.println("<thead class='thead-dark'>");

		out.println("<tr>");

		out.println("<th>ID</th>");
		out.println("<th>Company Name</th>");
		out.println("<th>Package</th>");
		out.println("<th>Location</th>");
		out.println("<th>Criteria</th>");
		out.println("<th>Action</th>");

		out.println("</tr>");

		out.println("</thead>");

		out.println("<tbody>");

		for (AddCompanyModel a : list) {

			out.println("<tr>");
			++count;
			out.println("<td>" + count+ "</td>");
			out.println("<td>" + a.getCompany_name() + "</td>");
			out.println("<td>" + a.getCompany_package() + "</td>");
			out.println("<td>" + a.getLocation() + "</td>");
			out.println("<td>" + a.getCompany_criteria() + "</td>");
			out.println("<td>");
			out.println("<a href='updateCompany?id="+a.getId()+"'>");
			out.println("<button class='btn btn-primary mr-2'>");
			out.println("<i class='fa fa-edit'></i>");
			out.println("</button>");
			out.println("</a>");

			out.println("<a href=''>");
			out.println("<button class='btn btn-danger'>");
			out.println("<i class='fa fa-trash'></i>");
			out.println("</button>");
			out.println("</a>");
			out.print("</td>");
			out.println("</tr>");
		}

		out.println("</tbody>");

		out.println("</table>");

		out.println("</div>");

		out.println("</div>");

		RequestDispatcher footer =
				request.getRequestDispatcher("Admin/footer.html");

		footer.include(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String cname = request.getParameter("company_name");

		int cpackage = Integer.parseInt(request.getParameter("company_package"));

		String clocation = request.getParameter("company_location");

		double crt = Double.parseDouble(request.getParameter("company_criteria"));

		AddCompanyModel amodel = new AddCompanyModel();

		amodel.setCompany_name(cname);

		amodel.setCompany_package(cpackage);

		amodel.setLocation(clocation);

		amodel.setCompany_criteria(crt);

		ComanyServiceImpl cs = new ComanyServiceImpl();

		boolean res = cs.isAddCompany(amodel);

		if (res) {

			response.sendRedirect("viewCompany");

		} else {

			PrintWriter out = response.getWriter();

			out.println("<h2 style='color:red;text-align:center'>");
			out.println("Company Not Added");
			out.println("</h2>");
		}
	}
}