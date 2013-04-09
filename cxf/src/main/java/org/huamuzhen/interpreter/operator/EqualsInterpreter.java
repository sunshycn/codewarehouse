package org.huamuzhen.interpreter.operator;


public final class EqualsInterpreter extends OperatorInterpreter{
	
	public final static EqualsInterpreter INSTANCE = new EqualsInterpreter();
	
	private EqualsInterpreter(){
		representationList.add(" = ");
		representationList.add(" EQUALS ");
	}

	@Override
	protected void fillInterpretedWordListInSequence(String input) {
		// TODO Auto-generated method stub
		
	}
	
}
