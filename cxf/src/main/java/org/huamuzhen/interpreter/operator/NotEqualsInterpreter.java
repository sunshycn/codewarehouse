package org.huamuzhen.interpreter.operator;

public class NotEqualsInterpreter extends OperatorInterpreter{
	
	public final static NotEqualsInterpreter INSTANCE = new NotEqualsInterpreter();
	
	private NotEqualsInterpreter(){
		representationList.add(" != ");
		representationList.add(" NotEquals ");
	}

	@Override
	protected void fillInterpretedWordListInSequence() {
		
		
	}

}
