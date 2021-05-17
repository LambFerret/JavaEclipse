package java_20210517;

public class TryCatchMain {
	public static double getAvgs(int x, int y) {
		return (double)(x+y)/2;
	}
	public static void main(String[] args) {
//		javac TryCatchMain.java => compile
//		java TryCatchMain 10, 20, 30
//		재생버튼 밑에 컨피규->아규먼츠
		
//		if 10 20 입력: 잘됨
//		if 10, a -> java.lang.NumberFormatException
//		if 10 -> java.lang.ArrayIndexOutOfBoundsException
		try {
		int korean = Integer.parseInt(args[0]);
		int english = Integer.parseInt(args[1]);
		
		double average = getAvgs(korean, english);
		System.out.println(average);
		
		double average2 = getAvgs(49, 372);
		System.out.println(average2);
		
			int a = 10;
			int b = 0;
			System.out.println(a/b);
		} catch (java.lang.NumberFormatException e) {
			System.out.println("fuck your format");
		}catch (java.lang.ArrayIndexOutOfBoundsException e) {
			System.out.println("fuck your index");
		}catch (java.lang.ArithmeticException e) {
			System.out.println("1");
			System.err.println("fuck you /0"+"\n"); // fuck you /0빨간글씨
			e.printStackTrace(); 	// -> 빨간 메세지 stack 보여주는거 
			System.out.println(e.getMessage()+"\n"); //-> 중요한 에러메세지만 보여주는거
			System.err.println(e.getMessage()+"\n"); //-> 이클립스에서만 빨간줄로 나오는 에러메세지
		}catch (Exception e) {
			System.out.println("fuck you all");
		}
		finally {System.out.println("funny");
	}
		public void m() throws exceptions({)
}
}
