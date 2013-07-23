package com.huamuzhen.codewarehouse.guava;

import java.util.Collection;
import java.util.List;

import org.junit.Test;

import com.google.common.base.Function;
import com.google.common.base.Functions;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;

public class TestFunction {
	
	@Test
	public void test1(){
		Function<Integer,String> f1 = new Function<Integer,String>() {
				public String apply(Integer i) {  
			        if(i==null) {  
			            return "";  
			        }  
			        return i.toString();  
			    }   
		   
		};  
		Function<Integer,Integer> f2 = new Function<Integer,Integer>() {
			public Integer apply(Integer i) {  
		        if(i==null) {  
		            return 0;  
		        }  
		        return i+1;  
		    }   
	   
	}; 
	
	List<Integer> intList = Lists.newLinkedList();
	intList.add(1);
	intList.add(2);
	intList.add(3);
	
	Function<Integer,String> f3 = Functions.compose(f1, f2); 
	
	Collection<String> strList = Collections2.transform(intList, f3);
	for(String str : strList){
		System.out.println(str);
	}
	}

}
