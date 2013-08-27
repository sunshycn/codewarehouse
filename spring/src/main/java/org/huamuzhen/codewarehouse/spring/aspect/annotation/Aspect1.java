package org.huamuzhen.codewarehouse.spring.aspect.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aspect1 {
	
	@Pointcut("within(org.huamuzhen.codewarehouse.spring.service.UserServiceImpl)")
	public void pointcutOnGet(){}
	
	@Pointcut("execution(* org.huamuzhen.codewarehouse.spring.service..*.*(..))")
	public void pointcutForAll(){}
	
	@Before("pointcutForAll()")
	@Order(1)
	public void beforeAll2(){
		System.out.println("BEFORE ALL2");
	}
	
	@Before("pointcutForAll()")
	@Order(2)
	public void beforeAll(JoinPoint joinpoint){
		joinpoint.getArgs();
		joinpoint.getTarget();
		System.out.println("BEFORE ALL");
	}
	
	@After("pointcutForAll()")
	public void afterAll(){
		System.out.println("AFTER ALL");
	}
	
	@AfterReturning(pointcut="pointcutForAll()",returning="retValue")
	public void afterReturning(JoinPoint joinpoint, Object retValue){
		
		System.out.println("AFTER RETURNING");
	}
	
	@AfterThrowing(pointcut="pointcutForAll()", throwing="e")
	public void afterThrowing(Exception e){
		System.out.println(e.getMessage());
	}
	
	@Around("pointcutOnGet()")
	public Object aroundGet(ProceedingJoinPoint joinpoint) throws Throwable
	{
		System.out.println("AROUND-BEFORE GET");
		Object rev = joinpoint.proceed();
		System.out.println("AROUND-AFTER GET");
		return rev;
	}

}
