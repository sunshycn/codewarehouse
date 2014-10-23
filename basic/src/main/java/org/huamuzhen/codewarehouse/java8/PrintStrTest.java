package org.huamuzhen.codewarehouse.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class PrintStrTest {
	
	static Map<Character, List<String>> strMap = new HashMap<>();
	static List<List<String>> result = new ArrayList<List<String>>();
	static Deque<String> printStrQueue = new LinkedList<String>();


	public static void main(String[] args) {
		strMap.put('1', Arrays.asList("a","b","c"));
		strMap.put('2', Arrays.asList("e","f","g"));
		strMap.put('3', Arrays.asList("h","i","j"));
		
		System.out.println(strMap);
		String input = "123321";
		
		char[] charArray = input.toCharArray();
		for(int i=0; i<charArray.length;i++){
			result.add(getPossibleStr(charArray[i]));
		}
		System.out.println(result);
		/*String sub1 = input.substring(0,1);
		String sub2 = input.substring(1, input.length());
		if(sub2 == null){
			return;
		}else{
			result.add(getPossibleStr(sub1)); 
			handle(sub2);
		}*/
	/*	List<String> list = result.get(0);
			for(String str: list){
				System.out.print(str);
				printAStr(i);
			}*/
		int resultSize = result.size();

		printAStr(0,resultSize - 1);

	}
	
	public static void printAStr(int i, final int maxIndex){
		if(i > maxIndex){
			return;
		}else{
			List<String> list = result.get(i);
			if(i < maxIndex){
				for(String str: list){
					printStrQueue.add(str);
					printAStr(i+1,  maxIndex);
					printStrQueue.pollLast();
				}
			}else if(i == maxIndex ){
				for(String str: list){
					printStrQueue.add(str);
					print(printStrQueue);
					printStrQueue.pollLast();
				}
			}
		}
		
	}
	
	public static List<String> getPossibleStr(Character key){
		return strMap.get(key);
	}
	
	public static void print(Collection<String> list){
		for(String str: list){
			System.out.print(str);
		}
		System.out.println();
	}

}
