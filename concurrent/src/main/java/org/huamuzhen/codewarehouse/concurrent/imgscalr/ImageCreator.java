package org.huamuzhen.codewarehouse.concurrent.imgscalr;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.util.StopWatch;




public class ImageCreator {

	/**
	 * 
	 * source image path, for now, we only accept images whose
	 * name starts with 13 digits.
	 * target dir for copied images
	 * how many copied images you want to create
	 */
	public static void createImages(String sourceImagePath, String targetDir, int quantity) throws Exception{
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		File sourceImage = new File(sourceImagePath);
		String sourceImageFileName = StringUtils.substringAfterLast(sourceImagePath, "/");
		long sourceImageFileNameWithoutExtension = Long.parseLong(StringUtils.substringBefore(sourceImageFileName, "."));
		for(int i=0;i<quantity;i++){
			String targetFileName = targetDir+attachZero(sourceImageFileNameWithoutExtension + 1000*i)+".jpg";
			
			FileUtils.copyFile(sourceImage, new File(targetFileName));
		}
		stopWatch.stop();
		System.out.println("done, quantity of copied image files: " +quantity + " spent millis: " + stopWatch.getTotalTimeMillis());
	}
	
	private static String attachZero(Long number){
		int lengthOfNumber = number.toString().length();
		if(lengthOfNumber >=13){
			return number.toString();
		}else{
			StringBuilder attached=new StringBuilder();
			for(int i = lengthOfNumber; i<13;i++ ){
				attached.append("0");
			}
			return attached.toString() + number.toString(); 
		}
	}
	
	public static void main(String args[]) throws Exception{
		createImages(args[0],args[1],Integer.parseInt(args[2]));
	}

}
