package repository;

import model.PlacementModel;

public class ApplyCompanyRepositoryImpl
extends DBConfig
implements ApplyCompanyRepository {

	@Override
	public boolean isApplyCompany(
			PlacementModel pmodel) {

		try
		{
			pstmt = conn.prepareStatement(

			"insert into placement(sid,cid,apply_date,status) values(?,?,curdate(),?)");

			pstmt.setInt(1,
					pmodel.getSid());

			pstmt.setInt(2,
					pmodel.getCid());

			pstmt.setString(3,
					pmodel.getStatus());

			int value =
					pstmt.executeUpdate();

			if(value > 0)
			{
				return true;
			}
		}
		catch(Exception e)
		{
			System.out.println(
			"Error is " + e);
		}

		return false;
	}
}