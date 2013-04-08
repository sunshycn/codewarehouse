package org.huamuzhen.interpreter.operator;

public class EndsWithInterpreter extends OperatorInterpreter{
	
	public final static EndsWithInterpreter INSTANCE = new EndsWithInterpreter();
	
	private EndsWithInterpreter(){
		representation.add(" EndsWith ");
	}

	@Override
	public String interpret(String input) {
		// TODO Auto-generated method stub
		return null;
	}

}
