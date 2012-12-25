package org.huamuzhen.codewarehouse.concurrent.imgscalr;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.ArrayUtils;
import org.springframework.util.StopWatch;

public class Main {
	
	public static void main(String args[]){
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		String sourceDirStr = "/app/input/Image_X_MediaBin/derivatives/";
		File sourceDir = new File(sourceDirStr);
		String[] fileNames = sourceDir.list();
		System.out.println("total Images: " + fileNames.length);
		int threadNum = 10;
		int totalImages = fileNames.length;
		int quantityForEachThread = totalImages/threadNum;
		List<Thread> threadList = new ArrayList<Thread>();
		for(int i=0; i< threadNum; i++){
			int start = i*quantityForEachThread;
			int end = (i+1)*quantityForEachThread;
			if(i == threadNum -1){
				end = totalImages;
			}
			System.out.println("images from: " + start+ " to: "+ end);
			Thread t = new Thread (new DerivativeThread((String[])ArrayUtils.subarray(fileNames, start, end),sourceDirStr));
			threadList.add(t);
			t.start();
		}
		try {
			for(Thread t: threadList){
				t.join();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		stopWatch.stop();
		System.out.println("done.cost: " + stopWatch.getTotalTimeMillis());
		System.out.println("the end of main");
	}

}
