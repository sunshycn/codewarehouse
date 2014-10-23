package org.huamuzhen.codewarehouse.java8;

public class DeadLockTest {
	
	public static Object lockA = new Object();
	public static Object lockB = new Object();
	
	static class ThreadA implements Runnable {

		@Override
		public void run() {
			synchronized(lockA){
				try {
					Thread.sleep(100);
					lockA.notifyAll();
					lockA.wait(100);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized(lockB){
					System.out.println("do ThreadA Staff");
				}
			}
			
		}
		
	}

	static class ThreadB implements Runnable {

		@Override
		public void run() {
			synchronized(lockB){
				try {
					Thread.sleep(1000);
					//lockB.wait(100);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized(lockA){
					System.out.println("do ThreadB Staff");
				}
			}
			
		}
		
	}
	
	public static void main(String args[]){
		Thread a = new Thread(new ThreadA());
		Thread b = new Thread(new ThreadB());
		
		a.start();
		b.start();
	}
}
