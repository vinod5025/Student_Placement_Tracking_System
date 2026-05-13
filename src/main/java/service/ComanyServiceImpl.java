package service;

import java.util.ArrayList;

import model.AddCompanyModel;
import repository.CompanyRepositoryImpl;

public class ComanyServiceImpl implements CompanyService {

	CompanyRepositoryImpl cr = new CompanyRepositoryImpl();

	@Override
	public boolean isAddCompany(AddCompanyModel amodel) {

		return cr.isAddCompany(amodel);
	}

	@Override
	public ArrayList<AddCompanyModel> getAllCompanies() {
		return cr.getAllCompanies();
	}
}