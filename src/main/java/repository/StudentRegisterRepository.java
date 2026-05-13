package repository;

import java.util.ArrayList;

import model.AddStudentModel;

public interface StudentRegisterRepository {
	public boolean isAddStudent(AddStudentModel smodel);
	public ArrayList<AddStudentModel> getAllStudent();

}
