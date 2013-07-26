package org.huamuzhen.codewarehouse.spring;

import org.huamuzhen.codewarehouse.spring.service.UserService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class DefaultBeanFactoryLoader2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		BeanFactory container = (BeanFactory)bindViaXML(beanFactory);
		UserService userService = (UserService)container.getBean("userService");
		userService.get("234");
	}

	private static BeanFactory bindViaXML(BeanDefinitionRegistry registry) {
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(registry);
		reader.loadBeanDefinitions("classpath:application-context3.xml");
		
		return (BeanFactory)registry;
	}
	
	

}
