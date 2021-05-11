package answer_java_20210510;

public class AdminDemo {
	public static void main(String[] args) {
		
		Admin a = new Admin("syh1011","123","syh@hbilab.org",20);
		
		System.out.println(a.getId());
		System.out.println(a.getPwd());
		System.out.println(a.getEmail());
		System.out.println(a.getLevel());
		
		Admin a1 = new Admin();
		a1.setId("syh1011");
		a1.setPwd("123");
		a1.setEmail("syh@hbilab.org");
		a1.setLevel(20);
	}
}
