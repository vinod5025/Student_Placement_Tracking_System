package service;

import java.util.ArrayList;

import model.AddCompanyModel;
import model.AddStudentModel;
import repository.StudentRegisterRepositoryImpl;

public class StudentRegisterServiceImpl implements StudentRegisterService {

	StudentRegisterRepositoryImpl rimpl=new StudentRegisterRepositoryImpl();
	
	@Override
	public boolean isAddStudent(AddStudentModel asmodel) {
		return rimpl.isAddStudent(asmodel);
	}

	@Override
	public ArrayList getAllStudent() {
		return rimpl.getAllStudent();
	}
	public boolean isDeleteStudent(AddStudentModel amodel)
	{
		return rimpl.isDeleteStudent(amodel);
	}

	
	

}
