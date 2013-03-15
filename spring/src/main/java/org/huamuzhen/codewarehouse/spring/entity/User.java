package org.huamuzhen.codewarehouse.spring.entity;

import org.springframework.stereotype.Component;

@Component("user")
public class User {
	
	private String name="default_name";
	private String password="default_password";
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
