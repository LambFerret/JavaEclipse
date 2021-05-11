package java_20210511.step2;

public class StopWatch {
	long startTime;
	long endTime;
	
	public void start() {
		startTime = System.currentTimeMillis();
	}
	
	public void end() {
		startTime = System.currentTimeMillis();
	}
	
	public double getElapsedTime() {
		return (double) (endTime - startTime) / 1000000000;
	}


		
}
