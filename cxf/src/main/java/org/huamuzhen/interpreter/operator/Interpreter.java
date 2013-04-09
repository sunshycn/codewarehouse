package org.huamuzhen.interpreter.operator;

public interface Interpreter {
	
	/**
	 * interpret the input and generate relevant output
	 * according to certain rules
	 * 
	 * @param String input 
	 * @return String output
	 * */
	public String interpret(String input);

}
