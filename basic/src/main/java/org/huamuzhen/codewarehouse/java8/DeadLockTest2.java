package org.huamuzhen.codewarehouse.java8;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class DeadLockTest2 {
	
	static Lock lockA = new ReentrantLock();
	static Lock lockB = new ReentrantLock();
	
	static class ThreadA implements Runnable {

		@Override
		public void run() {
			loop:
			while(!(lockA.tryLock() && lockB.tryLock())){
				System.out.println("didn't get all lock");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				continue loop;
			}
			System.out.println("do ThreadA");
			lockB.unlock();
			lockA.unlock();
		}
		
	}

	static class ThreadB implements Runnable {

		@Override
		public void run() {
			loop:
				while(!(lockB.tryLock() && lockA.tryLock())){
					//System.out.println("do ThreadA");
					System.out.println("didn't get all lock");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					continue loop;
				}
				System.out.println("do ThreadB");
				lockA.unlock();
				lockB.unlock();
		}
		
	}
	
	public static void main(String args[]){
		Thread a = new Thread(new ThreadA());
		Thread b = new Thread(new ThreadB());
		
		a.start();
		b.start();
	}

}
