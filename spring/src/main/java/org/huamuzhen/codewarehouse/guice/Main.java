package org.huamuzhen.codewarehouse.guice;

import org.huamuzhen.codewarehouse.guice.dao.UserDao;
import org.huamuzhen.codewarehouse.guice.module.AppModule;
import org.huamuzhen.codewarehouse.guice.service.impl.UserServiceImpl;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new AppModule());
		UserServiceImpl service =injector.getInstance(UserServiceImpl.class);
System.out.println(service.sayHi());
		UserDao dao =injector.getInstance(UserDao.class);
System.out.println(dao.load());
		UserDao dao2 =injector.getInstance(UserDao.class);
System.out.println(dao == dao2);
System.out.println(service.getUrl());
	}

}
