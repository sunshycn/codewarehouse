package org.huamuzhen.codewarehouse.concurrent.countdownlatch;

import java.util.concurrent.Callable;

public class ExceptionCallable implements Callable<Void> {
	

	@Override
	public Void call() throws Exception {
		System.out.println(Thread.currentThread().getName() + " is running, I will throw Exception");
		//throw new RuntimeException();
		String[] str = new String[1];
		String a = str[2];
		return null;
	}

}
