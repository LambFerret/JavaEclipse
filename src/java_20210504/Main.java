package java_20210504;

public class Main {

	public static void main(String args[]) {
		int[][] arr1 = { { 1, 5 }, { 3, 5 }, { 4, 3 } };
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[0].length; j++) {
				System.out.print(arr1[i][j]);
			}
		}
		System.out.println();
		final int[] mtoday = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
//		9월 15일 까지 일수를 구하세요
		int months = 9;
		int days = 15;
		int days1 = 0;

		for (int i = 0; i < months - 1; i++) {
			days1 += mtoday[i];
		}
		System.out.println(days1 + days);

	}
}
