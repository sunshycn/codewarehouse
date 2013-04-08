package org.huamuzhen.interpreter.operator;

public class LessThanInterpreter extends OperatorInterpreter{
	
	public final static LessThanInterpreter INSTANCE = new LessThanInterpreter();
	
	private LessThanInterpreter(){
		representation.add(" LessThan ");
		representation.add(" < ");
	}

	@Override
	public String interpret(String input) {
		// TODO Auto-generated method stub
		return null;
	}

}
