package org.huamuzhen.codewarehouse.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class FileSystemXMLContextLoader {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context  = new FileSystemXmlApplicationContext("src/main/java/application-context2.xml");
		
		System.out.println("loaded");
	}

}
