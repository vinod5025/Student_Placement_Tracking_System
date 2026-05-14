package repository;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBConfig {

	protected Connection conn;
	protected PreparedStatement pstmt;
	protected ResultSet rs;

	public DBConfig() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/placement_tracking_system",
					"root",
					"vinod");

			System.out.println("Database Connected");

		} catch (Exception e) {
			System.out.println("Error : " + e);
		}
	}
}