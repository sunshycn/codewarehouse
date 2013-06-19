package org.huamuzhen.codewarehouse.spring.config;

import javax.inject.Singleton;

import org.huamuzhen.codewarehouse.spring.dao.UserDao;
import org.huamuzhen.codewarehouse.spring.dao.UserDaoImpl;
import org.huamuzhen.codewarehouse.spring.service.UserService;
import org.huamuzhen.codewarehouse.spring.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


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
}
