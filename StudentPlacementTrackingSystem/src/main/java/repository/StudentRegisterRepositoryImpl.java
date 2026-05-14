package repository;

import model.AddStudentModel;

public class StudentRegisterRepositoryImpl extends DBConfig implements StudentRegisterRepository{

	@Override
	public boolean isAddStudent(AddStudentModel smodel) {
		try
		{
			pstmt=conn.prepareStatement("insert into student values ('0',?,?,?,?,?,?,?)");
			pstmt.setString(1, smodel.getName());

			pstmt.setString(2, smodel.getEmail());

			pstmt.setString(3, smodel.getContact());

			pstmt.setString(4, smodel.getQualification());

			pstmt.setInt(5, smodel.getPassing_year());

			pstmt.setFloat(6, smodel.getPercentage());

			pstmt.setString(7, smodel.getCname());
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

}
