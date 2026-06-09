package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.AddCompanyModel;
import service.ComanyServiceImpl;

import java.io.IOException;
@WebServlet("/deleteCompany")
public class DeleteCompanyController extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
int cid=Integer.parseInt(request.getParameter("cid"));
			AddCompanyModel am=new AddCompanyModel();
			am.setId(cid);
	ComanyServiceImpl ci=new ComanyServiceImpl();
	boolean res=ci.isDeleteCompany(am);
	if(res) System.out.print(res);
	else System.out.print(res);
		}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
