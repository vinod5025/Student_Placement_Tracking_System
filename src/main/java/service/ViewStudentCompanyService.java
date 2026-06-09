package service;

import java.util.ArrayList;

import model.AddCompanyModel;

public interface ViewStudentCompanyService {
public ArrayList<AddCompanyModel> getAllCompanies();
public boolean isApplied(int studentId, int companyId);
}
