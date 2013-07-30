package org.huamuzhen.codewarehouse.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassPathXMLContextLoader {
	
	
	public static void main(String args[]) {
		
		ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext("application-context.xml");
	/*	User user1 = (User)context.getBean("user");
		UserServiceImpl userService = (UserServiceImpl)context.getBean("userService");
		
		userService.printUserName(user1);*/
		
		System.out.println("context Loading");
		context.registerShutdownHook();  
	}

}
