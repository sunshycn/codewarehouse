package org.huamuzhen.codewarehouse.concurrent.basic;

class ThreadWorker implements Runnable{
	private String Id;
	
	public ThreadWorker(String Id){
		this.Id = Id;
	}
	
	public void method1(int a,String... args){
		for(String arg:args){
			System.out.println(arg);
		}
	}
	
	public void method2(String args[]){
		for(String arg:args){
			System.out.println(arg);
		}
	}

	@Override
	public void run() {
		System.out.println(Id + " is running");
		
	}

	public String getId() {
		return Id;
	}

	public void setId(String Id) {
		this.Id = Id;
	}
	
}
