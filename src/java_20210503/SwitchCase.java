package java_20210503;

public class SwitchCase {
	public static void main(String args[]) {
		// 실행법 = run configuration -> arguments -> program arguments
		int month = Integer.parseInt(args[0]);
		String season = "";
		switch (month) {
		case 12,1,2 : season = "겨울";
		break;
		case 3,4,5 : season = "봄";
		break;
		case 6,7,8 : season = "여름";
		break;
		case 9,10,11 : season = "가을";
		break;
		}
		System.out.println(season+" 계절입니다!");
}
}