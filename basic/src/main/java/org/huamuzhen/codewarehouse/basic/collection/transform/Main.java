package org.huamuzhen.codewarehouse.basic.collection.transform;

import java.util.ArrayList;
import java.util.Collection;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Collection<Integer> intCollection = new ArrayList<Integer>();
		intCollection.add(1);
		intCollection.add(2);
		intCollection.add(3);
		Collection<String> strCollection = CollectionUtils.transform(intCollection);
		System.out.println(strCollection);

	}

}
