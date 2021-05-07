package java_20210429;

public class LiteralDemo {
	public static void main(String[] args) {
//		byte 범위를 넘어가면 컴파일 에러 발생 
		byte b1 = (byte) 128;
		int a1 = 128;
		int a2 = 076;
		int a3 = 0x121a;
		int a4 = 0b1010;
		System.out.println(a1 + a2 + a3 + a4);
		
		long a5 = 229999999L;
		
//		10진수를 표기할때 3자리 단위로 '_'를 사용할 수 있다.
		int a6 = 1_000_000;

//		float = f, double = d
		double a7 = 123.4f;
//0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000
		System.out.println(b1+a5+a6+a7);
		
		
	}
}
