package org.huamuzhen.codewarehouse.basic.reflection.proxy;

import java.lang.reflect.Proxy;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		useProxy();
	}
	
	public static void useProxy(){
		String str = "Hello World";
		RequestCtrlInvocationHandler requestCtrlInvocationHandler = new RequestCtrlInvocationHandler(str);
		Comparable obj = (Comparable)Proxy.newProxyInstance(Main.class.getClassLoader(), new Class[]{Comparable.class}, requestCtrlInvocationHandler);
		obj.compareTo("aaa");
		
		
	}

}
