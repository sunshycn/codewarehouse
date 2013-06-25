package com.huamuzhen.codewarehouse.guava;

import org.junit.Test;

import com.google.common.collect.HashMultimap;

public class TestMultiMap {
	
	@Test
	public void test(){
		HashMultimap<String, Object> map = HashMultimap.create(); 
		map.put("key1", 1);
		map.put("key1", 2);
		map.put("key2", 3);
		System.out.println(map);
		System.out.println(map.get("key1"));
		map.remove("key1", 2);
		System.out.println(map.get("key1"));
	}

}
