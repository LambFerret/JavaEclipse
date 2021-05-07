package java_20210430;

public class CheckingPersonalCode {
	public static void main(String args[]) {
		int a1 = 1, a2 = 1, a3 = 1, a4 = 1, a5 = 1, a6 = 1;
		int b1 = 1, b2 = 2, b3 = 3, b4 = 1, b5 = 1, b6 = 1, b7 = 1;

		int sum = a1*2+a2*3+a3*4+a4*5+a5*6+a6*7+b1*8+b2*9+b3*2+b4*3+b5*4+b6*5;
		int rest =(11- sum% 11)%10;
		System.out.println((rest ==b7)? true:false);
		}
	}

