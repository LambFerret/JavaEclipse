package java_20210527;

//	1. Member 테이블을 객체화
//	용도 : 1. 매개변수를 줄일 목적, 2. 테이블내 한개의 row를 객체화하기 위해
public class MemberDTO {
//	Member 테이블의 컬럼을 멤버변수로 설정한다. 
	private int num;
	private String name;
	private String addr;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public MemberDTO(int num, String name, String addr) {
		super();
		this.num = num;
		this.name = name;
		this.addr = addr;
	}
	public MemberDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
