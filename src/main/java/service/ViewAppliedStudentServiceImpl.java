package service;

import java.util.ArrayList;

import model.PlacementModel;
import repository.ViewAppliedStudentRepositoryImp;

public class ViewAppliedStudentServiceImpl implements ViewAppliedStudentService {
	ViewAppliedStudentRepositoryImp vr = new ViewAppliedStudentRepositoryImp();

	@Override
	public ArrayList<PlacementModel> getAppliedStudents() {

		return vr.getAppliedStudents();
	}

}
