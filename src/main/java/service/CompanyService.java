package service;

import java.util.ArrayList;

import model.AddCompanyModel;

public interface CompanyService {

	public boolean isAddCompany(AddCompanyModel amodel);
	public ArrayList<AddCompanyModel> getAllCompanies();
}