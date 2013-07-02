package org.huamuzhen.codewarehouse.concurrent.forkandjoin;

import java.util.List;
import java.util.concurrent.ForkJoinPool;


/**
 * sort using forkandjoin mode
 * */
public class Main {

	private final static ForkJoinPool forkJoinPool = new ForkJoinPool();

	
	public static void main(String[] args) {
		List<Double> list = RandomUtils.getRandomNumericList(0, 1000000, 1000000);
		long t1 = System.currentTimeMillis();
		Double result = forkJoinPool.invoke(new FindMaxDoubleTask(list,2));
		System.out.println(result);
		System.out.println(System.currentTimeMillis() - t1);
		
		long t2 = System.currentTimeMillis();
		Double max=0.0;
		for(Double entry: list){
			if (entry > max){
				max = entry;
			}
		}
		System.out.println(max);
		System.out.println(System.currentTimeMillis() - t2);
	}

}
