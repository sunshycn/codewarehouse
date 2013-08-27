package org.huamuzhen.codewarehouse.spring.aspect.schema;

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


public class Aspect1 {
	
	public void pointcutOnGet(){}
	
	public void pointcutForAll(){}
	
	public void beforeAll2(){
		System.out.println("BEFORE ALL2");
	}
	
	public void beforeAll(JoinPoint joinpoint){
		joinpoint.getArgs();
		joinpoint.getTarget();
		System.out.println("BEFORE ALL");
	}
	
	public void afterAll(){
		System.out.println("AFTER ALL");
	}
	
	public void afterReturning(JoinPoint joinpoint, Object retValue){
		
		System.out.println("AFTER RETURNING");
	}
	
	public void afterThrowing(Exception e){
		System.out.println(e.getMessage());
	}
	
	public Object aroundGet(ProceedingJoinPoint joinpoint) throws Throwable
	{
		System.out.println("AROUND-BEFORE GET");
		Object rev = joinpoint.proceed();
		System.out.println("AROUND-AFTER GET");
		return rev;
	}

}
