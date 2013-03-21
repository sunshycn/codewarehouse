package org.huamuzhen.codewarehouse.concurrent.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class ExceptionTask implements Runnable {

	private CountDownLatch cdl;
	
	public ExceptionTask(CountDownLatch cdl){
		this.cdl = cdl;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " is running, I will throw Exception");
		//throw new RuntimeException();
		String[] str = new String[1];
		String a = str[2];
		cdl.countDown();
	}

}
