package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/studentLogin")
public class StudentLoginController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.print(
				"<!DOCTYPE html>" +
				"<html>" +
				"<head>" +
				"<meta charset='UTF-8'>" +
				"<meta name='viewport' content='width=device-width, initial-scale=1'>" +

				"<link rel='stylesheet' " +
				"href='https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css'>" +

				"<title>Student Login</title>" +
				"</head>" +

				"<body class='bg-light'>" +

				"<div class='container mt-5'>" +
				"<div class='row justify-content-center'>" +

				"<div class='col-md-5'>" +

				"<div class='card shadow'>" +

				"<div class='card-header text-center bg-primary text-white'>" +
				"<h3>Student Login</h3>" +
				"</div>" +

				"<div class='card-body'>" +

				"<form action='studentLogin' method='post'>" +

				"<div class='form-group'>" +
				"<label>Student Username</label>" +
				"<input type='text' name='username' class='form-control' " +
				"placeholder='Enter Username' required>" +
				"</div>" +

				"<div class='form-group'>" +
				"<label>Password</label>" +
				"<input type='password' name='password' class='form-control' " +
				"placeholder='Enter Password' required>" +
				"</div>" +

				"<button type='submit' class='btn btn-primary btn-block'>" +
				"Login" +
				"</button>" +

				"</form>" +

				"<div class='text-center mt-3'>" +
				"New Student? " +
				"<a href='studentRegister'>Register Here</a>" +
				"</div>" +

				"</div>" +
				"</div>" +
				"</div>" +
				"</div>" +
				"</div>" +

				"</body>" +
				"</html>"
		);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String uname = request.getParameter("username");

		out.print(
				"<html>" +
				"<head>" +
				"<link rel='stylesheet' " +
				"href='https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css'>" +
				"</head>" +

				"<body class='bg-light'>" +

				"<div class='container mt-5'>" +
				"<div class='alert alert-success text-center'>" +
				"<h3>Welcome " + uname + "</h3>" +
				"</div>" +
				"</div>" +

				"</body>" +
				"</html>"
		);
	}
}