package org.huamuzhen.codewarehouse.concurrent.executortest;

import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Executor executor = Executors;
		/*executor.execute(new RunnableTask());
		executor.execute(new RunnableTask());
		System.out.println("main end");*/
		ThreadPoolTaskExecutor te = new ThreadPoolTaskExecutor();
		te.execute(new RunnableTask());
		te.execute(new RunnableTask());
		System.out.println("main end");
	}

}
