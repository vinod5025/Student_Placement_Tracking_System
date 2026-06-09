package repository;

import java.util.ArrayList;

import model.PlacementModel;

public class ViewAppliedStudentRepositoryImp extends DBConfig implements ViewAppliedStudentRepository {
	ArrayList<PlacementModel> list = new ArrayList<>();

	@Override
	public ArrayList<PlacementModel> getAppliedStudents() {

		try {
			pstmt = conn.prepareStatement(
"select p.id,s.name,c.company_name,p.apply_date,p.status from placement p inner join student s on p.sid=s.sid inner join company c on p.cid=c.cid");
			rs = pstmt.executeQuery();
			while (rs.next()) {
				PlacementModel pmodel = new PlacementModel();

				pmodel.setId(rs.getInt(1));

				pmodel.setStudentName(rs.getString(2));

				pmodel.setCompanyName(rs.getString(3));

				pmodel.setApply_date(rs.getString(4));

				pmodel.setStatus(rs.getString(5));

				list.add(pmodel);
			}
		} catch (Exception e) {
			System.out.print(e);
		}
		return list;
	}

}
