package service;

import java.util.ArrayList;

import model.AddCompanyModel;
import model.AddStudentModel;

public interface StudentRegisterService {
	public boolean isAddStudent(AddStudentModel asmodel);
	public ArrayList<AddCompanyModel> getAllStudent();
	public boolean isDeleteStudent(AddStudentModel amodel);
}
