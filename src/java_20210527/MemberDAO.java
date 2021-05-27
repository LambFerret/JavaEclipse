package java_20210527;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {
//	1. MemberDAO변수인 single을 static 변수로 설정
	private static MemberDAO single;

//	2. 생성자의 접근한전자를 private로 설정
//	이유 : 외부에서 객체 생성을 못하게 하기 위함
	private MemberDAO() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("도라이버 로드 성공!");
		} catch (ClassNotFoundException e) {
			System.out.println("도라이버 로드 실패 ㅠㅠ");
		}
	}

//	MemberDAO의 객체는 getInstance() 메소드로만 생성
//	getInstance() 메소드의 구현은 MemberDAO 객체를 한개만 생성할 수 있도록 만들어야함
//	static 메소드로 구현한 이유는 MemberDAO 객체를 외부에서 생성할 수 없기 때문 
	public static MemberDAO getInstance() {
		if (single == null) {
			single = new MemberDAO();
		}
		return single;
	}

	public boolean insert(MemberDTO dto) {
		boolean success = false;

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssc", // url
					"root", // user
					"root1234"); // password
			System.out.println("데베 연결 성공!");

			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO member(num, NAME, addr) VALUES (?,?,?)");
			pstmt = con.prepareStatement(sql.toString());
			int index = 1;
			pstmt.setInt(index++, dto.getNum());
			pstmt.setString(index++, dto.getName());
			pstmt.setString(index++, dto.getAddr());

			pstmt.executeUpdate();
			success = true;

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
		if (success) {
			System.out.println(dto.getName() + " insert 성공!");
		} else {
			System.out.println("insert 실패!");
		}
		return success;
	}

	public boolean update(MemberDTO dto) {
		boolean success = false;

		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssc", "root", "root1234");
			System.out.println("데베 연결 성공!");
			StringBuilder sql = new StringBuilder();
			sql.append("update member ");
			sql.append("set name = ? , addr = ? ");
			sql.append("where num = ? ");

			pstmt = con.prepareStatement(sql.toString());
			int index = 1;
			pstmt.setString(index++, dto.getName());
			pstmt.setString(index++, dto.getAddr());
			pstmt.setInt(index, dto.getNum());

			pstmt.executeUpdate();
			success = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		if (success) {
			System.out.println(dto.getName() + " Update 성공!");
		} else {
			System.out.println("Update 실패!");
		}
		return success;
	}

	public boolean delete(MemberDTO dto) {
		boolean success = false;
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssc", "root", "root1234");
			System.out.println("데베 연결 성공!");
			StringBuilder sql = new StringBuilder();
			sql.append("delete ");
			sql.append("from member ");
			sql.append("where num = ? ");

			pstmt = con.prepareStatement(sql.toString());
			int index = 1;
			pstmt.setInt(index, dto.getNum());

			pstmt.executeUpdate();
			success = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		if (success) {
			System.out.println(dto.getName() + " Delete 성공!");
		} else {
			System.out.println("Delete 실패!");
		}
		return success;
	}

	public ArrayList<MemberDTO> select(int start, int len) {
		ArrayList<MemberDTO> arr1 = new ArrayList<MemberDTO>();
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
			pstmt.setInt(index++, start);
			pstmt.setInt(index++, len);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				index = 1;
				int num = rs.getInt(index++);
				String name = rs.getString(index++);
				String addr = rs.getString(index++);
				arr1.add(new MemberDTO(num, name, addr));

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
		return arr1;

	}
}
