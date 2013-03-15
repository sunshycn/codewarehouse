package org.huamuzhen.codewarehouse.concurrent.future;

import java.util.concurrent.Callable;

public class SimpleCallable implements Callable<String> {

	@Override
	public String call() throws Exception {
		
		Thread.sleep(5000);
		
		return "hello world";
	}

}
