package com.huamuzhen.codewarehouse.guava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class TestLLL {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		
		map.put(null, "1");
		map.put("2", "2");
		
		System.out.println(map.get(null));
		for(Entry<String,String> entry: map.entrySet()){
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		/*ArrayList<String> a = new ArrayList<String>();
		a.add(null);
		System.out.println(a.size());
		System.out.println(a.get(0));*/
		System.out.println(map.toString());
		
		Map<String,List<Integer>> map2 = new HashMap<String,List<Integer>>();
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(11);
		list1.add(12);
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(21);
		list2.add(22);
		map2.put("s1", list1);
		map2.put("s2", list2);
		System.out.println(map2.toString());
		
		Map<String,Map<String,Boolean>> map3 = new HashMap<String,Map<String,Boolean>>();
		Map<String,Boolean> m1 = new HashMap<String,Boolean>();
		m1.put("s1", true);
		m1.put("s2", false);
		Map<String,Boolean> m2 = new HashMap<String,Boolean>();
		m2.put("s3", true);
		m2.put("s4", false);
		map3.put("m1", m1);
		map3.put("m2", m2);
		System.out.println(map3.toString());
	}

}
