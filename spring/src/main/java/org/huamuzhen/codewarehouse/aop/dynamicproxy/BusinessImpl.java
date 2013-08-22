package org.huamuzhen.codewarehouse.aop.dynamicproxy;


public class BusinessImpl implements Business1, Business2 {

	@Override
	public void doSth2(String arg) {
		System.out.println("do Sth2, you are " + arg); 

	}

	@Override
	public boolean doSth1() {
		System.out.println("do Sth1"); 
		return false;
	}

}
