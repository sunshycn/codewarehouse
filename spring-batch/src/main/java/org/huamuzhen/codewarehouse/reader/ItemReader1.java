package org.huamuzhen.codewarehouse.reader;

import org.springframework.batch.item.ItemReader;

public class ItemReader1 implements ItemReader<String> {

	private static final int MAX_OUTER = 0;

	private String[] input = { "Hello", "world!", "Wow", "that's", "cool!" };

	private int index = 0;

	private int outer = 0;

	/**
	 * Reads next record from input
	 */
	public synchronized String read() throws Exception {
		if (index >= input.length) {
			outer++;
			if (outer > MAX_OUTER) {
				return null;
			} else {
				index = 0;
			}
		}
		return input[index++];
	}

}
