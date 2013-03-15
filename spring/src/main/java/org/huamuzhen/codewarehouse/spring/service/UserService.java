package org.huamuzhen.codewarehouse.spring.service;

import org.huamuzhen.codewarehouse.spring.entity.User;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserService {
	
	public void printUserName(User user){
		System.out.println(user.getName());
		throw new RuntimeException("exception");
	}

}
