package service;

import java.util.ArrayList;

import model.AddCompanyModel;
import repository.ViewStudentCompanyRepositoryImpl;

public class ViewStudentCompanyServiceImpl implements ViewStudentCompanyService {
ViewStudentCompanyRepositoryImpl vc=new ViewStudentCompanyRepositoryImpl();
	@Override
	public ArrayList<AddCompanyModel> getAllCompanies() {
		return vc.getAllCompanies();
	}

}
