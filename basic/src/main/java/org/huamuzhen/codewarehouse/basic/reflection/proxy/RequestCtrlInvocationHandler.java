package org.huamuzhen.codewarehouse.basic.reflection.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class RequestCtrlInvocationHandler implements InvocationHandler {

	private Object target;
	
	public RequestCtrlInvocationHandler(Object target){
		this.target = target;
	}
	
	/**
	 * invoke the target's method with parameters args..
	 * target is the proxy object
	 * */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		//System.out.println(proxy);
		for(Object arg : args){
			System.out.println(arg.toString());
		}
		
		if(method.getName().equals("compareTo")){
			System.out.println("method request is invoking, call target method");
			return method.invoke(target, args);
		}
		return null;
	}

}
