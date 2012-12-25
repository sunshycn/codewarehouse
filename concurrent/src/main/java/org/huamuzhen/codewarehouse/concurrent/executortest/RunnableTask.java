package org.huamuzhen.codewarehouse.concurrent.executortest;

public class RunnableTask implements Runnable {

	@Override
	public void run() {
		System.out.println("I am running " + this);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
