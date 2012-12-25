package org.huamuzhen.codewarehouse.concurrent.imgscalr;

import java.io.File;

import org.apache.commons.lang.ArrayUtils;
import org.springframework.util.StopWatch;

public class Main {
	
	public static void main(String args[]){
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		String sourceDirStr = "/app/input/Image_X_MediaBin/derivatives/";
		File sourceDir = new File(sourceDirStr);
		String[] fileNames = sourceDir.list();
System.out.println(fileNames.length);
		Thread t1 = new Thread (new DerivativeThread((String[])ArrayUtils.subarray(fileNames, 0, 33),sourceDirStr));
		t1.start();
		Thread t2 = new Thread (new DerivativeThread((String[])ArrayUtils.subarray(fileNames, 33, 66),sourceDirStr));
		t2.start();
		Thread t3 = new Thread (new DerivativeThread((String[])ArrayUtils.subarray(fileNames, 66, 100),sourceDirStr));
		t3.start();
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		stopWatch.stop();
		System.out.println("done.cost: " + stopWatch.getTotalTimeMillis());
		System.out.println("the end of main");
	}

}
