package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class StudentDashbaordController
 */
@WebServlet("/studentDashboard")
public class StudentDashbaordController extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			RequestDispatcher header = request.getRequestDispatcher("Student/header.html");
			header.include(request, response);
			
			
			RequestDispatcher footer= request.getRequestDispatcher("Student/footer.html");
			footer.include(request, response);
			
			
			
		}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
