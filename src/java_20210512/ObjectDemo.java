package java_20210512;

class Test {
	String name;
	Test(String name){
		this.name = name;
		
	}
	@Override
	public String toString() {
		return "Test [name=" + name + "]";
	}
}

public class ObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1 = new Test("뚱이");
		Test t2 = new Test("뚱이");
		Test t3 = t2;
		System.out.println(t1 == t2);
		System.out.println(t1.equals(t2));
		System.out.println(t1);
	}

}
