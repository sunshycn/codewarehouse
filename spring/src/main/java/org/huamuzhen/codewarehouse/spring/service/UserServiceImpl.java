package org.huamuzhen.codewarehouse.spring.service;

import org.huamuzhen.codewarehouse.spring.dao.UserDao;
import org.huamuzhen.codewarehouse.spring.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;
	
	public void printUserName(User user){
		System.out.println(user.getName());
		throw new RuntimeException("exception");
	}
	
	public void get(String id){
		userDao.get(id);
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

}
