package java_20210506;

public class Person {
	
//	<<<instance 생성 = 객체 생성>>> 
//	<<<class 생성 = 클래스 생성>>> 끄덕
	String name;// 멤버변수는 class 안 메소드 밖에서 선언된 변수
	String phone;
	String email;
	
//	인스턴스변수(int, double...), 
//	클래스변수( static / final(-->이건 종단변수) )로 나뉨 
	int age;
	boolean released;
	
//	final은 거의 99.99% static을 쓴다!
//	instance final 은 0.01%만 쓴다!
//	final은 전부 대문자
	static int person_number=0;
	static final String BANK_NAME="신한은행";
	
	
//	메소드
	int meat() {
		return 3;
	}
}

//가능은 한데 권고사항아님
class A {
	;
}
