package java_20210511.step4;

public class StopMiliWatch {
	long startTime;
	long endTime;
	
	public void start() {
		startTime = System.currentTimeMillis();
	}
	
	public void end() {
		startTime = System.currentTimeMillis();
	}
	
	public double getElapsedTime() {
		return (double) (endTime - startTime) / 1000;
	}

}
