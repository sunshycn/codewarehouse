package org.huamuzhen.codewarehouse.writer;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;

public class ItemWriter1 implements ItemWriter<Object> {

	private static final Logger log = LoggerFactory.getLogger(ItemWriter1.class);
	private boolean fail = false;
	
	public void setFail(boolean fail) {
		this.fail = fail;
	}

	/**
	 * @see ItemWriter#write(List)
	 */
	public void write(List<? extends Object> data) throws Exception {
		log.info(data.toString());
		if (fail ) {
			throw new RuntimeException("Planned failure");
		}
	}

}
