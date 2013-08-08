package org.huamuzhen.codewarehouse.concurrent.callable;

import java.util.concurrent.Callable;

import org.huamuzhen.codewarehouse.concurrent.global.ExecutionContext;

public class ReaderCallable implements Callable<String> {

	@Override
	public String call() throws Exception {


System.out.println("This is the current context: "+ExecutionContext.getCurrentContext() + " in thread: " + Thread.currentThread());
if(ExecutionContext.getCurrentContext() == null){
	ExecutionContext.setCurrentContext(Thread.currentThread().toString());
}	
		return this.toString();
	}

}
