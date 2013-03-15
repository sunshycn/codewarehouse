package org.huamuzhen.codewarehouse.spring;

import org.huamuzhen.codewarehouse.spring.entity.User;
import org.huamuzhen.codewarehouse.spring.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContextLoader {
	
	
	public static void main(String args[]){
		System.out.println("context Loading");
		ApplicationContext context  = new ClassPathXmlApplicationContext("application-context.xml");
		User user1 = (User)context.getBean("user");
		UserService userService = (UserService)context.getBean("userService");
		userService.printUserName(user1);
		
	}

}
