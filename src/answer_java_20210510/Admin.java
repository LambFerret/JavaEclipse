package answer_java_20210510;

public  class Admin {
	private String id;
	private String pwd;
	private String email;
	private int level;
	
	//디폴트 생성자
	//생성자 => [접근한정자] [클래스 이름](){}
	//생성자는 반환값이 없음.
	//생성자의 역할은 인스턴스 변수 초기화.
	//생성자는 overloading 가능
	//생성자의 접근 한정자는 인스턴스(new)의 유무를 결정한다.
	public Admin() {
		//super();
	}
	//this의 용법 2가지
	//1. 자기자신 객체 => this or this. => 위치는 메서드, 생성자 모두 사용
	//2. 다른 생성자를 호출 => this(~) => 위치는 생성자에서만 사용 가능
	public Admin(String id, String pwd, String email) {
		this(id,pwd,email,0);
	}
	public Admin(String id, String pwd, String email, int level) {
		//super();
		this.id = id;
		this.pwd = pwd;
		this.email = email;
		this.level = level;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
	public String getId() {
		return id;
	}
	public String getPwd() {
		return pwd;
	}
	public String getEmail() {
		return email;
	}
	public int getLevel() {
		return level;
	}
	
	
	
	
	
	
	
	
}
