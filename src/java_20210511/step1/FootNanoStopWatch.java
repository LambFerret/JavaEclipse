package java_20210511.step1;

public class FootNanoStopWatch {
	long startTime;
	long endTime;

	public double getElapsedTime() {
		return (double) (endTime - startTime) / 1000000000;
	}

	public static void main(String[] args) {
		FootNanoStopWatch f = new FootNanoStopWatch();
		f.startTime = System.nanoTime();

		for (long i = 0; i < 30000000000L; i++) {

		}
		f.endTime = System.nanoTime();
		double elapsedTime = f.getElapsedTime();
		System.out.printf("경과시간 : %,.9f", elapsedTime);

	}
}
