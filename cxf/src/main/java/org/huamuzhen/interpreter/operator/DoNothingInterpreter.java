package org.huamuzhen.interpreter.operator;

import org.huamuzhen.interpreter.Interpreter;

public class DoNothingInterpreter implements Interpreter<String,String> {
	
	public final static DoNothingInterpreter INSTANCE = new DoNothingInterpreter();

	/**
	 * this Interpreter will not interpret input, it just return 
	 * input directly. when no other interpreter matched, this interpreter
	 * is used as default
	 * */
	@Override
	public String interpret(String input) {
		return input;
	}

}
