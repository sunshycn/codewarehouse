package org.huamuzhen.codewarehouse.aop.cglib;

import net.sf.cglib.proxy.Enhancer;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//weaver
        Enhancer enhancer = new Enhancer();   
        //set parent class
        enhancer.setSuperclass(BusinessImpl.class);   
        //set advice 
        enhancer.setCallback(new LogIntercept());   
        //child class 
        BusinessImpl childBusinessImpl = (BusinessImpl) enhancer.create();   
       
        childBusinessImpl.doSth2("yl91418");
        childBusinessImpl.doSth1();
        System.out.println(childBusinessImpl.getClass().getName());
	}

}
