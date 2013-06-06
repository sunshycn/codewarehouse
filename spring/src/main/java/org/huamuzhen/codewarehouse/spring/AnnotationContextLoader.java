package org.huamuzhen.codewarehouse.spring;

import org.huamuzhen.codewarehouse.spring.config.AppContext;
import org.huamuzhen.codewarehouse.spring.service.UserService;
import org.huamuzhen.codewarehouse.spring.service.UserServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationContextLoader {
	
	public static void main(String args[]) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(AppContext.class);
		context.refresh();
		UserService service = (UserService)context.getBean(UserServiceImpl.class);
		UserService service2 = (UserService)context.getBean(UserServiceImpl.class);
		
		System.out.println(service == service2);
		
		
	}

}
