package controller;

import jakarta.servlet.RequestDispatcher;
import java.util.ArrayList;

import model.AddStudentModel;
import service.StudentRegisterServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/viewStudent")
public class ViewStudentController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out=response.getWriter();
	RequestDispatcher header = request.getRequestDispatcher("Admin/header.html");
	header.include(request, response);
	
	StudentRegisterServiceImpl ss = new StudentRegisterServiceImpl();

	ArrayList<AddStudentModel> list = ss.getAllStudent();

	out.println("<div class='card shadow border-0'>");

	out.println("<div class='card-header text-white text-center'>");
	out.println("<h2 class='heading'>Student List</h2>");
	out.println("</div>");

	out.println("<div class='card-body'>");

	out.println("<table class='table table-bordered table-hover table-striped text-center'>");

	out.println("<thead class='thead-dark'>");

	out.println("<tr>");

	out.println("<th>ID</th>");
	out.println("<th>Name</th>");
	out.println("<th>Email</th>");
	out.println("<th>Contact</th>");
	out.println("<th>Course</th>");
	out.println("<th>Passout Year</th>");
	out.println("<th>Percentage Criteria</th>");
	
	out.println("<th>Action</th>");

	out.println("</tr>");

	out.println("</thead>");

	out.println("<tbody>");
int cnt=0;
	for (AddStudentModel s : list) {
		++cnt;
		out.println("<tr>");
		out.println("<td>" + cnt+ "</td>");
		out.println("<td>" + s.getName() + "</td>");
		out.println("<td>" + s.getEmail() + "</td>");
		out.println("<td>" + s.getContact() + "</td>");
		out.println("<td>" + s.getQualification() + "</td>");
		out.println("<td>" + s.getPassing_year() + "</td>");
		out.println("<td>" + s.getPercentage() + "</td>");

		out.println("<td>");

		out.println("<a href=''>");
		out.println("<button class='btn btn-primary btn-sm mr-2'>");
		out.println("<i class='fa fa-edit'></i>");
		out.println("</button>");
		out.println("</a>");

		out.println("<a href=''>");
		out.println("<button class='btn btn-danger btn-sm'>");
		out.println("<i class='fa fa-trash'></i>");
		out.println("</button>");
		out.println("</a>");

		out.println("</td>");

		out.println("</tr>");
	}

	out.println("</tbody>");

	out.println("</table>");

	out.println("</div>");

	out.println("</div>");

	


	
	RequestDispatcher footer= request.getRequestDispatcher("Admin/footer.html");
	footer.include(request, response);
	
	
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
