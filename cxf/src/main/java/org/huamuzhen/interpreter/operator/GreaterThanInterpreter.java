package org.huamuzhen.interpreter.operator;

public class GreaterThanInterpreter extends OperatorInterpreter {

	public final static GreaterThanInterpreter INSTANCE = new GreaterThanInterpreter();
	
	private GreaterThanInterpreter(){
		representationList.add(" GreaterThan ");
		representationList.add(" > ");
	}

	@Override
	protected void fillInterpretedWordListInSequence() {
		// TODO Auto-generated method stub
		
	}

}
