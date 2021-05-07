package java_20210504;

import java.util.Arrays;

public class Lotto {
	public static void main(String[] args) {
		int pick = 6;
		int[] picked = new int[pick];
		for (int i = 0; i < pick; i++) {
			int random = (int) (Math.random() * 45) + 1;
			picked[i] = random;
			for (int j = 0; j < i; j++) {
				if (picked[i] == picked[j]) {
					i--;
				}
			}
		}
//		Arrays.sort(picked); 밑의 코드와 동일
		for (int i = 0; i < picked.length; i++) {
			for (int j = 0; j < picked.length - (i + 1); j++) {
				if (picked[j] < picked[j + 1]) {
					int temp = picked[j];
					picked[j] = picked[j + 1];
					picked[j + 1] = temp;
				}
			}
		}

		for (int i : picked) {
			System.out.printf("[%d]", i);

		}
//		int[] lotto = new int[6];
//		for (int i=0;i<lotto.length;i++) {
//			int random = (int)(Math.random()*45)+1;
//			lotto[i] = random;
//		}
//		for (int i=0;i<lotto.length;i++) {
//			System.out.println(lotto[i]+"\t");
//		}
	}
}
