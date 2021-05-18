package java_20210518;

public class SynchronizedMain implements Runnable {

	int x;
	int y;

	@Override
	public void run() {
		synchronized (SynchronizedMain.class) {
			for (int i = 0; i < 1000; i++) {
				x++;
				y++;
				String threadName = Thread.currentThread().getName();
				System.out.printf("x : %d, y : %d - %s %n", x, y, threadName);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SynchronizedMain s1 = new SynchronizedMain();
		SynchronizedMain s2 = new SynchronizedMain();
		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(s1);

		t1.start();
		t2.start();

	}

}
