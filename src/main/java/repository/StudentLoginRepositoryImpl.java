package repository;

import model.StudentLoginModel;

public class StudentLoginRepositoryImpl extends DBConfig implements StudentLoginRepository {

	@Override
	public boolean isLogin(StudentLoginModel smodel) {
		try
		{
			pstmt=conn.prepareStatement("select *from student where email=? and password=?");
			pstmt.setString(1, smodel.getEmail());
			pstmt.setString(2, smodel.getPassword());
			rs=pstmt.executeQuery();
			if(rs.next())
			{
				return true;
			}
		}
		catch(Exception e)
		{
			System.out.println("Error is"+e);
		}
		return false;
	}

}
