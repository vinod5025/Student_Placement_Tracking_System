package service;

import model.PlacementModel;
import repository.ApplyCompanyRepositoryImpl;

public class ApplyCompanyServiceImpl implements ApplyCompanyService {
	ApplyCompanyRepositoryImpl ar = new ApplyCompanyRepositoryImpl();

	@Override
	public boolean isApplyCompany(PlacementModel pmodel) {
		return ar.isApplyCompany(pmodel);
	}

}
