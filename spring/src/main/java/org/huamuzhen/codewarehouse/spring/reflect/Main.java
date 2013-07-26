package org.huamuzhen.codewarehouse.spring.reflect;

import java.lang.reflect.Field;

import org.springframework.util.ReflectionUtils;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		TestObject object = new TestObject();
		Field strValueField = object.getClass().getDeclaredField("strValue");
		ReflectionUtils.makeAccessible(strValueField);
		strValueField.set(object, "testStrValue");
System.out.println(object.getStrValue());
		

	}

}
