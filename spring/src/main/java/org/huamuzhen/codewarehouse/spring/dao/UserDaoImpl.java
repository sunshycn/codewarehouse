package org.huamuzhen.codewarehouse.spring.dao;

import org.huamuzhen.codewarehouse.spring.entity.User;
import org.springframework.stereotype.Repository;


@Repository("userDao")
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
