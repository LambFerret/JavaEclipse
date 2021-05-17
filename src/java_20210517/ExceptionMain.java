package java_20210517;

import java.util.ArrayList;

public class ExceptionMain {
	public static void main(String[] args) {
		// java.lang.NumberFormatException
//		int i = Integer.parseInt("111.22a");
//		System.out.println(i);
		double d = Double.parseDouble("111.22");
		System.out.println(d);
//		parseInt => 예외처리 해야함
//		parseDouble => 코드를 변경해야함
		
		
		// java.lang.ArrayIndexOutOfBoundsException
//		배열의 범위를 넘어서면 발생하는 예외
		int[] a = {1,2,3,4};
		System.out.println(a[3]);
		 
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(330);
		System.out.println(list.get(0));
		
//		java.lang.NullPointerException
//		객체를 생성하지않고 메소드를 사용하면 발생하는 예외
//		제일 많이 발생함
		String str = "null"; 
		System.out.println(str.length());
		
		
//		java.lang.ArithmeticException
		int x = 10;
		int y = 0;
		System.out.println(x/y);
		
//		error != exception
		
		
		
	}
}
