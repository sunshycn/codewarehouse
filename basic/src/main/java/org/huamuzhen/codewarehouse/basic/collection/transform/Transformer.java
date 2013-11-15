package org.huamuzhen.codewarehouse.basic.collection.transform;

public interface Transformer<F,T> {
	
	public T transform(F from);

}
