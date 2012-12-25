package org.huamuzhen.codewarehouse.concurrent.imgscalr;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.imgscalr.Scalr;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ImageResizer {
	
	private final static Logger LOG = LoggerFactory
			.getLogger(ImageResizer.class);		
	
	public static boolean resize(String imagePath, int width, int height,String targetPath, String imageFormat){

		FileInputStream fis = null;
		try {
			fis = new FileInputStream( new File(imagePath));
			BufferedImage bi = ImageIO.read(fis);
			BufferedImage resizeImage = Scalr.resize(bi,Scalr.Method.ULTRA_QUALITY,Scalr.Mode.AUTOMATIC, width, height);
			return ImageIO.write(resizeImage, imageFormat, new File(
					targetPath));
		} catch (FileNotFoundException fileNotFoundException) {
			LOG.error(fileNotFoundException.getMessage());
		} catch (IOException ioException) {
			LOG.error(ioException.getMessage());
		}finally{
			try {
				if(fis != null){
					fis.close();
				}			
			} catch (IOException e) {
				LOG.error(e.getMessage());
			}
		}
		return false;
	}

}
