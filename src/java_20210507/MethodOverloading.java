package java_20210507;

public class MethodOverloading {
	public void print(String str) {
		System.out.println(str);
	}
	public void print(int in) {
		System.out.println(in);
	}
	public void print(double d) {
		System.out.println(d);
	}
	public void print(boolean b) {
		System.out.println(b);
	}
	public static void main(String args[]) {
		MethodOverloading demo = new MethodOverloading();
		demo.print("가나다"+"하하");
		demo.print(123123);
		
	}
}
