package org.huamuzhen.codewarehouse.guice.module;

import org.huamuzhen.codewarehouse.guice.dao.UserDao;
import org.huamuzhen.codewarehouse.guice.dao.impl.UserDaoImpl;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import com.google.inject.name.Names;

public class AppModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(UserDao.class).to(UserDaoImpl.class).in(Singleton.class);
		bind(String.class)
        .annotatedWith(Names.named("URL"))
        .toInstance("jdbc:mysql://localhost/aaaa");

	}

}
