package service;

import model.AddCompanyModel;
import model.AddStudentModel;
import model.PlacementModel;
import repository.getCountRepositoryImpl;

public class getCountServiceImpl implements getCountService {

	getCountRepositoryImpl getCount = new getCountRepositoryImpl();

	public int getStudentsCount(AddStudentModel amodel) {
		return getCount.getStudentsCount(amodel);

	}

	@Override
	public int getCompaniesCount(AddCompanyModel cmodel) {

		return getCount.getCompaniesCount(cmodel);
	}

	public int getPlacedCount(PlacementModel pmodel) {
		return getCount.getPlacedCount(pmodel);
	}

}
