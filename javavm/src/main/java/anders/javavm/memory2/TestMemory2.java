package anders.javavm.memory2;

/**
 * 测试内存cpu
 */
public class TestMemory2 {
	public static void main(String[] args) {
		Integer threadNum = null;
		try {
			threadNum = Integer.parseInt(args[0]);
		} catch (RuntimeException e) {
			threadNum = 1;
		}
		for (int i = 0; i < threadNum; i++) {
			String tname = "mythread" + i;
			Runnable runnable1 = new MyRunnable(tname);
			Thread thread = new Thread(runnable1);

			thread.setName(tname);
			thread.start();
		}
	}

}
