package repository;

import java.util.ArrayList;

import model.AddCompanyModel;

public interface ViewStudentCompanyRepository {
public ArrayList<AddCompanyModel> getAllCompanies();
public boolean isApplied(int studentId, int companyId);
}
