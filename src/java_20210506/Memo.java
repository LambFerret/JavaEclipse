package java_20210506;

public class Memo {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5,6,7};
		int[] arr2 = new int[10];
		System.arraycopy(arr1,0,arr2,0,5);
		for (int i: arr2) {
			System.out.println(i);
		}
	}
}

/* 
 class 에는 protected와 private가 없다
 public/default  and  final/abstract



*/
