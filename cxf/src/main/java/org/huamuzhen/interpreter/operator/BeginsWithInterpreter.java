package org.huamuzhen.interpreter.operator;

import org.huamuzhen.interpreter.Constants;

public class BeginsWithInterpreter extends OperatorInterpreter {
	
	public final static BeginsWithInterpreter INSTANCE = new BeginsWithInterpreter();
	
	private BeginsWithInterpreter(){
		representationList.add(" BeginsWith ");
	}

	@Override
	protected void fillInterpretedWordListInSequence() {
		interpretedWordList.add(Constants.ATTR_PREFIX + singleScriptQueryStatementObj.getAttribute());
		interpretedWordList.add(":");
		interpretedWordList.add(singleScriptQueryStatementObj.getValue()+"*");
	}



}
