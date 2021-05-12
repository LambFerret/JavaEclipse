package java_20210512;

import java.util.ArrayList;

public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ctrl + shift + o
//		자바 1.4 이전 버전에서는 primitive data type을 Collection에 저장할 수 없어서
//		primitive data type을 객체화 할 수 있는 Wrapper Class로 변환하여 저장
		ArrayList list = new ArrayList();
		list.add(1); //불가능
		list.add(new Integer(1));
//		1. primitive data type = > wrapper class(생성자이용)
		Integer i1 = Integer.valueOf(122);
		Integer i2 = Integer.valueOf("20");
//		wrapper class => primitive data type(intValue() )
		int i3 = i1.intValue();
		int i4 = i2.intValue();
		int i5 = i3 + i4;
		System.out.println(i5);

		String s1 = "12122";
		int i6 = Integer.parseInt(s1);

//		숫자로 구성된 String => primitive 로 전환 

//		4. auto-boxing : primitive data type -> wrapper class
		Integer i7 = 1999;
//		5. auto-unboxing : wrapper class -> primitive data type
		int i9 = i7 + i5;
	}

}
