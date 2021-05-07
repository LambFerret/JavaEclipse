package java_20210504;

public class PrimitiveReference {
	public static void main(String args[]) {
//		자료형인 것은 값이 바뀌어도 지들끼리 따로따로
		int abc = 3;
		int def = abc;
		def = 300;
		System.out.println(abc);
		System.out.println(def);

//		but 참조형 (어레이 등)은 주소가 같기에 다른이름으로 바껴도 그게 진짜 바뀜
		int[] ab = { 1, 2, 3, 4, 5 };
		int[] ba = ab;
		ab[3] = 400;
		System.out.println(ba[3]);
		System.out.println(ab[3]);
	}
}
