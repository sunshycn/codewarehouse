package org.huamuzhen.interpreter.operator;

public class BeginsWithInterpreter extends OperatorInterpreter {
	
	public final static BeginsWithInterpreter INSTANCE = new BeginsWithInterpreter();
	
	private BeginsWithInterpreter(){
		representationList.add(" BeginsWith ");
	}

	@Override
	protected void fillInterpretedWordListInSequence(String input) {
		
		
	}



}
