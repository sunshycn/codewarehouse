package org.huamuzhen.interpreter.operator;

public class ContainsInterpreter extends OperatorInterpreter {

	public final static ContainsInterpreter INSTANCE = new ContainsInterpreter();
	
	private ContainsInterpreter(){
		representation.add(" Contains ");
	}
	
	@Override
	public String interpret(String input) {
		// TODO Auto-generated method stub
		return null;
	}

}
