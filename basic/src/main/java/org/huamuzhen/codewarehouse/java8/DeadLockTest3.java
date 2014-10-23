package org.huamuzhen.codewarehouse.java8;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;



public class DeadLockTest3 {

	static Lock lockA = new ReentrantLock();
	static Lock lockB = new ReentrantLock();
	
	 static Object lock = new Object();
	
	static class ThreadA implements Runnable {

		@Override
		public void run() {
			synchronized(lock){
				lockA.lock();
				lockB.lock();
			}
			System.out.println("do ThreadA");
			lockB.unlock();
			lockA.unlock();
		}
		
	}

	static class ThreadB implements Runnable {

		@Override
		public void run() {
			synchronized(lock){
				lockB.lock();
				lockA.lock();
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
