package org.huamuzhen.interpreter.operator;

public class EndsWithInterpreter extends OperatorInterpreter{
	
	public final static EndsWithInterpreter INSTANCE = new EndsWithInterpreter();
	
	private EndsWithInterpreter(){
		representationList.add(" EndsWith ");
	}

	@Override
	protected void fillInterpretedWordListInSequence(String input) {
		// TODO Auto-generated method stub
		
	}

}
