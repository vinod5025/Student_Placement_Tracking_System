package repository;

import model.AddCompanyModel;
import model.AddStudentModel;

public interface getCountRepository {

public int getStudentsCount(AddStudentModel amodel);
public int getCompaniesCount(AddCompanyModel cmodel);
}
