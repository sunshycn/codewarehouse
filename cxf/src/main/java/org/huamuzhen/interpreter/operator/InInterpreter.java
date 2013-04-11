package org.huamuzhen.interpreter.operator;

public class InInterpreter extends OperatorInterpreter {
	
	public final static InInterpreter INSTANCE = new InInterpreter();
	
	private InInterpreter(){
		representationList.add(" In ");
	}

	@Override
	protected void fillInterpretedWordListInSequence() {
		// TODO Auto-generated method stub
		
	}
	
}
