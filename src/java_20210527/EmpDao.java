package java_20210527;

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
		return single;
	}
	
}
