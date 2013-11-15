package org.huamuzhen.codewarehouse.basic.collection.transform;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionUtils {
	
	public static  <F,T> Collection<T> transform(Collection<F> inputCollection, Transformer<F,T> transformer){
		Collection<T> toCollection = new ArrayList<T>();
		for(F from : inputCollection){
			toCollection.add(transformer.transform(from));
		}
		return toCollection;
	}

}
