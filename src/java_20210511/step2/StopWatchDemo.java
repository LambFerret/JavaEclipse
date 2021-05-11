package java_20210511.step2;

public class StopWatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StopWatch s = new StopWatch();
		s.start();
		for (long i = 0; i < 30000000000L; i++) {}
		s.end();
		double elapsedTime = s.getElapsedTime();
		System.out.printf("경과시간 : %,.9f", elapsedTime);
	}

}
