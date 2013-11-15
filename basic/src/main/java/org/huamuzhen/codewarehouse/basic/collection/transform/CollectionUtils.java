package org.huamuzhen.codewarehouse.basic.collection.transform;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CollectionUtils {
	
	private static Map<Class<?>,Transformer<?,?>> transformerMap= new HashMap<Class<?>,Transformer<?,?>>();
	static {
		transformerMap.put(Integer.class, new IntToString());
	}
	
	public static  <F,T> Collection<T> transform(Collection<F> inputCollection, Transformer<F,T> transformer){
System.out.println("Collection size: " + inputCollection.size());
		Collection<T> toCollection = new ArrayList<T>();
		for(F from : inputCollection){
			toCollection.add(transformer.transform(from));
		} 
		return toCollection;
	}
	
	@SuppressWarnings("rawtypes")
	public static Transformer getTransformer(Class<?> key){
		return transformerMap.get(key);
	}
	
	@SuppressWarnings("unchecked")
	public static <F,T> Collection<T> transform(Collection<F> inputCollection){
		F object = inputCollection.iterator().next();
		return transform(inputCollection,getTransformer(object.getClass()));
	}

}
