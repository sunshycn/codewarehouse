package org.huamuzhen.codewarehouse.spring.dao;

import org.huamuzhen.codewarehouse.spring.entity.User;

public interface UserDao {

	public abstract void save(User user);

	public abstract void update(User user);

	public abstract void get(String id);

}