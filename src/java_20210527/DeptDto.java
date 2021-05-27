package java_20210527;

public class DeptDto {
	private int no;
	private String name;
	private String loc;
	public DeptDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DeptDto(int no, String name, String loc) {
		super();
		this.no = no;
		this.name = name;
		this.loc = loc;
	}
	public int getno() {
		return no;
	}
	public void setno(int no) {
		this.no = no;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
}
