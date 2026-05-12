package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
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

		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Admin Login</title>");

		out.println("<link rel='stylesheet' "
				+ "href='https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css'>");

		out.println("<style>");
		out.println("body{");
		out.println("background:#f2f2f2;");
		out.println("height:100vh;");
		out.println("display:flex;");
		out.println("justify-content:center;");
		out.println("align-items:center;");
		out.println("}");

		out.println(".login-box{");
		out.println("width:400px;");
		out.println("background:white;");
		out.println("padding:40px;");
		out.println("border-radius:10px;");
		out.println("box-shadow:0px 0px 15px rgba(0,0,0,0.2);");
		out.println("}");

		out.println(".title{");
		out.println("text-align:center;");
		out.println("margin-bottom:30px;");
		out.println("font-weight:bold;");
		out.println("}");

		out.println("</style>");

		out.println("</head>");
		out.println("<body>");

		out.println("<div class='login-box'>");

		out.println("<h2 class='title'>Admin Login</h2>");

		out.println("<form action='' method='post'>");

		out.println("<div class='form-group'>");
		out.println("<label>Email</label>");
		out.println("<input type='email' name='email' "
				+ "class='form-control' placeholder='Enter Email'>");
		out.println("</div>");

		out.println("<div class='form-group'>");
		out.println("<label>Password</label>");
		out.println("<input type='password' name='password' "
				+ "class='form-control' placeholder='Enter Password'>");
		out.println("</div>");

		out.println("<button type='submit' name='s' "
				+ "class='btn btn-primary btn-block'>Login</button>");

		out.println("</form>");

		out.println("</div>");

		out.println("</body>");
		out.println("</html>");

		// Login Logic
		String button = request.getParameter("s");

		if (button != null) {

			String email = request.getParameter("email");
			String password = request.getParameter("password");

			AdminLoginModel admlogin = new AdminLoginModel();

			admlogin.setEmail(email);
			admlogin.setPassword(password);

			AdminLoginService admSrc = new AdminLoginService();

			boolean result = admSrc.isAdminLogin(admlogin);
			
			if (result) {
				out.println("success");
				
				response.sendRedirect("AdminDashboard");
				
			} else {
				System.out.println("Something went wrong...!");
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}
}