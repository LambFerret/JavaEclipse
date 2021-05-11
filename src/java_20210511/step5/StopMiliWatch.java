package java_20210511.step5;

public class StopMiliWatch extends StopWatch{
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