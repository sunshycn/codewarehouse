package org.huamuzhen.interpreter.operator;

public class NotContainsInterpreter extends OperatorInterpreter {

	public final static NotContainsInterpreter INSTANCE = new NotContainsInterpreter();
	
	private NotContainsInterpreter(){
		representation.add(" NotContains ");
	}
	
	@Override
	public String interpret(String input) {
		// TODO Auto-generated method stub
		return null;
	}

}
