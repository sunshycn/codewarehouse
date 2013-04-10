package org.huamuzhen.interpreter.operator;


public final class EqualsInterpreter extends OperatorInterpreter{
	
	public final static EqualsInterpreter INSTANCE = new EqualsInterpreter();
	
	private EqualsInterpreter(){
		representationList.add(" = ");
		representationList.add(" Equals ");
	}

	@Override
	protected void fillInterpretedWordListInSequence() {
		// TODO Auto-generated method stub
		
	}
	
}
