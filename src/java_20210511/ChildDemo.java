package java_20210511;

public class ChildDemo {
	public static void main(String args[]) {
		Child child = new Child("010-2123-1231", 50.3, 150.0);
		Child child2 = new Child("뚱이", "seoul", 30, "010-1020-1020", 12.5, 23.7);
		System.out.println(child.name);
		System.out.println(child.address);
		System.out.println(child.age);
		System.out.println(child.phone);
		System.out.println(child.weight);
		System.out.println(child.height);
		System.out.println();
		System.out.println(child2.name);
		System.out.println(child2.address);
		System.out.println(child2.age);
		System.out.println(child2.phone);
		System.out.println(child2.weight);
		System.out.println(child2.height);
	}
}
