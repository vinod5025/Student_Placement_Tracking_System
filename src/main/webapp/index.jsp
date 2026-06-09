<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="UTF-8">

<meta name="viewport"
	content="width=device-width, initial-scale=1.0">

<title>Student Placement Tracking System</title>

<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
<style>
html{
scroll-behavior:smooth;
}
</style>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css">

</head>

<body class="bg-light">

	<!-- ================= NAVBAR ================= -->

	<nav class="navbar navbar-expand-lg navbar-dark bg-dark shadow sticky-top">

		<div class="container">

			<a class="navbar-brand font-weight-bold" href="#">

				<i class="fa-solid fa-graduation-cap mr-2"></i>

				Placement Tracker

			</a>

			<button class="navbar-toggler"
				type="button"
				data-toggle="collapse"
				data-target="#navbarSupportedContent">

				<span class="navbar-toggler-icon"></span>

			</button>

			<div class="collapse navbar-collapse"
				id="navbarSupportedContent">

				<ul class="navbar-nav ml-auto align-items-lg-center">

					<li class="nav-item mx-2">

						<a class="nav-link text-white" href="#">

							<i class="fa-solid fa-house mr-1"></i>

							Home

						</a>

					</li>

					<li class="nav-item mx-2">

						<a class="nav-link text-white" href="#about">

							<i class="fa-solid fa-circle-info mr-1"></i>

							About

						</a>

					</li>

					<li class="nav-item mx-2">

						<a class="nav-link text-white" href="#courses">

							<i class="fa-solid fa-book mr-1"></i>

							Courses

						</a>

					</li>

					<li class="nav-item mx-2">

						<a class="nav-link text-white" href="#placements">

							<i class="fa-solid fa-briefcase mr-1"></i>

							Placements

						</a>

					</li>

					<li class="nav-item mx-2">

						<a class="nav-link text-white" href="#contact">

							<i class="fa-solid fa-phone mr-1"></i>

							Contact

						</a>

					</li>

					<li class="nav-item dropdown mx-2">

						<a class="nav-link dropdown-toggle text-white"
							href="#"
							role="button"
							data-toggle="dropdown">

							<i class="fa-solid fa-user mr-1"></i>

							Login

						</a>

						<div class="dropdown-menu dropdown-menu-right shadow">

							<a class="dropdown-item"
								href="studentLogin">

								<i class="fa-solid fa-user-graduate mr-2"></i>

								Student Login

							</a>

							<a class="dropdown-item"
								href="adminLogin">

								<i class="fa-solid fa-user-shield mr-2"></i>

								Admin Login

							</a>

						</div>

					</li>

				</ul>

			</div>

		</div>

	</nav>

	<!-- ================= HERO SECTION ================= -->

	<div id="carouselExampleControls"
		class="carousel slide"
		data-ride="carousel">

		<div class="carousel-inner">

			<div class="carousel-item active">

				<img
					src="https://images.unsplash.com/photo-1522202176988-66273c2fd55f?q=80&w=1400"
					class="d-block w-100"
					style="height:650px; object-fit:cover;">

				<div class="carousel-caption mb-5">

					<h1 class="display-4 font-weight-bold">
						Learn Java Full Stack
					</h1>

					<p class="lead">
						Industry Level Training with 100% Placement Assistance
					</p>

					<a href="studentRegister"
						class="btn btn-primary btn-lg px-4">

						Register Now

					</a>

				</div>

			</div>

			<div class="carousel-item">

				<img
					src="https://images.unsplash.com/photo-1516321318423-f06f85e504b3?q=80&w=1400"
					class="d-block w-100"
					style="height:650px; object-fit:cover;">

				<div class="carousel-caption mb-5">

					<h1 class="display-4 font-weight-bold">
						Build Your Career
					</h1>

					<p class="lead">
						Live Projects + Interview Preparation
					</p>

				</div>

			</div>

			<div class="carousel-item">

				<img
					src="https://images.unsplash.com/photo-1498050108023-c5249f4df085?q=80&w=1400"
					class="d-block w-100"
					style="height:650px; object-fit:cover;">

				<div class="carousel-caption mb-5">

					<h1 class="display-4 font-weight-bold">
						Become Software Developer
					</h1>

					<p class="lead">
						Start Your Journey Today
					</p>

				</div>

			</div>

		</div>

		<a class="carousel-control-prev"
			href="#carouselExampleControls"
			data-slide="prev">

			<span class="carousel-control-prev-icon"></span>

		</a>

		<a class="carousel-control-next"
			href="#carouselExampleControls"
			data-slide="next">

			<span class="carousel-control-next-icon"></span>

		</a>

	</div>

	<!-- ================= STATS ================= -->

	<div class="container mt-5">

		<div class="row text-center">

			<div class="col-md-3 mb-3">

				<div class="card shadow border-0">

					<div class="card-body">

						<h1 class="text-primary">
							500+
						</h1>

						<h5>Students</h5>

					</div>

				</div>

			</div>

			<div class="col-md-3 mb-3">

				<div class="card shadow border-0">

					<div class="card-body">

						<h1 class="text-success">
							100+
						</h1>

						<h5>Companies</h5>

					</div>

				</div>

			</div>

			<div class="col-md-3 mb-3">

				<div class="card shadow border-0">

					<div class="card-body">

						<h1 class="text-danger">
							95%
						</h1>

						<h5>Placements</h5>

					</div>

				</div>

			</div>

			<div class="col-md-3 mb-3">

				<div class="card shadow border-0">

					<div class="card-body">

						<h1 class="text-warning">
							15+
						</h1>

						<h5>Courses</h5>

					</div>

				</div>

			</div>

		</div>

	</div>

	<!-- ================= ABOUT ================= -->

	<div class="container mt-5"
		id="about">

		<div class="row align-items-center">

			<div class="col-md-6">

				<img
					src="https://images.unsplash.com/photo-1521737604893-d14cc237f11d?q=80&w=1200"
					class="img-fluid rounded shadow">

			</div>

			<div class="col-md-6">

				<h2 class="font-weight-bold mb-4">
					About Our Institute
				</h2>

				<p class="text-muted">

					We provide professional IT training with
					live projects, mock interviews,
					resume preparation and placement support.

				</p>

				<div class="row mt-4">

					<div class="col-6 mb-3">

						<div class="card shadow-sm border-0">

							<div class="card-body text-center">

								<h5 class="text-primary">
									Expert Trainers
								</h5>

							</div>

						</div>

					</div>

					<div class="col-6 mb-3">

						<div class="card shadow-sm border-0">

							<div class="card-body text-center">

								<h5 class="text-success">
									Live Projects
								</h5>

							</div>

						</div>

					</div>

				</div>

			</div>

		</div>

	</div>

	<!-- ================= COURSES ================= -->

	<div class="container mt-5"
		id="courses">

		<h2 class="text-center font-weight-bold mb-5">

			Our Popular Courses

		</h2>

		<div class="row">

			<div class="col-md-4 mb-4">

				<div class="card shadow border-0 h-100">

					<img
						src="https://images.unsplash.com/photo-1515879218367-8466d910aaa4?q=80&w=1200"
						class="card-img-top"
						style="height:220px; object-fit:cover;">

					<div class="card-body text-center">

						<h4>Java Full Stack</h4>

						<p class="text-muted">

							Java, Spring Boot,
							MySQL, React.js

						</p>

						<button class="btn btn-primary">

							Read More

						</button>

					</div>

					<div class="card-footer text-center bg-success text-white">

						Duration : 6 Months

					</div>

				</div>

			</div>

			<div class="col-md-4 mb-4">

				<div class="card shadow border-0 h-100">

					<img
						src="https://images.unsplash.com/photo-1555066931-4365d14bab8c?q=80&w=1200"
						class="card-img-top"
						style="height:220px; object-fit:cover;">

					<div class="card-body text-center">

						<h4>MERN Stack</h4>

						<p class="text-muted">

							MongoDB, Express.js,
							React.js, Node.js

						</p>

						<button class="btn btn-primary">

							Read More

						</button>

					</div>

					<div class="card-footer text-center bg-success text-white">

						Duration : 6 Months

					</div>

				</div>

			</div>

			<div class="col-md-4 mb-4">

				<div class="card shadow border-0 h-100">

					<img
						src="https://images.unsplash.com/photo-1516321318423-f06f85e504b3?q=80&w=1200"
						class="card-img-top"
						style="height:220px; object-fit:cover;">

					<div class="card-body text-center">

						<h4>MEAN Stack</h4>

						<p class="text-muted">

							Angular, Node.js,
							Express.js, MySQL

						</p>

						<button class="btn btn-primary">

							Read More

						</button>

					</div>

					<div class="card-footer text-center bg-success text-white">

						Duration : 4 Months

					</div>

				</div>

			</div>

		</div>

	</div>

	<!-- ================= PLACEMENT SECTION ================= -->

	<div class="container mt-5"
		id="placements">

		<h2 class="text-center font-weight-bold mb-5">

			Top Recruiters

		</h2>

		<div class="row text-center">

			<div class="col-md-3 mb-3">

				<div class="card shadow border-0 p-4">

					<h4>TCS</h4>

				</div>

			</div>

			<div class="col-md-3 mb-3">

				<div class="card shadow border-0 p-4">

					<h4>Infosys</h4>

				</div>

			</div>

			<div class="col-md-3 mb-3">

				<div class="card shadow border-0 p-4">

					<h4>Wipro</h4>

				</div>

			</div>

			<div class="col-md-3 mb-3">

				<div class="card shadow border-0 p-4">

					<h4>Accenture</h4>

				</div>

			</div>

		</div>

	</div>

	<!-- ================= CONTACT ================= -->

	<div class="container mt-5 mb-5"
		id="contact">

		<div class="card shadow border-0">

			<div class="card-body p-5">

				<h2 class="text-center font-weight-bold mb-4">

					Contact Us

				</h2>

				<div class="row">

					<div class="col-md-6">

						<div class="form-group">

							<label>Name</label>

							<input type="text"
								class="form-control">

						</div>

					</div>

					<div class="col-md-6">

						<div class="form-group">

							<label>Email</label>

							<input type="email"
								class="form-control">

						</div>

					</div>

				</div>

				<div class="form-group">

					<label>Message</label>

					<textarea class="form-control"
						rows="5"></textarea>

				</div>

				<button class="btn btn-primary btn-block">

					Send Message

				</button>

			</div>

		</div>

	</div>

	<!-- ================= FOOTER ================= -->

	<footer class="bg-dark text-white p-5">

		<div class="container">

			<div class="row">

				<div class="col-md-4">

					<h4>Placement Tracker</h4>

					<p class="text-light">

						Professional training institute
						for full stack development.

					</p>

				</div>

				<div class="col-md-4">

					<h4>Quick Links</h4>

					<p>

						Home <br>
						About <br>
						Courses <br>
						Placements

					</p>

				</div>

				<div class="col-md-4">

					<h4>Contact</h4>

					<p>

						Email : info@gmail.com <br>
						Phone : +91 9876543210 <br>
						Pune, Maharashtra

					</p>

				</div>

			</div>

			<hr class="bg-white">

			<p class="text-center mb-0">

				© 2026 Placement Tracker |
				All Rights Reserved

			</p>

		</div>

	</footer>

	<script
		src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"></script>

	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.min.js"></script>

</body>

</html>