package answer_java_20210510;

public class MemberDemo {
	public static void print(Member m) {
		String name = m.getName();
		String email = m.getEmail();
		String zipcode = m.getZipcode();
		String addr1 = m.getAddr1();
		String addr2 = m.getAddr2();
		int age = m.getAge();
		System.out.println(name);
		System.out.println(email);
		System.out.println(zipcode);
		System.out.println(addr1);
		System.out.println(addr2);
	}
	public static void print(String name, String email,
			String zipcode, String addr1, String addr2, 
			int age) {
		System.out.println(name);
		System.out.println(email);
		System.out.println(zipcode);
		System.out.println(addr1);
		System.out.println(addr2);
		System.out.println(age);
	}
	
	public static void main(String[] args) {
		Member m = new Member();
		
		m.setName("성영한");
		m.setEmail("syh@hbilab.org");
		m.setZipcode("09876");
		m.setAddr1("서울 용산구 이태원동");
		m.setAddr2("한강아파트 110동 ");
		m.setAge(30);
		print(m);
		//print(name,email,zipcode,addr1,addr2,age);
		
		
		
	}
}
