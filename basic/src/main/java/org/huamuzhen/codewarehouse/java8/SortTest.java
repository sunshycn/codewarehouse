package org.huamuzhen.codewarehouse.java8;

import java.util.List;
import java.util.stream.Stream;

import com.google.common.collect.Lists;



public class SortTest {
	
	public  static void main(String args[]){
	Double[] array = (Double[])Stream.generate(() -> Math.random()).limit(10).toArray(Double[]::new);
	
	Lists.newArrayList(array).forEach(System.out::println);
	System.out.println("after sort asc");
	Lists.newArrayList(array).stream().sorted().forEach(System.out::println);
	System.out.println("after sort desc");
	Lists.newArrayList(array).stream().sorted((x,y) -> {if(x>y){return -1;}else{return 1;}}).forEach(System.out::println);

	}

}
