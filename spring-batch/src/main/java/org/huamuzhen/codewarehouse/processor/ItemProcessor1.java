package org.huamuzhen.codewarehouse.processor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

public class ItemProcessor1 implements ItemProcessor<String, String> {
	
	private static final Logger log = LoggerFactory.getLogger(ItemProcessor1.class);

	@Override
	public String process(String item) throws Exception {
		log.info("in processor");
		return item;
	}

}
