<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="UTF-8">

<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>Student Placement Tracking System</title>

<link rel="stylesheet" href="CSS/style.css">

<link rel="stylesheet"
href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">

<link rel="stylesheet"
href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css">

</head>

<body>

	<!-- Navbar -->

	<nav class="navbar navbar-expand-lg navbar-dark  bg-dark shadow" style="position:sticky;top:0px;z-index: 12;">
	
	

		<div class="container text-white">

			<!-- Logo -->

			<a class="navbar-brand font-weight-bold" href="#">

				<i class="fa-solid fa-graduation-cap mr-2"></i>

				Placement Tracker

			</a>

			<!-- Toggle Button -->

			<button class="navbar-toggler"
				type="button"
				data-toggle="collapse"
				data-target="#navbarSupportedContent">

				<span class="navbar-toggler-icon"></span>

			</button>

			<!-- Navbar Links -->

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

						<a class="nav-link text-white" href="#">

							<i class="fa-solid fa-circle-info mr-1"></i>

							About

						</a>

					</li>

					<li class="nav-item mx-2">

						<a class="nav-link text-white" href="#">

							<i class="fa-solid fa-briefcase mr-1"></i>

							Placements

						</a>

					</li>

					<li class="nav-item mx-2">

						<a class="nav-link text-white" href="#">

							<i class="fa-solid fa-phone mr-1"></i>

							Contact

						</a>

					</li>

					<!-- Dropdown -->

					<li class="nav-item dropdown mx-2">

						<a class="nav-link dropdown-toggle text-white"
							href="#"
							role="button"
							data-toggle="dropdown">

							<i class="fa-solid fa-user mr-1"></i>

							Login

						</a>

						<div class="dropdown-menu dropdown-menu-right">

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


	<div class="container-fluid p-0">

  <div id="carouselExampleControls" class="carousel slide" data-ride="carousel">

    <div class="carousel-inner">

      <div class="carousel-item active">
        <img src="https://images.unsplash.com/photo-1522202176988-66273c2fd55f?q=80&w=1200"
             class="d-block w-100" style="height:500px; object-fit:cover;">
        <div class="carousel-caption">
          <h2>Learn Java Full Stack</h2>
          <p>100% Placement Assistance</p>
          <button class="btn btn-primary">Join Now</button>
        </div>
      </div>

      <div class="carousel-item">
        <img src="https://images.unsplash.com/photo-1516321318423-f06f85e504b3?q=80&w=1200"
             class="d-block w-100" style="height:500px; object-fit:cover;">
        <div class="carousel-caption">
          <h2>Build Your Career</h2>
          <p>Industry Level Training</p>
        </div>
      </div>

      <div class="carousel-item">
        <img src="https://images.unsplash.com/photo-1498050108023-c5249f4df085?q=80&w=1200"
             class="d-block w-100" style="height:500px; object-fit:cover;">
        <div class="carousel-caption">
          <h2>Become Developer</h2>
          <p>Live Projects + Interview Prep</p>
        </div>
      </div>

    </div>

    <a class="carousel-control-prev" href="#carouselExampleControls" data-slide="prev">
      <span class="carousel-control-prev-icon"></span>
    </a>

    <a class="carousel-control-next" href="#carouselExampleControls" data-slide="next">
      <span class="carousel-control-next-icon"></span>
    </a>

  </div>

</div>

<!-- ================= COURSES ================= -->
<div class="container mt-5">

  <h3 class="text-center font-weight-bold mb-4">Our Courses</h3>

  <div class="row">

    <div class="col-md-4">

      <div class="card shadow"
     style="transition:0.3s;"
     onmouseover="this.style.transform='scale(1.05)'"
     onmouseout="this.style.transform='scale(1)'">

        <div class="card-header bg-primary text-white text-center">
          <h5 class="mb-0">Java Full Stack</h5>
        </div>

        <div class="card-body text-center p-2">

          <img src="https://images.unsplash.com/photo-1515879218367-8466d910aaa4?q=80&w=1200"
               class="img-fluid"
               style="height:200px; width:100%; object-fit:cover;">

          <p class="mt-3">
            Core Java, Spring Boot, React, MySQL, Projects
          </p>

          <button class="btn btn-primary btn-sm">
            Read More
          </button>

        </div>

        <div class="card-footer bg-success text-white text-center">
          Duration: 6 Months
        </div>

      </div>

    </div>
    <div class="col-md-4">

      <div class="card shadow"
     style="transition:0.3s;"
     onmouseover="this.style.transform='scale(1.05)'"
     onmouseout="this.style.transform='scale(1)'">

        <div class="card-header bg-primary text-white text-center">
          <h5 class="mb-0">Mean Stack Stack</h5>
        </div>

        <div class="card-body text-center p-2">

          <img src="https://images.unsplash.com/photo-1515879218367-8466d910aaa4?q=80&w=1200"
               class="img-fluid"
               style="height:200px; width:100%; object-fit:cover;">

          <p class="mt-3">
            HTML, CSS , JS , Bootstrap , Angular.js , Mysql, Node.js , Express.js
          </p>

          <button class="btn btn-primary btn-sm">
            Read More
          </button>

        </div>

        <div class="card-footer bg-success text-white text-center">
          Duration: 4 Months
        </div>

      </div>

    </div>
    <div class="col-md-4">

      <div class="card shadow"
     style="transition:0.3s;"
     onmouseover="this.style.transform='scale(1.05)'"
     onmouseout="this.style.transform='scale(1)'">

        <div class="card-header bg-primary text-white text-center">
          <h5 class="mb-0">Mern Full Stack</h5>
        </div>

        <div class="card-body text-center p-2">

          <img src="https://images.unsplash.com/photo-1515879218367-8466d910aaa4?q=80&w=1200"
               class="img-fluid"
               style="height:200px; width:100%; object-fit:cover;">

          <p class="mt-3">
            HTML, CSS , JS , Bootstrap , React.js , Mysql, Node.js , Express.js

          </p>

          <button class="btn btn-primary btn-sm">
            Read More
          </button>

        </div>

        <div class="card-footer bg-success text-white text-center">
          Duration: 6 Months
        </div>

      </div>

    </div>

  </div>

</div>

<!-- ================= FOOTER ================= -->
<footer class="bg-dark text-white mt-5 p-4">

  <div class="container">

    <div class="row">

      <div class="col-md-4">
        <h5>About Institute</h5>
        <p>
          We provide Java Full Stack training with real projects and placement support.
        </p>
      </div>

      <div class="col-md-4">
        <h5>Quick Links</h5>
        <p>Home | Courses | About | Contact</p>
      </div>

      <div class="col-md-4">
        <h5>Contact</h5>
        <p>Email: info@javafullstack.com</p>
        <p>Phone: +91 9876543210</p>
      </div>

    </div>

    <hr class="bg-white">

    <p class="text-center mb-0">
      © 2026 Java Full Stack Institute | All Rights Reserved
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