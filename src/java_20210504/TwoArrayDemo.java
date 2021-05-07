package java_20210504;

public class TwoArrayDemo {

	public static void main(String[] args) {
		int[][] a = new int[3][2];
		int num = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				num += 10;
				a[i][j] = num;
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println(a[i][j]);
			}
		}



	}

}
