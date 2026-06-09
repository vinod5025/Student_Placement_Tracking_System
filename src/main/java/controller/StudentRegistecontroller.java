package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.AddStudentModel;
import service.StudentRegisterServiceImpl;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/studentRegister")
public class StudentRegistecontroller extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.print("<!DOCTYPE html>" + "<html>" +

				"<head>" + "<meta charset='UTF-8'>"
				+ "<meta name='viewport' content='width=device-width, initial-scale=1'>" +

				"<link rel='stylesheet' "
				+ "href='https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css'>" +

				"<title>Student Registration</title>" + "</head>" +

				"<body class='bg-light'>" +

				"<div class='container mt-5'>" + "<div class='row justify-content-center'>" +

				"<div class='col-md-6'>" +

				"<div class='card shadow'>" +

				"<div class='card-header bg-primary text-white text-center'>" + "<h3>Student Registration Form</h3>"
				+ "</div>" +

				"<div class='card-body'>" +

				"<form action='' method='post'>" +

				"<div class='form-group'>" + "<label>Name</label>"
				+ "<input type='text' name='name' class='form-control' placeholder='Enter Name' >" + "</div>" +

				"<div class='form-group'>" + "<label>Email</label>"
				+ "<input type='email' name='email' class='form-control' placeholder='Enter Email' required>" + "</div>"
				+

				"<div class='form-group'>" + "<label>Password</label>"
				+ "<input type='password' name='password' class='form-control' placeholder='Enter Password' >"
				+ "</div>" +

				"<div class='form-group'>" + "<label>Contact</label>"
				+ "<input type='text' name='contact' class='form-control' placeholder='Enter Contact Number' >"
				+ "</div>" +

				"<div class='form-group'>" + "<label>Qualification</label>"
				+ "<input type='text' name='qualification' class='form-control' placeholder='Enter Qualification' >"
				+ "</div>" +

				"<div class='form-group'>" + "<label>Passing Year</label>"
				+ "<input type='number' name='passing_year' class='form-control' placeholder='Enter Passing Year' >"
				+ "</div>" +

				"<div class='form-group'>" + "<label>Percentage</label>"
				+ "<input type='number' name='percentage' step='0.01'  class='form-control' placeholder='Enter Percentage' >"
				+ "</div>" +

				"<div class='form-group'>" + "<label>Course Name</label>"
				+ "<input type='text' name='course_name' class='form-control' placeholder='Enter Your Course' >"
				+ "</div>" +

				"<button type='submit' class='btn btn-primary btn-block'>Register</button>" +

				"</form>" +

				"</div>" + "</div>" + "</div>" + "</div>" + "</div>" +

				"</body>" + "</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		 response.setContentType("text/html"); 
		 PrintWriter out = response.getWriter();
		 

		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password=request.getParameter("password");
		String contact = request.getParameter("contact");
		String qualification = request.getParameter("qualification");
		int passing_year = Integer.parseInt(request.getParameter("passing_year"));
		float percentage = Float.parseFloat(request.getParameter("percentage"));
		String course_name= request.getParameter("course_name");
		
		//Create object of the AddStudentModel
		
		AddStudentModel smodel=new AddStudentModel();
		
		smodel.setName(name);
		smodel.setEmail(email);
		smodel.setPassword(password);
		smodel.setContact(contact);
		smodel.setQualification(qualification);
		smodel.setPassing_year(passing_year);
		smodel.setPercentage(percentage);
		smodel.setContact(contact);
		smodel.setCname(course_name);
		
		//Create the Object of the Service class 
		
		StudentRegisterServiceImpl simpl=new StudentRegisterServiceImpl();
		
		boolean b=simpl.isAddStudent(smodel);
		if(b)
		{
			response.sendRedirect("studentLogin");
		}
		else
		{
			out.println(

					"<h2 style='color:red;text-align:center;margin-top:50px;'>"

					+ "Student Already Registered With This Email"

					+ "</h2>"

					);
		}
		
	}
}