package org.huamuzhen.codewarehouse.basic;

public class TestThread extends Thread {
	
	private String name;
	
	private Object lock;
	
	public TestThread(String name, Object lock){
		this.name = name;
		this.lock = lock;
	}
	
	public  void run(){
		
			if(name.equals("a")){
				yield();
				yield();
				yield();
				yield();
			}
			
			System.out.println(name);
		
	}

}
