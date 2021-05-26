package java_20210526;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcUpdateMain {

	public static void main(String[] args) {
//		1. 드라이브 로드
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("도라이버 로드 성공!");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("도라이버 로드 실패 ㅠㅠ");
		}
		
//		2. 데베와 연결할 수 있는 Connection 객체 생성
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssc","root","root1234");
			System.out.println("데베 연결 성공!");
//		3. SQL문을 전송할 수 있는 PreparedStatement 객체 생성
			StringBuilder sql = new StringBuilder();
			sql.append("update member ");
			sql.append("set name = ? , addr = ? ");
			sql.append("where num = ? ");
			
			pstmt = con.prepareStatement(sql.toString());
//		4. 바인딩 변수 설정
			int index =1;
			pstmt.setString(index++, "핑핑이1");
			pstmt.setString(index++, "파인애플");
			pstmt.setInt(index, 13);
			
//		5. SQL문을 전송
			int Count = pstmt.executeUpdate();
			System.out.println(Count+"개 전송 되었습니다.");
//		6. 모든 자원을 반납
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) pstmt.close();
				if (con != null) con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
