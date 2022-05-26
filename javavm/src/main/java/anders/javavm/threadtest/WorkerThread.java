package anders.javavm.threadtest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class WorkerThread implements Runnable {
	private final LinkedList<String> eventQueue = new LinkedList<>();

	public void addEvent(String event) {
		synchronized (eventQueue) {
			eventQueue.add(event);
			eventQueue.notify();
		}
	}
	@Override
	public void run() {
		Thread.currentThread().setName("Event.EventLogWriter");
		
		while(true){
			try{
				String event = null;
				
				List<String> buf = new ArrayList<>();
				synchronized (eventQueue) {
					if(eventQueue.isEmpty()){
						eventQueue.wait();
					}
					buf.addAll(eventQueue);
					eventQueue.clear();
				}
				for (String str : buf) {
					System.out.println(str);
				}
				buf.clear();
				Thread.sleep(500);
				System.out.println("output event:"+ event);
				
				
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}		
	}
	
	

}
