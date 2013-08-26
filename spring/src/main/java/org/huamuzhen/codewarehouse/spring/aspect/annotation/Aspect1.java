package org.huamuzhen.codewarehouse.spring.aspect.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aspect1 {
	
	@Pointcut("within(org.huamuzhen.codewarehouse.spring.service.UserServiceImpl)")
	public void pointcutOnGet(){}
	
	@Pointcut("execution(* org.huamuzhen.codewarehouse.spring.service..*.*(..))")
	public void pointcutForAll(){}
	
	@Around("pointcutOnGet()")
	public Object aroundGet(ProceedingJoinPoint joinpoint) throws Throwable
	{
		System.out.println("AROUND-BEFORE GET");
		Object rev = joinpoint.proceed();
		System.out.println("AROUND-AFTER GET");
		return rev;
	}
	
	@Before("pointcutForAll()")
	public void beforeAll(){
		System.out.println("BEFORE ALL");
	}

	

}
