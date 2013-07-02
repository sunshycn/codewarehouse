package org.huamuzhen.codewarehouse.concurrent.forkandjoin;

import java.util.ArrayList;
import java.util.List;

public class RandomUtils {
	
	public static List<Double> getRandomNumericList(int min, int max, int quantity){
		
		long start = System.currentTimeMillis();
		
		List<Double> list = new ArrayList<>();
		for(int i=0; i< quantity;i++){
			double random = Math.random()*(max+1 - min) + min;
			list.add(random);
		}
		System.out.println("generate " + quantity +" doubles at range" + "["+min+","+max+"]"+" in "+(System.currentTimeMillis() - start));
		return list;
	}
	
	public static void main(String args[]){
		List<Double> list = getRandomNumericList(1,10000,100000);
		
		/*for(Double entity: list){
			System.out.println(entity);
		}*/
	}

}
