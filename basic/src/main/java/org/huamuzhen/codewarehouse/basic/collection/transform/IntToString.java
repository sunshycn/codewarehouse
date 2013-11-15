package org.huamuzhen.codewarehouse.basic.collection.transform;

public class IntToString implements Transformer<Integer, String> {

	@Override
	public String transform(Integer from) {
		
		return "\""+from.toString()+"\"";
	}

}
