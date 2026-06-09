package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import model.AdminLoginModel;
import service.AdminLoginService;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/adminLogin")
public class AdminLoginController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		out.println("""

				<!DOCTYPE html>

				<html>

				<head>

				<title>Admin Login</title>

				<meta charset="UTF-8">

				<meta name="viewport"
					content="width=device-width, initial-scale=1.0">

				<link
				href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
				rel="stylesheet">

				<link
				rel="stylesheet"
				href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css">

				<link
				href="https://unpkg.com/aos@2.3.4/dist/aos.css"
				rel="stylesheet">

				</head>

				<body
				class="bg-secondary bg-gradient">

				<div class="container">

					<div class="row justify-content-center align-items-center"
						style="min-height:100vh;">

						<div class="col-md-4">

							<div class="card border-0 shadow-lg rounded-4"
								data-aos="fade-up"
								data-aos-duration="1000">

								<div class="card-body p-4">

									<div class="text-center mb-4">

										<div class="mb-3">

											<i class="fa-solid fa-user-shield
												fs-1 text-dark"></i>

										</div>

										<h3 class="fw-bold">

											Admin Login

										</h3>

										<p class="text-muted small">

											Student Placement Tracking System

										</p>

									</div>

									<form action="adminLogin"
										method="post">

										<div class="mb-3">

											<label class="form-label fw-semibold">

												Email Address

											</label>

											<div class="input-group">

												<span class="input-group-text bg-white">

													<i class="fa-solid fa-envelope text-secondary"></i>

												</span>

												<input type="email"
													name="email"
													class="form-control"
													placeholder="Enter email"
													required>

											</div>

										</div>

										<div class="mb-4">

											<label class="form-label fw-semibold">

												Password

											</label>

											<div class="input-group">

												<span class="input-group-text bg-white">

													<i class="fa-solid fa-lock text-secondary"></i>

												</span>

												<input type="password"
													name="password"
													class="form-control"
													placeholder="Enter password"
													required>

											</div>

										</div>

										<div class="d-grid">

											<button type="submit"
												class="btn btn-dark">

												<i class="fa-solid fa-right-to-bracket me-2"></i>

												Login

											</button>

										</div>

									</form>

								</div>

							</div>

						</div>

					</div>

				</div>

				<script
				src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js">
				</script>

				<script
				src="https://unpkg.com/aos@2.3.4/dist/aos.js">
				</script>

				<script>

					AOS.init();

				</script>

				</body>

				</html>

				""");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		String email = request.getParameter("email");
		String password = request.getParameter("password");

		AdminLoginModel admlogin = new AdminLoginModel();
		admlogin.setEmail(email);
		admlogin.setPassword(password);

		AdminLoginService admSrc = new AdminLoginService();

		boolean result = admSrc.isAdminLogin(admlogin);

		if (result) {

			// ✅ SESSION CREATE
			HttpSession session = request.getSession();
			session.setAttribute("admin", email);

			// redirect dashboard
			response.sendRedirect("AdminDashboard");

		} else {
			PrintWriter out = response.getWriter();
			out.println("<script>alert('Invalid Login');window.location='adminLogin';</script>");
		}
	}
}