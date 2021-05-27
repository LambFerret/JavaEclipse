package java_20210527;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DeptDao {
	private static DeptDao single;
	private  DeptDao() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("도라이버 로드 성공!");
		} catch (ClassNotFoundException e) {
			System.out.println("도라이버 로드 실패 ㅠㅠ");
		}
	}
	
	public static DeptDao getInstance() {
		if (single == null) {
			single = new DeptDao();
		}
		return single;
	}
	
	public boolean insert(DeptDto dto) {
		boolean success = false;
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssc", "root", "root1234");
			System.out.println("데베 연결 성공!");
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO dept(deptno, dname,loc) VALUES (?,?,?)");


			pstmt = con.prepareStatement(sql.toString());
			int index = 1;
			pstmt.setInt(index++, dto.getno());
			pstmt.setString(index++, dto.getname());
			pstmt.setString(index++, dto.getLoc());
			
			pstmt.executeUpdate();
			success = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return success;
	}
	public boolean update(DeptDto dto) {
		boolean success = false;
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssc", "root", "root1234");
			System.out.println("데베 연결 성공!");
			StringBuilder sql = new StringBuilder();
			sql.append("update dept");
			sql.append("set dname = ? , loc = ? ");
			sql.append("where no = ? ");

			pstmt = con.prepareStatement(sql.toString());
			int index = 1;
			pstmt.setString(index++, dto.getname());
			pstmt.setString(index++, dto.getLoc());
			pstmt.setInt(index, dto.getno());
			
			pstmt.executeUpdate();
			success = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return success;
	}
	public boolean delete(DeptDto dto) {
		boolean success = false;
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssc", "root", "root1234");
			System.out.println("데베 연결 성공!");
			StringBuilder sql = new StringBuilder();
			sql.append("delete ");
			sql.append("from dept ");
			sql.append("where no = ? ");

			pstmt = con.prepareStatement(sql.toString());
			int index = 1;
			pstmt.setInt(index, dto.getno());
			
			pstmt.executeUpdate();
			success = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return success;
	}
	public ArrayList<DeptDto> select(int start, int len) {
		ArrayList<DeptDto> arr1 = new ArrayList<DeptDto>();
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
			sql.append("select * from dept order by deptno asc limit ?,? ");
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
				arr1.add(new DeptDto(num, name, addr));

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
	
	
	
	

