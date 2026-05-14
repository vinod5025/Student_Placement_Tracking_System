package repository;

import model.AdminLoginModel;

public class AdminLoginRepositoryImpl  extends DBConfig implements AdminLoginRepository {

	@Override
	public boolean isAddminLogin(AdminLoginModel adminLogin) {
		boolean result=false;
		
		try
		{
			pstmt=conn.prepareStatement("select * from admin where email=? and password=?");
			pstmt.setString(1,adminLogin.getEmail());
			pstmt.setString(2,adminLogin.getPassword());
			rs=pstmt.executeQuery();
		
			if(rs.next())
			{
				result= true;
			}
		}
		catch(Exception e)
		{
			System.out.println("error is "+e);
		}
		
		
		return result;
	}

}
