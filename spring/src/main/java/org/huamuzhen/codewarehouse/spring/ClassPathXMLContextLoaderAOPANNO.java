package org.huamuzhen.codewarehouse.spring;

import org.huamuzhen.codewarehouse.spring.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassPathXMLContextLoaderAOPANNO {
	
	
	public static void main(String args[]) {
		
		ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext("application-context-aop-annotation.xml");
		UserService userService = (UserService)context.getBean("userService");
System.out.println(userService.getClass().getName());
		userService.get("111");
	}
}
