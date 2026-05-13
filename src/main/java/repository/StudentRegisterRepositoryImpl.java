package repository;

import java.util.ArrayList;

import model.AddCompanyModel;
import model.AddStudentModel;

public class StudentRegisterRepositoryImpl extends DBConfig implements StudentRegisterRepository{

	@Override
	public boolean isAddStudent(AddStudentModel smodel) {
		try
		{   
			pstmt=conn.prepareStatement("insert into student values ('0',?,?,?,?,?,?,?,?)");
			pstmt.setString(1, smodel.getName());

			pstmt.setString(2, smodel.getEmail());
			pstmt.setString(3, smodel.getPassword());

			pstmt.setString(4, smodel.getContact());

			pstmt.setString(5, smodel.getQualification());

			pstmt.setInt(6, smodel.getPassing_year());

			pstmt.setFloat(7, smodel.getPercentage());

			pstmt.setString(8, smodel.getCname());
			int value =pstmt.executeUpdate();
			
			if(value!=0)
			{
				return true;
			}
			else
			{
				return false;
			}
			
		}catch(Exception e)
		{
			System.out.println("Error is "+e);
		}
		return false;
	}

	

	@Override
	public ArrayList<AddStudentModel> getAllStudent() {
		// TODO Auto-generated method stub
		ArrayList<AddStudentModel> list = new ArrayList<>();
		try
		{
			pstmt=conn.prepareStatement("select *from student");
			rs=pstmt.executeQuery();
			while(rs.next())
			{
				AddStudentModel as=new AddStudentModel();
				as.setId(rs.getInt(1));
				as.setName(rs.getString(2));
				as.setEmail(rs.getString(3));
				as.setPassword(rs.getString(4));
				as.setContact(rs.getString(5));
				as.setQualification(rs.getString(6));
				as.setPassing_year(rs.getInt(7));
				as.setPercentage(rs.getFloat(8));
				as.setCname(rs.getString(9));
				list.add(as);
				
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return list;
	}

}
