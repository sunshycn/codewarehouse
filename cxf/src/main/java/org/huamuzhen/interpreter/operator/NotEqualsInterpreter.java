package org.huamuzhen.interpreter.operator;

public final class NotEqualsInterpreter extends OperatorInterpreter{
	
	public final static NotEqualsInterpreter INSTANCE = new NotEqualsInterpreter();
	
	private NotEqualsInterpreter(){
		representationList.add(" != ");
		representationList.add(" NOTEQUALS ");
	}

	@Override
	protected void fillInterpretedWordListInSequence(String input) {
		
		
	}

}
