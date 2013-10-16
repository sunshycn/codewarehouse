package org.huamuzhen.codewarehouse.reader;

import org.huamuzhen.codewarehouse.writer.ItemWriter1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemReader;

public class ItemReader1 implements ItemReader<String> {

	private static final Logger log = LoggerFactory.getLogger(ItemWriter1.class);
	
	private int maxOuter = 1;

	private String[] input = { "Hello", "world!", "Wow", "that's", "cool!" };

	private int index = 0;

	private int outer = 0;

	/**
	 * Reads next record from input
	 */
	public synchronized String read() throws Exception {
		log.info("start reading, maxOuter is: " + maxOuter);
		if (index >= input.length) {
			outer++;
			if (outer > maxOuter) {
				return null;
			} else {
				index = 0;
			}
		}
		return input[index++];
	}

	public int getMaxOuter() {
		return maxOuter;
	}

	public void setMaxOuter(int maxOuter) {
		this.maxOuter = maxOuter;
	}

}
