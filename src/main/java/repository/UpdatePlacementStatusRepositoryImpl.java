package repository;

public class UpdatePlacementStatusRepositoryImpl extends DBConfig implements UpdatePlacementStatusRepository {

	@Override
	public boolean updateStatus(int id, String status) {

		try {

			pstmt = conn.prepareStatement("update placement set status=? where id=?");

			pstmt.setString(1, status);

			pstmt.setInt(2, id);

			int value = pstmt.executeUpdate();

			if (value > 0) {

				return true;
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

		return false;
	}
}