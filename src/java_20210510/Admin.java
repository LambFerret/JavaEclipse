package java_20210510;

public class Admin {
	private String id;
	private String pwd;
	private String email;
	private int level;
	
	
//	디폴트 생성자
//	생성자 -> [접근한정자] [클래스 이름] () {}
//	생성자는 반환값이 없다.
//	생성자의 역할은 인스턴스 변수 초기화 
//	생성자는 
	public Admin() {
//		모든 생성자에는 super()가 숨어있음
//		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public Admin(String id, String pwd, String email, int level) {
		this.id = id;
		this.pwd = pwd;
		this.email = email;
		this.level = level;
	}
}
