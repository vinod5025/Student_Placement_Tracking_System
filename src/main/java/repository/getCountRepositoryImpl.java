package repository;

import model.AddCompanyModel;
import model.AddStudentModel;

public class getCountRepositoryImpl extends DBConfig implements getCountRepository{

	int scount=0;
	int ccount=0;
	@Override
	public int getStudentsCount(AddStudentModel amodel) {
		try
		{
		pstmt=conn.prepareStatement("select count(*) from student");
		rs=pstmt.executeQuery();
		while(rs.next())
		{
			scount=rs.getInt(1);
		}
		
		}catch(Exception e)
		{
			System.out.println("e");
		}
		
		return scount ;
	}
	@Override
	public int getCompaniesCount(AddCompanyModel cmodel) {
		
		try
		{
		pstmt=conn.prepareStatement("select count(*) from company");
		rs=pstmt.executeQuery();
		while(rs.next())
		{
			ccount=rs.getInt(1);
		}
		
		}catch(Exception e)
		{
			System.out.println("e");
		}
		
		return ccount ;
	}

}
