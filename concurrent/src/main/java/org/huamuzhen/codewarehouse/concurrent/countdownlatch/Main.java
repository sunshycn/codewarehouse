package org.huamuzhen.codewarehouse.concurrent.countdownlatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
	// without expire time, the latch will keep waiting if there is a runtime exception happen in sub-thread
	public static void main(String args[]){
		CountDownLatch cdl = new CountDownLatch(2);
		
		ExecutorService pool = Executors.newFixedThreadPool(10);
		
		pool.execute(new WorkTask(cdl));
		pool.execute(new ExceptionTask(cdl));
		System.out.println("I am waiting now");
		try {
			cdl.await();
			System.out.println("all sub tasks done");
		} catch (InterruptedException e) {

		}
		finally{
			pool.shutdown();
		}
		
		
	}

}
