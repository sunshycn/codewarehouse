package org.huamuzhen.codewarehouse.concurrent.atomic;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicReference;

public class AllAtomicClass {
	
	private AtomicReference<Integer> intRef = new AtomicReference<Integer>();
	
	private AtomicBoolean atomicBoolean = new AtomicBoolean();
	
	private AtomicInteger atomicInteger = new AtomicInteger();
	
	private AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(10);
	
	public void method(){
		
	}

}
