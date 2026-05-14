package service;

import model.AddCompanyModel;
import model.AddStudentModel;

public interface getCountService {
public int getStudentsCount(AddStudentModel amodel);
public int getCompaniesCount(AddCompanyModel cmodel);
}
