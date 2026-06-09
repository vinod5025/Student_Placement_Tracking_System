package repository;

import model.AddCompanyModel;

public interface CompanyRepository {

	public boolean isAddCompany(AddCompanyModel amodel);
	public boolean isDeleteCompany(AddCompanyModel amodel);
}