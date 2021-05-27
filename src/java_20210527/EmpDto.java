package java_20210527;

public class EmpDto {
	private int no;
	private String name;
	private String job;
	private int managerNo;
	private String hiredate;
	private double sal;
	private double comm;
	private int deptNo;
	public EmpDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmpDto(int no, String name, String job, int managerNo, String hiredate, double sal, double comm,
			int deptNo) {
		super();
		this.no = no;
		this.name = name;
		this.job = job;
		this.managerNo = managerNo;
		this.hiredate = hiredate;
		this.sal = sal;
		this.comm = comm;
		this.deptNo = deptNo;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getManagerNo() {
		return managerNo;
	}
	public void setManagerNo(int managerNo) {
		this.managerNo = managerNo;
	}
	public String getHiredate() {
		return hiredate;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public double getComm() {
		return comm;
	}
	public void setComm(double comm) {
		this.comm = comm;
	}
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	

}
