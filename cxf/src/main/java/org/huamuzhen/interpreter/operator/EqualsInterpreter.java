package org.huamuzhen.interpreter.operator;


public final class EqualsInterpreter extends OperatorInterpreter{
	
	public final static EqualsInterpreter INSTANCE = new EqualsInterpreter();
	
	private EqualsInterpreter(){
		representation.add(" = ");
		representation.add(" EQUALS ");
	}
	
	@Override
	public  String interpret(String input){
		return null;
	}

}
