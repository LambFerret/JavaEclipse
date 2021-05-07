package java_20210430;

public class IfDemo {
	public static void main(String args[]) {
		// 실행법 = run configuration -> arguments -> program arguments
		int month = Integer.parseInt(args[0]);
		String season = "";
		if (month == 12 || month == 1 || month == 2) {
			season = "겨울";
		} else if (month == 3 || month == 4 || month == 5) {
			season = "봄";
		} else if (month == 6 || month == 7 || month == 8) {
			season = "여름";
		} else if (month == 9 || month == 10 || month == 11) {
			season = "여름";
		} else {
			season = "없는계절";
		}
		System.out.println(month + "월은 계절이 " + season + "입니다.");
		month+=1;
	}
}
