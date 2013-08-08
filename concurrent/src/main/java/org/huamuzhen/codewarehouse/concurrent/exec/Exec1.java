package org.huamuzhen.codewarehouse.concurrent.exec;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.huamuzhen.codewarehouse.concurrent.callable.ReaderCallable;
import org.huamuzhen.codewarehouse.concurrent.global.ExecutionContext;

public class Exec1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
System.out.println("current Thread: " + Thread.currentThread());

ExecutionContext.setCurrentContext(Thread.currentThread().toString());
ExecutionContext.getCurrentContext().printContext();
		ExecutorService es =  Executors.newFixedThreadPool(3);
		for(int i=0;i<5;i++){
			 es.submit(new ReaderCallable());
		}
	es.shutdown();
	}

}
