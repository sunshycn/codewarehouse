package org.huamuzhen.interpreter.operator;

public final class InInterpreter extends OperatorInterpreter {
	
	public final static InInterpreter INSTANCE = new InInterpreter();
	
	private InInterpreter(){
		representationList.add(" IN ");
	}

	@Override
	protected void fillInterpretedWordListInSequence(String input) {
		// TODO Auto-generated method stub
		
	}
	
}
