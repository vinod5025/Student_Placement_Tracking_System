package service;

import model.AddCompanyModel;
import model.AddStudentModel;
import model.PlacementModel;

public interface getCountService {
	public int getStudentsCount(AddStudentModel amodel);

	public int getCompaniesCount(AddCompanyModel cmodel);

	public int getPlacedCount(PlacementModel pmodel);
}
