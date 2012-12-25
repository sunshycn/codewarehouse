package org.huamuzhen.codewarehouse.concurrent.imgscalr;

public class DerivativeThread implements Runnable {
	
	public String sourceDirStr;
	
	public String[] fileNames;
	
	public DerivativeThread(String[] fileNames, String sourceDirStr){
		this.fileNames = fileNames;
		this.sourceDirStr = sourceDirStr;
	}

	@Override
	public void run() {
		for(String fileName:fileNames){
			try{
			String imagePath = sourceDirStr + fileName;
			ImageResizer.resize(imagePath, 100, 100, "/app/output/"+fileName+"_100X100.jpg", "jpg");
			ImageResizer.resize(imagePath, 200, 200, "/app/output/"+fileName+"_200X200.jpg", "jpg");
			ImageResizer.resize(imagePath, 300, 300, "/app/output/"+fileName+"_300X300.jpg", "jpg");
			ImageResizer.resize(imagePath, 400, 400, "/app/output/"+fileName+"_400X400.jpg", "jpg");
			ImageResizer.resize(imagePath, 500, 500, "/app/output/"+fileName+"_500X500.jpg", "jpg");
			}catch(RuntimeException e){
				
			}
		}
		System.out.println("the end of thread");

	}

}
