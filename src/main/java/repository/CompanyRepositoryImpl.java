package repository;

import java.util.ArrayList;

import model.AddCompanyModel;

public class CompanyRepositoryImpl extends DBConfig implements CompanyRepository {

	@Override
	public boolean isAddCompany(AddCompanyModel amodel) {

		try {

			pstmt = conn.prepareStatement(
				"insert into company values('0',?,?,?,?)"
			);

			pstmt.setString(1, amodel.getCompany_name());
			pstmt.setInt(2, amodel.getCompany_package());
			pstmt.setString(3, amodel.getLocation());
			pstmt.setDouble(4, amodel.getCompany_criteria());

			int value = pstmt.executeUpdate();
			System.out.println(value);

			if (value>0) {
				return true;
			}

		} catch (Exception e) {
			System.out.println(e);
		}

		return false;
	}

	public ArrayList<AddCompanyModel> getAllCompanies() {
		ArrayList<AddCompanyModel> list = new ArrayList<>();
		try
		{
			pstmt=conn.prepareStatement("select * from company");
			rs=pstmt.executeQuery();
			while(rs.next())
			{
				AddCompanyModel amodel=new AddCompanyModel();
				
				amodel.setId(rs.getInt(1));

				amodel.setCompany_name(rs.getString(2));

				amodel.setCompany_package(rs.getInt(3));

				amodel.setLocation(rs.getString(4));

				amodel.setCompany_criteria(rs.getDouble(5));
				list.add(amodel);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return list;
	}

	
	
}