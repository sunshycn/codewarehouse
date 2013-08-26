package org.huamuzhen.codewarehouse.spring.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/*@Aspect
@Component*/
public class MyPointCuts {
	
	@Pointcut("execution(* org.huamuzhen.codewarehouse.spring.service..*.*(..))")
	public void servicePointcut(){}

}
