package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.AddStudentModel;
import service.StudentRegisterServiceImpl;

import java.io.IOException;
@WebServlet("/deleteStudent")
public class DeleteStudentController extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			int sid=Integer.parseInt(request.getParameter("sid"));
			AddStudentModel am=new AddStudentModel();
			StudentRegisterServiceImpl si=new  StudentRegisterServiceImpl();
			am.setId(sid);
			boolean res=si.isDeleteStudent(am);
			if(res)
			{
				response.sendRedirect("viewStudent");
			}
			else
			{
				System.out.print(res);
			}
		}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
