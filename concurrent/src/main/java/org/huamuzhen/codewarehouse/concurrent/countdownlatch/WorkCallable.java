package org.huamuzhen.codewarehouse.concurrent.countdownlatch;

import java.util.concurrent.Callable;

public class WorkCallable implements Callable<Void> {

	@Override
	public Void call() throws Exception {
		
		System.out.println(Thread.currentThread().getName() + "is running");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return null;
	}

}
