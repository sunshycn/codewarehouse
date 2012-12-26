package org.huamuzhen.codewarehouse.basic.reflection.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class RequestCtrlInvocationHandler implements InvocationHandler {

	private Object target;
	
	public RequestCtrlInvocationHandler(Object target){
		this.target = target;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		if(method.getName().equals("request")){
			System.out.println("method request is invoking, call target method");
			return method.invoke(target, args);
		}
		return null;
	}

}
