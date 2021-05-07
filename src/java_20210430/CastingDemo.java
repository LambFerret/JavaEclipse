package java_20210430;

public class CastingDemo {

	public static void main(String[] args) {
//		circuit 발생 ㅋㅋ;
		byte b1 = (byte)129;
		System.out.println(b1);
//		double => int cut발생 ㅋㅋ;
		int i1 = (int)129.25;
		System.out.println(i1);
//		auto-casting
		double d1 = 124.5f;
		System.out.println(d1);
	}

}
