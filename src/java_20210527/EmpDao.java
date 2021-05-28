package java_20210527;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmpDao {
	private static EmpDao single;

	private EmpDao() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("도라이버 로드 성공!");
		} catch (ClassNotFoundException e) {
			System.out.println("도라이버 로드 실패 ㅠㅠ");
		}
	}

	public static EmpDao getInstance() {
		if (single == null) {
			single = new EmpDao();
		}
		System.out.println("column : empno, ename , job   , mgr , hiredate, sal   , comm  , deptno");
		System.out.println("       : Int  , String, String, Int , String  , Double, Double, Int");
		System.out.println("입니다. ");
		return single;
	}

	public boolean insert(EmpDto dto) {
		boolean success = false;
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssc", // url
					"root", // user
					"root1234"); // password
			System.out.println("데베 연결 성공!");

			StringBuilder sql = new StringBuilder();
			sql.append("insert into emp(empno, ename, job, ");
			sql.append("mgr, hiredate, sal, comm, deptno) ");
			sql.append("VALUES (?,?,?,?,?,?,?,?) ");
			pstmt = con.prepareStatement(sql.toString());
			int index = 1;
			pstmt.setInt(index++, dto.getNo());
			pstmt.setString(index++, dto.getName());
			pstmt.setString(index++, dto.getJob());
			pstmt.setInt(index++, dto.getManagerNo());
			pstmt.setString(index++, dto.getHiredate());
			pstmt.setDouble(index++, dto.getSal());
			pstmt.setDouble(index++, dto.getComm());
			pstmt.setInt(index++, dto.getDeptNo());

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

	public boolean update(EmpDto dto) {
		boolean success = false;
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssc", // url
					"root", // user
					"root1234"); // password
			System.out.println("데베 연결 성공!");

			StringBuilder sql = new StringBuilder();

			sql.append("update emp ");
			sql.append("set ename = ? , job = ?,mgr = ?, hiredate = ?, ");
			sql.append("set sal = ? , comm = ?,deptno = ? ");
			sql.append("where empno = ? ");

			pstmt = con.prepareStatement(sql.toString());
			int index = 1;
			pstmt.setString(index++, dto.getName());
			pstmt.setString(index++, dto.getJob());
			pstmt.setInt(index++, dto.getManagerNo());
			pstmt.setString(index++, dto.getHiredate());
			pstmt.setDouble(index++, dto.getSal());
			pstmt.setDouble(index++, dto.getComm());
			pstmt.setInt(index++, dto.getDeptNo());
			pstmt.setInt(index++, dto.getNo());

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
			System.out.println(dto.getNo() + " update 성공!");
		} else {
			System.out.println("update 실패!");
		}
		return success;

	}

	public boolean delete(EmpDto dto) {
		boolean success = false;
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssc", // url
					"root", // user
					"root1234"); // password
			System.out.println("데베 연결 성공!");

			StringBuilder sql = new StringBuilder();
			sql.append("delete ");
			sql.append("from emp ");
			sql.append("where empno = ? ");
			pstmt = con.prepareStatement(sql.toString());
			int index = 1;
			pstmt.setInt(index++, dto.getNo());

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
			System.out.println(dto.getNo() + "번의" + dto.getName() + " delete 성공!");
		} else {
			System.out.println("delete 실패!");
		}
		return success;
	}

	public ArrayList<EmpDto> select(int start, int len) {
		ArrayList<EmpDto> arr1 = new ArrayList<EmpDto>();
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
			System.out.println("데베 연결 성공!");
			StringBuilder sql = new StringBuilder();
			sql.append("select * from emp order by empno asc limit ?,? ");
			pstmt = con.prepareStatement(sql.toString());
			int index = 1;
			pstmt.setInt(index++, start);
			pstmt.setInt(index++, len);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				index = 1;
				int no = rs.getInt(index++);
				String name = rs.getString(index++);
				String job = rs.getString(index++);
				int managerNo = rs.getInt(index++);
				String hiredate = rs.getString(index++);
				double sal = rs.getDouble(index++);
				double comm = rs.getDouble(index++);
				int deptNo = rs.getInt(index++);
				arr1.add(new EmpDto(no, name, job, managerNo, hiredate, sal, comm, deptNo));

				for (EmpDto dto :  arr1) {
					System.out.printf("%d,%s,%s,%d,%s,%.1f,%.1f,%d %n",
							dto.getNo(), dto.getName(), dto.getJob(),
							dto.getManagerNo(), dto.getHiredate(), dto.getSal(),
							dto.getComm(), dto.getDeptNo());
				}
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
