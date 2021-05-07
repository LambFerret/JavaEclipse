package java_20210506;

import java_20210506.aa.*;

// 객체를 만들땐 그 사용 목적을 정확히 정의해야한다.
public class Main {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.name = "정현석";
		p1.age = 23;
		p1.released = true;
		p1.email = "naver@email.com";
		p1.phone = "010-1234-1234";
		//이거 중요 -> 클래스변수(static으로 만든거)는 p1.이 아니라 Person.으로 접근
		Person.person_number +=1;
		System.out.printf("%s, %d \n",p1.name, p1.age);
		
		p2.name = "뚱이";
		p2.age = 21;
		p2.released = false;
		p2.email = "gmail@email.com";
		p2.phone = "010-0000-0000";
		Person.person_number +=1;
		
		Person p3 = p2;
		Notice n = new Notice();
		NoticeDemo n2 = new NoticeDemo();
//		n2.title = "12";
		n.number = 2;
//		n.title = "3";
//		n.hit = 3;
//		n.data = "hello";
		
		System.out.println(Person.person_number);
		System.out.println(p3.phone);
		System.out.println(Person.BANK_NAME);
		System.out.println(n.number);
//		System.out.println(n.date);
	}
			
}
