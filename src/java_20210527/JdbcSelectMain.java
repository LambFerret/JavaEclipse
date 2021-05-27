package java_20210527;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcSelectMain {

	public static void main(String[] args) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssc", "root", "root1234");
			StringBuilder sql = new StringBuilder();
			sql.append("select * from member order by num asc limit ?,? ");
			pstmt = con.prepareStatement(sql.toString());
			int index = 1;
			pstmt.setInt(index++, 0);
			pstmt.setInt(index++, 5);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int num = rs.getInt(1);
				String name = rs.getString(2);
				String addr = rs.getString(3);
				System.out.printf("%d,%s,%s%n", num, name, addr);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
				if (pstmt != null)
					pstmt.close();
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
