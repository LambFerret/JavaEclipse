package java_20210511;

public class SubDemo {
	public static void main(String arg[]) {
		Sub sub = new Sub();
//		<<<타입은 부모타입인데 자식의 개체를 생성할때는 부모의 변수를 사용가능하나 자식의 오버라이딩된 메소드로 접근됨>>> 
		Super p = new Sub();
		System.out.println(sub.money);
		sub.makeMoney();
		System.out.println(sub.chicken);
		sub.gotoSchool();
		sub.play("1212");
//		<<<이게 그러하다, 밑에꺼는 스타크래프트를 호출했다>>>
		p.play("22");
		
		Object obj = new Sub();
		System.out.println(obj.toString());
		
	}
}
