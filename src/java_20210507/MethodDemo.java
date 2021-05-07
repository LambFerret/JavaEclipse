package java_20210507;

// <<인스턴스 메소드는 인스턴스가 불러와지지않으면 사용불가>>
public class MethodDemo {
	public int plus(int a, int b) {
		return a + b;
	}

	public int minus(int a, int b) {
		return a - b;
	}

	public int multiple(int a, int b) {
		return a * b;
	}

	public double divide(double a, int b) {
		return a / b;
	}

	public boolean isLeafYear(int year) {
		return year % 4 == 0 && year % 100 != 0 || year % 4 == 0;
	}

	public int[] ascending(int[] arrays) {
		for (int i = 0; i < arrays.length; i++) {
			for (int j = 0; j < arrays.length - (i + 1); j++) {
				if (arrays[j] > arrays[j + 1]) {
					int temp = arrays[j];
					arrays[j] = arrays[j + 1];
					arrays[j + 1] = temp;
				}
			}
		}
		return arrays;
	}

// [[전역변수 > 지역변수]]
	public void MonthlyCalender(int year, int month) {
		for (int i = 0; i < month; i++) {
			System.out.print(i + "\t");
			if (i % 7 == 0)
				System.out.println();
			int[][] arr1 = { { 1, 2 }, { 3, 4 } };
		}
	}

	public static void main(String[] args) {
		MethodDemo m = new MethodDemo();
		boolean leafy = m.isLeafYear(2020);
		System.out.println(leafy);
		int[] test = { 1, 6, 34, 634, 7, 37, 3, 9, 56, 4 };
		int[] after = m.ascending(test);

		for (int i : after) {
			System.out.print("[" + i + "]");
		}
		for (int i = 0; i < after.length; i++) {
			System.out.print(i + "\t");
			if (i % 7 == 0)
				System.out.println();
		}
		

	}

}