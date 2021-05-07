package java_20210430;

public class OperatorDemo {
	public static void main(String[] args) {
		int a = 10, b = 22, c = 0;
		double d = 0.0;

//		System.out.println(a+b);
//		d = (double)b/a;
//		System.out.println(d);
//		int a1 = a++; //대입 후 1추가
//		int a2 = ++b; //1추가 후 대입
//		System.out.println(a1 +"\t"+ a);
//		System.out.println(a2);
		System.out.println(a);
		System.out.println(b);
		boolean isSuccess = (a == b) && (++a == b++); // 앞의 조건이 false 면 뒤의 조건을 연산하지않음
		System.out.println(isSuccess);
		System.out.println(a);
		System.out.println(b);
		
		int a1 = 129001;
		double d1 = 3.1415;
		String name = "안녕";
		
		System.out.printf("a는 %5d 입니다.", a1);
		
		System.out.println((1 == 2)? 5: 4);
		System.out.println((a1 % 2 ==0)?"짝":"홀");
	}
}
