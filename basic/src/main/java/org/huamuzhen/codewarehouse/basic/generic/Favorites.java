package org.huamuzhen.codewarehouse.basic.generic;

import java.util.HashMap;
import java.util.Map;

public class Favorites {
	private Map<Class<?>,Object> favorites = new HashMap<Class<?>,Object>();
	
	public <T> void putFavorite(Class<T> type, T instance){
		favorites.put(type, instance);
	}
	
	public <T> T getFavorite(Class<T> type){
		return type.cast(favorites.get(type));
	}
}
