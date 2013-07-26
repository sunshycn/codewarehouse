package org.huamuzhen.codewarehouse.spring.dao;

import org.huamuzhen.codewarehouse.spring.entity.User;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;

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
System.out.println("trying to get id:" + id);		
	}

}
