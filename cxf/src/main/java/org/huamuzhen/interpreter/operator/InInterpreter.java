package org.huamuzhen.interpreter.operator;

public final class InInterpreter extends OperatorInterpreter {
	
	public final static InInterpreter INSTANCE = new InInterpreter();
	
	private InInterpreter(){
		representation.add(" IN ");
	}
	
	@Override
	public  String interpret(String input){
		return null;
	}

}
