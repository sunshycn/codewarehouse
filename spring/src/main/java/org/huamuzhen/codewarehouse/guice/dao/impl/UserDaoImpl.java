package org.huamuzhen.codewarehouse.guice.dao.impl;

import org.huamuzhen.codewarehouse.guice.dao.UserDao;

public class UserDaoImpl implements UserDao {

	@Override
	public String load() {
		
		return "user1";
	}

}
