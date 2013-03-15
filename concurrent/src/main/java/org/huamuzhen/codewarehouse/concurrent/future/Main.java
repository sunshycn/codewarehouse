package org.huamuzhen.codewarehouse.concurrent.future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Main {

	/**
	 * @param args
	 * @throws TimeoutException 
	 */
	public static void main(String[] args) {
		/*ExecutorService es = Executors.newSingleThreadExecutor();
		Future<String> future = es.submit(new SimpleCallable());
		String result = null;
		try {
				result = future.get();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}finally{
			System.out.println(result);
			es.shutdown();
		}*/
		
		/*FutureTask<String> ft = new FutureTask<String>(new SimpleCallable());
		try {
			ft.run();
			System.out.println(ft.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		String[] a = {"a"};
		System.out.println(a[1]);
	}

}
