package org.huamuzhen.codewarehouse.aop.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;


public class LogIntercept implements MethodInterceptor {

	@Override
	public Object intercept(Object target, Method method, Object[] args,
			MethodProxy proxy) throws Throwable {
		
		//original logic
        Object rev = proxy.invokeSuper(target, args);   
        //weaving
        if (method.getName().equals("doSth2")) {   
            System.out.println("#INTERCEPT#after doSth2 logic");   
        }   
        return rev;   
	}

}
