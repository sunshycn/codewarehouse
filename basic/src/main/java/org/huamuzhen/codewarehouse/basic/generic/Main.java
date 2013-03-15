package org.huamuzhen.codewarehouse.basic.generic;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Favorites f = new Favorites();
		f.putFavorite(Integer.class, 2);
		f.putFavorite(Integer.class, 3);
		System.out.println(f.getFavorite(Integer.class));
	}

}
