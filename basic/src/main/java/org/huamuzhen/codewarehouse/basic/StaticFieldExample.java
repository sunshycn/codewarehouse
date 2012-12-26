package org.huamuzhen.codewarehouse.basic;

/**
 * check the running sequence of static field, static block
 * and constructor. 
 * */
public class StaticFieldExample {
	
	public static int b=1;

	public StaticFieldExample(){
		System.out.println("constructor");
	}
	
	static{
		a=2;
		b=2;
		System.out.println("static 1");
	}
	
	public static int a =1;
	
	static{
		System.out.println("static 2");
	}
	
	public static void main(String args[]){
		StaticFieldExample sfe = new StaticFieldExample();
		System.out.println("a="+ a);
		System.out.println("b="+ b);
	}
}
