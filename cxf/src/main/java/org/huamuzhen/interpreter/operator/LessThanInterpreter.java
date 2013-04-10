package org.huamuzhen.interpreter.operator;

public class LessThanInterpreter extends OperatorInterpreter{
	
	public final static LessThanInterpreter INSTANCE = new LessThanInterpreter();
	
	private LessThanInterpreter(){
		representationList.add(" LessThan ");
		representationList.add(" < ");
	}

	@Override
	protected void fillInterpretedWordListInSequence() {
		// TODO Auto-generated method stub
		
	}

}
