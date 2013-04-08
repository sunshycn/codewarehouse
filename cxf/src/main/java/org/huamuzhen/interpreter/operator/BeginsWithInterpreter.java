package org.huamuzhen.interpreter.operator;

public class BeginsWithInterpreter extends OperatorInterpreter {
	
	public final static BeginsWithInterpreter INSTANCE = new BeginsWithInterpreter();
	
	private BeginsWithInterpreter(){
		representation.add(" BeginsWith ");
	}

	@Override
	public String interpret(String input) {
		// TODO Auto-generated method stub
		return null;
	}

}
