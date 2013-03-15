package org.huamuzhen.codewarehouse.basic;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
	
	
	public static void main(String args[]) throws SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException{
		A a = new A();
		/*Field f = a.getClass().getDeclaredField("a");
		f.setAccessible(true);
		System.out.println(f.getName());
		System.out.println(f.get(a));*/
		
		Method m = a.getClass().getDeclaredMethod("setA", String.class);
		//m.setAccessible(true);
	//	m.invoke(a, "1");
		Object b = new Object();
		m.invoke(b, "1");
	}


}
