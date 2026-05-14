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

		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Admin Login</title>");

		out.println("<link rel='stylesheet' "
				+ "href='https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css'>");

		out.println("<style>");
		out.println("body{"
				+ "background:#f2f2f2;"
				+ "height:100vh;"
				+ "display:flex;"
				+ "justify-content:center;"
				+ "align-items:center;"
				+ "}");

		out.println(".login-box{"
				+ "width:400px;"
				+ "background:white;"
				+ "padding:40px;"
				+ "border-radius:10px;"
				+ "box-shadow:0px 0px 15px rgba(0,0,0,0.2);"
				+ "}");

		out.println(".title{"
				+ "text-align:center;"
				+ "margin-bottom:30px;"
				+ "font-weight:bold;"
				+ "}");

		out.println("</style>");

		out.println("</head>");
		out.println("<body>");

		out.println("<div class='login-box'>");

		out.println("<h2 class='title'>Admin Login</h2>");

		out.println("<form action='adminLogin' method='post'>");

		out.println("<div class='form-group'>");
		out.println("<label>Email</label>");
		out.println("<input type='email' name='email' class='form-control' placeholder='Enter Email'>");
		out.println("</div>");

		out.println("<div class='form-group'>");
		out.println("<label>Password</label>");
		out.println("<input type='password' name='password' class='form-control' placeholder='Enter Password'>");
		out.println("</div>");

		out.println("<button type='submit' name='s' class='btn btn-primary btn-block'>Login</button>");

		out.println("</form>");

		out.println("</div>");

		out.println("</body>");
		out.println("</html>");
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