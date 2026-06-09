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
	@Override
	public boolean isApplied(int studentId, int companyId) {
		return vc.isApplied(studentId,companyId);
	}

}
