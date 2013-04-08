package org.huamuzhen.interpreter.operator;

public class LessThanOrEqualToInterpreter extends OperatorInterpreter {
	
	public final static LessThanOrEqualToInterpreter INSTANCE = new LessThanOrEqualToInterpreter();
	
	private LessThanOrEqualToInterpreter(){
		representation.add(" <= ");
	}
	
	@Override
	public String interpret(String input) {
		// TODO Auto-generated method stub
		return null;
	}

}
