package org.huamuzhen.codewarehouse.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassPathXMLContextLoaderAOPXML {
	
	
	public static void main(String args[]) {
		
		ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext("application-context-aop-schema.xml");
		
	}

}
