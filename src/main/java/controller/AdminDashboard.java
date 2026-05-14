package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.AddCompanyModel;
import model.AddStudentModel;
import service.getCountServiceImpl;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/AdminDashboard")
public class AdminDashboard extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		AddStudentModel amodel = new AddStudentModel();
		AddCompanyModel cmodel=new AddCompanyModel();
		getCountServiceImpl gcnt = new getCountServiceImpl();
		

		int studentCount = gcnt.getStudentsCount(amodel);
		int companyCount=gcnt.getCompaniesCount(cmodel);

		// Header
		RequestDispatcher header = request.getRequestDispatcher("Admin/header.html");
		header.include(request, response);

		out.println("""

<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet"
href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">

<style>

body{
	background:#f4f6f9;
}

.dashboard-title{
	font-size:35px;
	font-weight:bold;
	color:#343a40;
}

.card{
	border:none;
	border-radius:15px;
	box-shadow:0px 4px 15px rgba(0,0,0,0.1);
	transition:0.3s;
}

.card:hover{
	transform:translateY(-5px);
}

.count{
	font-size:45px;
	font-weight:bold;
}

.icon{
	font-size:50px;
}

</style>

</head>

<body>

<div class="container mt-5">

	<div class="text-center mb-5">
		<h1 class="dashboard-title">Count Of Records</h1>
		<p class="text-muted">Student Placement Tracking System</p>
	</div>

	<div class="row">

		<!-- Students Card -->
		<div class="col-md-4 mb-4">
			<div class="card bg-primary text-white">
				<div class="card-body text-center">

					<div class="icon mb-3">
						🎓
					</div>

					<h4>Total Students</h4>

					<div class="count">
""");

		out.println(studentCount);

		out.println("""
					</div>

				</div>
			</div>
		</div>

		<!-- Companies Card -->
		<div class="col-md-4 mb-4">
			<div class="card bg-success text-white">
				<div class="card-body text-center">

					<div class="icon mb-3">
						🏢
					</div>

					<h4>Total Companies</h4>

					<div class="count">""");
					out.println(companyCount);
					out.println("""
					</div>

				</div>
			</div>
		</div>

		<!-- Placement Card -->
		<div class="col-md-4 mb-4">
			<div class="card bg-danger text-white">
				<div class="card-body text-center">

					<div class="icon mb-3">
						💼
					</div>

					<h4>Total Placements</h4>

					<div class="count">
						15
					</div>

				</div>
			</div>
		</div>

	</div>

</div>

</body>
</html>

""");

		// Footer
		RequestDispatcher footer = request.getRequestDispatcher("Admin/footer.html");
		footer.include(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}
}