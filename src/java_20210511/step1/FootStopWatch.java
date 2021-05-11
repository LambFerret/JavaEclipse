package java_20210511.step1;

/* 
	요구사항 : 밀리 세컨드로 경과 시간을 만들어 주세요.
	요구사항 : 나노 세컨드로 경과시간
 */
public class FootStopWatch {
	long startTime;
	long endTime;
	public double getElapsedTime() {
		return (double)(endTime - startTime)/1000;
	}
	
	
	
	public static void main(String[] args) {
//		1970년 1월 1일 부터 현재까지의 시간을 밀리세컨드로 반환
//		long start = System.nanoTime();
//		
//		for(long i  =0;i<30000000000L;i++) {
//			
//		}
//		long end = System.nanoTime();
//		double elapsedTime = (double)(end - start)/ 1000;
//		System.out.printf("경과시간 : %,.9f",elapsedTime);

		
		// 1970년 1월 1일 부터 현재까지의 시간을 밀리세컨드로 반환
		FootStopWatch f = new FootStopWatch();
		f.startTime = System.currentTimeMillis();

		for (long i = 0; i < 30000000000L; i++) {

		}
		f.endTime = System.currentTimeMillis();
		double elapsedTime = f.getElapsedTime();
		System.out.printf("경과시간 : %,.3f", elapsedTime);
	}
}
