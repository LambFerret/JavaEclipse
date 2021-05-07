// 패키지명도 식별자에 포함되기에 식별자 규칙을 지켜야함
// 클래스명은 첫글자 upper
package java_20210429;

public class IdentifierDemo {
	// 메소드 명도 식별자에 포함
	// 클래스명을 제외한 모든 이름은 소문자로 시작함 = 식별자
	public static void main(String[] args) {
		int age = 20;
		String hello = "안녕";

//		첫글자는 숫자로 설정할 수 없다. 
//		String 235Age = "hit da hit";
		
//		예약어 사용 불가 
//		String void = "empty";
		
//		자바는 유니코드를 지원하기에 가능합니다. but 지양해야함 
//		value == literal 
//		정수형 리터럴 = 2진수 =0b, 8진수 =0, 16진수 =0x, <<10진수>>	
//		Primitive data types : byte, short, int, long, float, double, char, boolean
//		<->	
		String 안녕 = "hello!";
		long longstoneAge = 2000000000000000000L ;
		double dragonAge = 0314;
		byte chocolateBittness = -12;
		char a = 'a';
		boolean no = false;
		int paljinsu = 027;
		int YIjinsu = 0b101010010010;
		System.out.println( a+ 안녕   + age + hello + dragonAge+ longstoneAge + no);
		System.out.println(chocolateBittness+ 12021);
		System.out.println(paljinsu);
		System.out.println(YIjinsu);
	}
}
