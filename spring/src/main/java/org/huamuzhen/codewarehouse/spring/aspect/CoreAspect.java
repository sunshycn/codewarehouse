package org.huamuzhen.codewarehouse.spring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CoreAspect {
	
	@Around("org.huamuzhen.codewarehouse.spring.aspect.MyPointCuts.servicePointcut()")
	public void aroundServiceHandle(ProceedingJoinPoint joinpoint) throws Throwable{
		System.out.println("before method");
		joinpoint.proceed();
		System.out.println("after method");
		
	}

}
