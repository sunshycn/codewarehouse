package org.huamuzhen.codewarehouse.spring;

import org.huamuzhen.codewarehouse.spring.entity.User;
import org.huamuzhen.codewarehouse.spring.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassPathXMLContextLoader {
	
	
	public static void main(String args[]) {
		
		ApplicationContext context  = new ClassPathXmlApplicationContext("application-context.xml");
	/*	User user1 = (User)context.getBean("user");
		UserServiceImpl userService = (UserServiceImpl)context.getBean("userService");
		
		userService.printUserName(user1);*/
		
		System.out.println("context Loading");
	}

}
