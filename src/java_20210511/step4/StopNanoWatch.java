package java_20210511.step4;

public class StopNanoWatch {
	long startTime;
	long endTime;
	
	public void start() {
		startTime = System.nanoTime();
	}
	
	public void end() {
		startTime = System.nanoTime();
	}
	
	public double getElapsedTime() {
		return (double) (endTime - startTime) / 1000000000;
	}

}
