package org.huamuzhen.interpreter.operator;

public class GreaterThanOrEqualToInterpreter extends OperatorInterpreter {

	public final static GreaterThanOrEqualToInterpreter INSTANCE = new GreaterThanOrEqualToInterpreter();
	
	private GreaterThanOrEqualToInterpreter(){
		representationList.add(" >= ");
	}

	@Override
	protected void fillInterpretedWordListInSequence() {
		// TODO Auto-generated method stub
		
	}

}
