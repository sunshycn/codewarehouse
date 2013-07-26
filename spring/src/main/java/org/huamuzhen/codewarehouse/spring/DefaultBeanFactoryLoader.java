package org.huamuzhen.codewarehouse.spring;

import org.huamuzhen.codewarehouse.spring.dao.UserDaoImpl;
import org.huamuzhen.codewarehouse.spring.service.UserService;
import org.huamuzhen.codewarehouse.spring.service.UserServiceImpl;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConstructorArgumentValues;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;

public class DefaultBeanFactoryLoader {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		//beanFactory
		BeanFactory container = (BeanFactory)initContainer(beanFactory);
		UserService userService = (UserService)container.getBean("userService");
		userService.get("234");
		UserService userService2 = (UserService)container.getBean("userService");
		// default, it is singleton
System.out.println(userService == userService2);
		
	}

	private static BeanFactory initContainer(
			BeanDefinitionRegistry registry) {
		AbstractBeanDefinition userDao = new RootBeanDefinition(UserDaoImpl.class);
		AbstractBeanDefinition userService = new RootBeanDefinition(UserServiceImpl.class);
		//register bean
		registry.registerBeanDefinition("userDao", userDao);
		registry.registerBeanDefinition("userService", userService);
		// set dependency injection by setter
		MutablePropertyValues propertyValues = new MutablePropertyValues();
		propertyValues.addPropertyValue(new PropertyValue("userDao",userDao));
		userService.setPropertyValues(propertyValues);
		
		//set dependency injection by constructor
		/*ConstructorArgumentValues argValues = new ConstructorArgumentValues();
		argValues.addIndexedArgumentValue(0, userDao);
		userService.setConstructorArgumentValues(argValues);*/
		return (BeanFactory)registry;
		
	}

}
