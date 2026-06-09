package repository;

import model.StudentLoginModel;

public class StudentLoginRepositoryImpl extends DBConfig {

	public boolean isLogin(StudentLoginModel smodel) {

		try {
			pstmt = conn.prepareStatement(

					"select * from student where email=? and password=?");

			pstmt.setString(1, smodel.getEmail());

			pstmt.setString(2, smodel.getPassword());

			rs = pstmt.executeQuery();

			if (rs.next()) {
				smodel.setSid(rs.getInt("sid"));

				smodel.setEmail(rs.getString("email"));

				return true;
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		return false;
	}

	public int getStudentId(String email) {

		int id = 0;

		try {

			pstmt = conn.prepareStatement("select sid from student where email=?");

			pstmt.setString(1, email);

			rs = pstmt.executeQuery();

			if (rs.next()) {

				id = rs.getInt(1);
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

		return id;
	}
}