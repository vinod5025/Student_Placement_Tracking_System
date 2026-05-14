package repository;

import model.StudentLoginModel;

public class StudentLoginRepositoryImpl
extends DBConfig {

	public boolean isLogin(
			StudentLoginModel smodel) {

		try
		{
			pstmt = conn.prepareStatement(

			"select * from student where email=? and password=?");

			pstmt.setString(1,
					smodel.getEmail());

			pstmt.setString(2,
					smodel.getPassword());

			rs = pstmt.executeQuery();

			if(rs.next())
			{
				smodel.setSid(
						rs.getInt("sid"));

				smodel.setEmail(
						rs.getString("email"));

				return true;
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

		return false;
	}
}