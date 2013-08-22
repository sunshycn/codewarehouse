package org.huamuzhen.codewarehouse.aop.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LogInvocationHandler implements InvocationHandler {

	private Object target; 
	  
    LogInvocationHandler(Object target) {   
        this.target = target;   
    }   
  
    @Override   
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {   
        
        Object rev = method.invoke(target, args);   
        if (method.getName().equals("doSth2")) {   
            System.out.println("#INTERCEPT#after doSth2 logic");   
        }   
        return rev;   
    }   

}
