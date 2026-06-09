package repository;

import java.util.ArrayList;

import model.AddCompanyModel;

public class ViewStudentCompanyRepositoryImpl extends DBConfig implements ViewStudentCompanyRepository{

	ArrayList<AddCompanyModel> list=new ArrayList<>();
	@Override
	public ArrayList<AddCompanyModel>  getAllCompanies() {
		try
		{
			pstmt=conn.prepareStatement("select *from company order by cid desc");
			
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
			System.out.print(e);
		}
		
		return list;
	}
	@Override
	public boolean isApplied(int studentId, int companyId) {

	    boolean flag = false;

	    try {
	    		pstmt=conn.prepareStatement( "SELECT * FROM placement WHERE sid=? and cid=?");

	    
	        pstmt.setInt(1, studentId);
	        pstmt.setInt(2, companyId);

	        rs = pstmt.executeQuery();

	        if (rs.next()) {
	            flag = true; // already applied
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return flag;
	}

}
