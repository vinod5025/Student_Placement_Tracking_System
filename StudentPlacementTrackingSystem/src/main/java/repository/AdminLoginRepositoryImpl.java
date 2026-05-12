package repository;

import model.AdminLoginModel;

public class AdminLoginRepositoryImpl  extends DBConfig implements AdminLoginRepository {

	@Override
	public boolean isAddminLogin(AdminLoginModel adminLogin) {
		boolean result=false;
		System.out.println("adminLogin:::"+adminLogin);
		try
		{
			pstmt=conn.prepareStatement("select * from admin where email=? and password=?");
			pstmt.setString(1,adminLogin.getEmail());
			pstmt.setString(2,adminLogin.getPassword());
			rs=pstmt.executeQuery();
		
			System.out.println("rs null ???=="+(rs==null));
			if(rs!=null)
			{
				result= true;
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		System.out.println("result====="+result);
		return result;
	}

}
