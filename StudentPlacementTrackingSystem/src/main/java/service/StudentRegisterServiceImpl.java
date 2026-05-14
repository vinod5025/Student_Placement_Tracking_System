package service;

import model.AddStudentModel;
import repository.StudentRegisterRepositoryImpl;

public class StudentRegisterServiceImpl implements StudentRegisterService {

	StudentRegisterRepositoryImpl rimpl=new StudentRegisterRepositoryImpl();
	
	@Override
	public boolean isAddStudent(AddStudentModel asmodel) {
		return rimpl.isAddStudent(asmodel);
	}

}
