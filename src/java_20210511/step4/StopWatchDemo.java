package java_20210511.step4;

public class StopWatchDemo {
	public static void run(StopNanoWatch s) {
		s.start();
		for (long i = 0; i < 30000000000L; i++) {}
		s.end();
		double elapsedTime = s.getElapsedTime();
		System.out.printf("경과시간 : %,.9f", elapsedTime);
	}
	public static void run(StopMiliWatch s) {
		s.start();
		for (long i = 0; i < 30000000000L; i++) {}
		s.end();
		double elapsedTime = s.getElapsedTime();
		System.out.printf("경과시간 : %,.9f", elapsedTime);
	}
	public static void main(String[] args) {
		StopNanoWatch s = new StopNanoWatch();
		run(s);
		
	}
}
