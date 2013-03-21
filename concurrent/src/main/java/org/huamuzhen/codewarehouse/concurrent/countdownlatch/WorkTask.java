package org.huamuzhen.codewarehouse.concurrent.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class WorkTask implements Runnable {
	
	private CountDownLatch cdl;
	
	public WorkTask(CountDownLatch cdl){
		this.cdl = cdl;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + "is running");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		cdl.countDown();
	}

}
