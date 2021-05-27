package java_20210526;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssc","root","root1234");
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO member(num, NAME, addr) VALUES (?,?,?) ");
			sql.append("INSERT INTO member(num, NAME, addr) VALUES (?,?,?) ");
			
			pstmt = con.prepareStatement(sql.toString());
			
			pstmt.setInt(1, 18);
			pstmt.setString(2, "구미베어");
			pstmt.setString(3, "메롱시티");
			pstmt.setInt(4, 19);
			pstmt.setString(5, "구미복치");
			pstmt.setString(6, "메롱시티");
			
			
			int count = pstmt.executeUpdate();
			System.out.println(count);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
				try {
					if (con != null)
					con.close();
					if (pstmt != null)
						pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}

}
