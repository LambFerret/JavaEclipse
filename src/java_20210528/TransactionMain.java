package java_20210528;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("도라이버 로드 성공!");
		} catch (ClassNotFoundException e) {
			System.out.println("도라이버 로드 실패 ㅠㅠ");
		}
		boolean success = false;
		Connection con = null;
		PreparedStatement pstmt1 = null;
		PreparedStatement pstmt2 = null;

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssc", "root", "root1234");
			System.out.println("데베 연결 성공!");

//			트랜잭션 시작
			con.setAutoCommit(false);

			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO member(num, name , addr) VALUES (20,'igotit','igot1')");
			pstmt1 = con.prepareStatement(sql.toString());
			pstmt1.executeUpdate();

			sql.setLength(0);
			sql.append("INSERT INTO member(num, name , addr) VALUES (8,'igotit','igot1')");
			pstmt2 = con.prepareStatement(sql.toString());
			pstmt2.executeUpdate();

			success = true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (success) {
					con.commit();
				} else {
					con.rollback();
				}
//				Connection Pool 사용할때 반드시 해저야하는거 :
				con.setAutoCommit(true);
				if (con != null)
					con.close();
				if (pstmt1 != null)
					pstmt1.close();
				if (pstmt2 != null)
					pstmt2.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
}
