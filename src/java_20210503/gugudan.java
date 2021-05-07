package java_20210503;

public class gugudan {

	public static void main(String[] args) {
		for (int i = 2; i < 10; i++) {
			System.out.println(i +"단 입니다.");
			for (int j = 1; j<10; j++)
				System.out.println(i +" * "+ j +" = "+ i*j);
		}
//		최대한 for문을 적게 돌리는 방법으로 코드를 짜야한다. <<<<중요>>>>
		
		for (int i = 3; i <= 100; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					
				}
			}
		}
	}

}
