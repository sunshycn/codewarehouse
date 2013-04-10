package org.huamuzhen.interpreter.operator;

public class LessThanOrEqualToInterpreter extends OperatorInterpreter {
	
	public final static LessThanOrEqualToInterpreter INSTANCE = new LessThanOrEqualToInterpreter();
	
	private LessThanOrEqualToInterpreter(){
		representationList.add(" <= ");
	}

	@Override
	protected void fillInterpretedWordListInSequence() {
		// TODO Auto-generated method stub
		
	}

}
