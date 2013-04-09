package org.huamuzhen.interpreter.operator;

public class NotContainsInterpreter extends OperatorInterpreter {

	public final static NotContainsInterpreter INSTANCE = new NotContainsInterpreter();
	
	private NotContainsInterpreter(){
		representationList.add(" NotContains ");
	}

	@Override
	protected void fillInterpretedWordListInSequence(String input) {
		// TODO Auto-generated method stub
		
	}

}
