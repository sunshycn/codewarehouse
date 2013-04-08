package org.huamuzhen.interpreter.operator;

public class GreaterThanInterpreter extends OperatorInterpreter {

	public final static GreaterThanInterpreter INSTANCE = new GreaterThanInterpreter();
	
	private GreaterThanInterpreter(){
		representation.add(" GreaterThan ");
		representation.add(" > ");
	}
	
	@Override
	public String interpret(String input) {
		// TODO Auto-generated method stub
		return null;
	}

}
