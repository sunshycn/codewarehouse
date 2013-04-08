package org.huamuzhen.interpreter.operator;

public final class NotEqualsInterpreter extends OperatorInterpreter{
	
	
	private NotEqualsInterpreter(){
		representation.add("!=");
		representation.add("NOTEQUALS");
	}
	
	@Override
	public  String interpret(String input){
		return null;
	}

}
