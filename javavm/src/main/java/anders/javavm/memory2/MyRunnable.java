package anders.javavm.memory2;

import java.util.ArrayList;
import java.util.List;

public class MyRunnable implements Runnable {
	private String tname;
	private List<User> users = new ArrayList<>();

	public MyRunnable(String tname) {
		this.tname = tname;
	}

	@Override
	public synchronized void run() {
		Integer age = 1;
		while (true) {
			doSomeThing(age);
			age++;
			if (age % 1000 == 0) {
				System.out.println(tname + ":" + age);
			}
			try {
				this.wait(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private void doSomeThing(Integer age) {

		User user = new User("小明" + age, 1);
		user.info();
		this.users.add(user);
		if (this.users.size() % 1000 == 0) {
			System.out.println(tname + " add users:" + this.users.size());
		}
		if (this.users.size() > 30000) {
			this.users.clear();
		}
	}
}
