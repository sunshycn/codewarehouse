package org.huamuzhen.interpreter;

public interface Interpreter<T,V> {
	
	/**
	 * interpret the input and generate relevant output
	 * according to certain rules
	 * 
	 * @param T input 
	 * @return V output
	 * */
	public V interpret(T input);

}
