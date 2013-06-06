package org.huamuzhen.codewarehouse.guice.service.impl;

import org.huamuzhen.codewarehouse.guice.dao.UserDao;
import org.huamuzhen.codewarehouse.guice.service.UserService;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class UserServiceImpl implements UserService {
	
	@Inject 
	private UserDao userDao;
	
	@Inject
	@Named("URL")
	private String url;

	/*@Inject
	public UserServiceImpl(UserDao userDao, @Named("URL") String url) {
		this.userDao = userDao;
		this.url = url;
	}*/

	
	@Override
	public String sayHi() {
		
		return "hello, " + userDao.load();
	}
	
	public String getUrl(){
		return url;
	}

}
