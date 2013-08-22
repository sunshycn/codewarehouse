package org.huamuzhen.codewarehouse.aop.dynamicproxy;

import java.lang.reflect.Proxy;


public class Main {


	public static void main(String[] args) {
		
	    Class<?>[] proxyInterface = new Class[] {Business1.class, Business2.class };   
	   // AOP advice 
	    LogInvocationHandler handler = new LogInvocationHandler(new BusinessImpl());   
	    //class loader   
	    ClassLoader classLoader = BusinessImpl.class.getClassLoader();   
	    //weaving 
	    Business2 proxyBusiness = (Business2) Proxy.newProxyInstance(classLoader, proxyInterface, handler);   
	    // proxy-class call    
	    proxyBusiness.doSth2("yl91418");   
	    ((Business1) proxyBusiness).doSth1();

	}

}
