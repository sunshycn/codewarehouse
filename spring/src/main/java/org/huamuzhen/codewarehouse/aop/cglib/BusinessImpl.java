package org.huamuzhen.codewarehouse.aop.cglib;

public class BusinessImpl {
	
	public void doSth2(String arg) {
		System.out.println("do Sth2, you are " + arg); 

	}

	public boolean doSth1() {
		System.out.println("do Sth1"); 
		return false;
	}

}
