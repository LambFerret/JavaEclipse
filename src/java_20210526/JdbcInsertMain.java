package java_20210526;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcInsertMain {

	public static void main(String[] args) {
		try {

//			1. 드라이버랑 연결
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("도라이버 로드 성공!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		Connection con = null;
		PreparedStatement pstmt = null;

//			2. database와 연결하는 Connection 객체 생성
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssc", // url
					"root", // user
					"root1234"); // password
			System.out.println("데베 연결 성공!");
//			위에까지가 데베랑 연결 

//			3. SQL문을 전송할 수 있는 PreparedStatement객체를 생성
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO member(num, NAME, addr) VALUES (?,?,?)");
			pstmt = con.prepareStatement(sql.toString());

//			4.바인딩 변수 설정하기 (?,?,?)해둔거 ㅇㅇ
			pstmt.setInt(1, 11);
			pstmt.setString(2, "퐁퐁부인");
			pstmt.setString(3, "비키니시티");

			
			
			
			
			
//			5. SQL 전송!
			int resultCount = pstmt.executeUpdate();
			System.out.println("갱신된 행의 수 : " + resultCount);

//			여기까지 sql에 명령문
//			밑은 예외처리들
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
