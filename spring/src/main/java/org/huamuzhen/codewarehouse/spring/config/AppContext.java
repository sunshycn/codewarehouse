package org.huamuzhen.codewarehouse.spring.config;

import org.huamuzhen.codewarehouse.spring.dao.UserDao;
import org.huamuzhen.codewarehouse.spring.dao.UserDaoImpl;
import org.huamuzhen.codewarehouse.spring.reflect.TestObject;
import org.huamuzhen.codewarehouse.spring.service.UserService;
import org.huamuzhen.codewarehouse.spring.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
public class AppContext {

	@Bean(name="springUserService")
	public UserService userService(){
		return new UserServiceImpl();
	}

	@Bean(name="springUserDao")
	public UserDao userDao(){
		return new UserDaoImpl();
	}
	
	@Bean(name="testObject")
	@Scope("prototype")
	public TestObject testObject(){
		return new TestObject();
	}
}
