package org.huamuzhen.codewarehouse.basic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NIOTest {
	
	public static void main(String[] args) throws Exception {
		
		//ByteArrayOutputStream bais = ne
		FileInputStream fis = new FileInputStream("/1.txt");
		FileChannel fc = fis.getChannel();
		/*
		byte[] ba = new byte[2];
		
		int pos;
		while((pos = fis.read(ba, 0, ba.length))!= -1){
			for(int x=0; x<pos;x++){
				System.out.println((char)ba[x]);
			}
		}*/
		ByteBuffer bb = ByteBuffer.allocate(1024);
	//	System.out.println(bb.capacity());
		fc.read(bb);
	//	System.out.println(bb.capacity());
		FileOutputStream fos = new FileOutputStream("/zzzz/1.txt");
		FileChannel fc2 = fos.getChannel();
		bb.flip();
		fc2.write(bb);
		//fc.t
	}

}
