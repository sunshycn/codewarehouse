package org.huamuzhen.codewarehouse.concurrent.countdownlatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExecutorService pool = Executors.newFixedThreadPool(10);
		Future<Void> future1 = pool.submit((new WorkCallable()));
		Future<Void> future2 = pool.submit(new ExceptionCallable());
		System.out.println("I am waiting now");
		
		try {
			future1.get();
			future2.get();
			System.out.println("all sub tasks done");
		} catch (InterruptedException e) {
			
		} catch (ExecutionException e) {
			System.out.println("exception occurs in sub-task thread");
			future2.cancel(true);
		}
		System.out.println(future1.isDone());
		System.out.println(future2.isDone());
	
	}

}
