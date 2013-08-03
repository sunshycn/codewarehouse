package org.huamuzhen.codewarehouse.concurrent.forkandjoin;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class SumTask extends RecursiveTask<Double> {

	private static final long serialVersionUID = 1L;

	static final int THRESHOLD = 1000000;
	
	private final Double[] array;
	
	private int low;
	
	private int high;
	
	public SumTask(Double[] array, int low, int high){
		this.array = array;
		this.low = low;
		this.high = high;
	}
	
	@Override
	protected Double compute() {
		if(high - low <= THRESHOLD) {
            Double sum = 0.0;
            for(int i=low; i < high; ++i) 
                sum += array[i];
            return sum;
         } else {
            int mid = low + (high - low) / 2;
            SumTask left  = new SumTask(array, low, mid);
            SumTask right = new SumTask(array, mid, high);
            left.fork();
            Double rightAns = right.compute();
            Double leftAns  = left.join();
            return leftAns + rightAns;
         }
	}
	
	public static void main(String args[]){
		// current setting will make there are 2 threads running compare to 1 thread running.
		Double[] array = RandomUtils.getRandomNumericArray(0, 100, 1900000);
		ForkJoinPool forkJoinPool = new ForkJoinPool();
		System.out.println(forkJoinPool.getActiveThreadCount() + " cores found");
		long t1 = System.currentTimeMillis();
		Double sum1 = 0.0;
		for(Double entry: array){
			sum1 = sum1 + entry; 
		}
		System.out.println((System.currentTimeMillis() - t1) + " sum1: "+ sum1);
		
		long t2 = System.currentTimeMillis();
		double sum2 = forkJoinPool.invoke(new SumTask(array,0,array.length));
		System.out.println((System.currentTimeMillis() - t2) + " sum2: "+ sum2);
	}

}
