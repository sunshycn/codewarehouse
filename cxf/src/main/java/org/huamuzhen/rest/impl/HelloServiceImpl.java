package org.huamuzhen.rest.impl;

import org.huamuzhen.rest.HelloService;
import org.springframework.stereotype.Component;

@Component("helloService")
public class HelloServiceImpl implements HelloService{

	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return "hello world";
	}
	
	

}
