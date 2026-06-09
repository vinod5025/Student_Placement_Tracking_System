package controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import model.PlacementModel;
import service.ApplyCompanyServiceImpl;

@WebServlet("/applyCompany")
public class ApplyStudentController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		HttpSession session = request.getSession(false);

		// CHECK SESSION
		if (session != null && session.getAttribute("sid") != null) {

			int sid = (Integer) session.getAttribute("sid");

			int cid = Integer.parseInt(request.getParameter("cid"));

			PlacementModel pmodel = new PlacementModel();

			pmodel.setSid(sid);

			pmodel.setCid(cid);

			pmodel.setStatus("Applied");

			ApplyCompanyServiceImpl as = new ApplyCompanyServiceImpl();

			boolean b = as.isApplyCompany(pmodel);

			if (b) {

				response.sendRedirect("viewStudentCompany");

			} else {

				out.println("<h2>Application Failed</h2>");
			}

		} else {

			response.sendRedirect("studentLogin");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}
}