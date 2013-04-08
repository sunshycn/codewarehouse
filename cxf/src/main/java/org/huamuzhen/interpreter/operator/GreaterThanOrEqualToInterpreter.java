package org.huamuzhen.interpreter.operator;

public class GreaterThanOrEqualToInterpreter extends OperatorInterpreter {

	public final static GreaterThanOrEqualToInterpreter INSTANCE = new GreaterThanOrEqualToInterpreter();
	
	private GreaterThanOrEqualToInterpreter(){
		representation.add(" >= ");
	}
	
	@Override
	public String interpret(String input) {
		// TODO Auto-generated method stub
		return null;
	}

}
