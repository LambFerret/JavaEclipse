package java_20210517;

public class ThrowMain2 {
	public static double getAverage(int[] exam) throws ArrayIndexOutOfBoundsException {
		int korean = exam[0];
		int math = exam[1];
		int english = exam[2];
		int history = exam[3];
		return (double) (korean + math + english + history) / 4;
	}

	public static void main(String[] args) {
		int[] exam = { 10, 20, 30 };
		try {
			double avg = getAverage(exam);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("4개의 배열을 적어주세요");
		}
	}
}
