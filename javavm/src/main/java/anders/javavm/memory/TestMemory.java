package anders.javavm.memory;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试内存cpu
 */
public class TestMemory {
	public static void main(String[] args) {
		Integer threadNum = null;
		try {
			threadNum = Integer.parseInt(args[0]);
		} catch (RuntimeException e) {
			threadNum = 1;
		}
		for (int i = 0; i < threadNum; i++) {
			String tname = "mythread" + i;
			Thread thread = new Thread(new Runnable() {
				public void run() {
					Integer age = 1;
					while (true) {
						doSomeThing(age);
						age++;
						if (age % 1000 == 0) {
							System.out.println(tname + ":" + age);
						}
					}
				}

			
			});

			thread.setName(tname);
			thread.start();
		}
	}
	private static void doSomeThing(Integer age) {
		
		User user = new User("小明" + age, 1);
		user.info();
		
	}
}
