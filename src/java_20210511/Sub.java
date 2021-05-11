package java_20210511;

public class Sub extends Super {
	String chicken;
	public void gotoSchool() {
		System.out.println("Sub goes school");
	}
/*	
	오버라이딩 : 부모의 매소드를 재정의하는거
	규칙
	1. 반환형, 매서드이름, 매개변수는 일치.
	2. 접근한정자는 부모보다 넓거나 같아야한다. 


*/
	public void play(String starcraft) {
//		부모의 기능추가하는 방법 | 이거 없으면 부모 플레이도 없어짐
		super.play("badook");
//		자식의 매소드 재정의 
		System.out.println("Sub.playing 스타크래프트!");
	}
	public String toString() {
		return "서브클래스에요";
	}
}
