package com.huamuzhen.codewarehouse.guava;

import org.junit.Test;

import com.google.common.collect.HashMultiset;

public class TestHashMultiset {
	
	@Test
	public void test(){
		HashMultiset<String> multiSet = HashMultiset.create();
		multiSet.add("a");
		multiSet.add("a");
		multiSet.add("b");
		System.out.println(multiSet);
		
		for(String str: multiSet){
			System.out.println(str);
		}
	}

}
