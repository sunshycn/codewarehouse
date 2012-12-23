package org.huamuzhen.codewarehouse.concurrent.basic;

public class ThreadCase1 {
	
	public static void main(String[] args){
		System.out.println(args[0]);
		System.out.println(args);
		ThreadWorker tw = new ThreadWorker("1");
		tw.method1(1,"a");
	//	tw.method2("a","b","c");
	}
	

	
}
