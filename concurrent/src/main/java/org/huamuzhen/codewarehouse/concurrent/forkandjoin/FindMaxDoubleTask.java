package org.huamuzhen.codewarehouse.concurrent.forkandjoin;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 * Use ForkAndJoin mode to find max number
 * 
 * */
public class FindMaxDoubleTask extends RecursiveTask<Double> {

	private final List<Double> list;
	
	private final int numOfTasks;
	
	public FindMaxDoubleTask(List<Double> list, int numOfTasks){
		this.list = list;
		this.numOfTasks = numOfTasks;
	}

	
	private static final long serialVersionUID = 7288369519281340752L;

	@Override
	protected Double compute() {
		int listSize = list.size();
		int block = listSize/numOfTasks;
		List<RecursiveTask<Double>> forks = new LinkedList<>();
		if(listSize > 100){
			for(int i= 0; i< numOfTasks;i++){
				FindMaxDoubleTask subTask;
				if(i == numOfTasks -1 ){
					subTask = new FindMaxDoubleTask(list.subList(i*block, listSize),numOfTasks);
				}else{
					subTask = new FindMaxDoubleTask(list.subList(i*block, (i+1)*block),numOfTasks);
				}
				
				forks.add(subTask);
				subTask.fork();
			}
			Double max = 0.0;
			for(RecursiveTask<Double> task: forks){
				if(task.join() > max){
					max = task.join();
				}
			}
			return max;
		}else{
			Double max = 0.0;
			for(Double entry:list){
				if(max < entry){
					max = entry;
				}
			}
			return max;
		}
	}
	
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
