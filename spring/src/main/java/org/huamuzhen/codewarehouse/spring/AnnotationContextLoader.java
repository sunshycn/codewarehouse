package org.huamuzhen.codewarehouse.spring;

import org.huamuzhen.codewarehouse.spring.config.AppContext;
import org.huamuzhen.codewarehouse.spring.service.UserService;
import org.huamuzhen.codewarehouse.spring.service.UserServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationContextLoader {
	
	public static void main(String args[]) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		//use conf in AppContext set  
		context.register(AppContext.class);
		context.refresh();
		
		UserService service = (UserServiceImpl)context.getBean(UserServiceImpl.class);
		UserService service2 = (UserServiceImpl)context.getBean("springUserService");
		// should be true
		System.out.println(service == service2);
		
		service.get("123");
	}

}
