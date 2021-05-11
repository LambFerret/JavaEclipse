package java_20210511.step5;

import java_20210511.step4.StopNanoWatch;

public class StopWatchDemo {
public static void run(StopWatch s) {
	s.execute();
	
}
	public static void main(String[] args) {
	StopNanoWatch s = new StopNanoWatch();
	run(s);
}
}
