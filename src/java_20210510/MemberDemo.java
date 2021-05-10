package java_20210510;

public class MemberDemo {
	public static void print(Member m) {
		String name = m.getName();
		System.out.println(name);
	}

	public static void main(String arg[]) {
		Member m = new Member();
		m.setName("뚱이");
		print(m);
	}
}
