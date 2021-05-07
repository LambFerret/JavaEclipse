package java_20210507;

public class StaticMethodDemo {
	String name;
	static double interestRate;
	public void m1() {
		System.out.println("instance method m1() 호출");
		
	}
	public void m2() {
//		istance method 에서는 모든 변수 사용가능 모든 메소드 호출 가능
		this.name = "뚱이";
		StaticMethodDemo.interestRate = 3.5;
		this.m1();
		StaticMethodDemo.m3();
	}
	public static void m3() {
		System.out.println("this is m3()");
	}

	public static void m4() {
//		static method에서는 static변수와 static 메소드만 사용 가능
//		name = "징징이";
		
		interestRate = 4.3;
//		m1();
		m3();
	}
	public static void main(String args[]) {
		m3();
		m4();
		interestRate = 4.3;
		StaticMethodDemo smd = new StaticMethodDemo();
		smd.name = "다람이";
		smd.m1();
	}
}
