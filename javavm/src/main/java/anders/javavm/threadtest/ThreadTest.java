package anders.javavm.threadtest;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Hello world!
 *
 */
public class ThreadTest {
	public static void main(String[] args) throws InterruptedException {
		int poolSize;
		int interval;
		if (args.length != 2) {
			System.out.println("app poolSize second");
			System.out.println("useDefault poolSize=2 second=50");
			poolSize = 2;
			interval = 50;
		} else {
			poolSize = Integer.parseInt(args[0]);
			interval = Integer.parseInt(args[1]);
		}
		WorkerThread wt = new WorkerThread();
		new Thread(wt).start();
		ScheduledExecutorService executorService = Executors.newScheduledThreadPool(poolSize);

		int c[] = new int[] { 0 };
		Runnable logRunnable = new Runnable() {
			@Override
			public void run() {
				try {
					System.out.println("add event:" + c[0]);
					wt.addEvent(Integer.toString(c[0]));
					c[0]++;
				} catch (Throwable t) {
					t.printStackTrace();
				}
			}
		};
		executorService.scheduleAtFixedRate(logRunnable, 0L, interval, TimeUnit.MILLISECONDS);
		Thread.sleep(1000000);
	}
}
