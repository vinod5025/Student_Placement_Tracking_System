package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.AddCompanyModel;
import model.AddStudentModel;
import model.PlacementModel;
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
		AddCompanyModel cmodel = new AddCompanyModel();
		PlacementModel pmodel = new PlacementModel();
		getCountServiceImpl gcnt = new getCountServiceImpl();

		int studentCount = gcnt.getStudentsCount(amodel);
		int companyCount = gcnt.getCompaniesCount(cmodel);
		int placedCount = gcnt.getPlacedCount(pmodel);

		// Header
		RequestDispatcher header = request.getRequestDispatcher("Admin/header.html");
		header.include(request, response);

		out.println("""

				<div class="container-fluid mt-4">

					<div class="row mb-4">

						<div class="col-md-12">

							<div class="text-white rounded p-4 shadow">



								<h3 class="mb-0 heading">
									Student Placement Tracking System
								</h3>

							</div>

						</div>

					</div>

					<div class="row g-4">

						<!-- Students Card -->

						<div class="col-md-4">

							<div class="card border-0 shadow-lg h-100">

								<div class="card-body text-center">

									<div class="display-3 mb-3">
										🎓
									</div>

									<h4 class="fw-bold text-primary">
										Total Students
									</h4>

									<h1 class="display-4 fw-bold">
				""");

		out.println(studentCount);

		out.println("""

									</h1>

								</div>

							</div>

						</div>

						<!-- Companies Card -->

						<div class="col-md-4">

							<div class="card border-0 shadow-lg h-100">

								<div class="card-body text-center">

									<div class="display-3 mb-3">
										🏢
									</div>

									<h4 class="fw-bold text-success">
										Total Companies
									</h4>

									<h1 class="display-4 fw-bold">
				""");

		out.println(companyCount);

		out.println("""

											</h1>

										</div>

									</div>

								</div>

								<!-- Placement Card -->

								<div class="col-md-4">

									<div class="card border-0 shadow-lg h-100">

										<div class="card-body text-center">

											<div class="display-3 mb-3">
												💼
											</div>

											<h4 class="fw-bold text-danger">
												Total Placements
											</h4>

											<h1 class="display-4 fw-bold">
				""");

		out.println(placedCount);

		out.println("""


									</h1>

								</div>

							</div>

						</div>

					</div>

				</div>

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