package org.huamuzhen.codewarehouse.spring.dao;

import org.huamuzhen.codewarehouse.spring.entity.User;

public class UserDaoImpl implements UserDao {
	
	@Override
	public void save(User user){
System.out.println(this + " save " + user);
	}
	

	@Override
	public void update(User user){
System.out.println(this + " update " + user);		
	}
	

	@Override
	public void get(String id){
System.out.println(" call get");		
	}

}
