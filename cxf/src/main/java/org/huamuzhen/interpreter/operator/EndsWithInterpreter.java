package org.huamuzhen.interpreter.operator;

import org.huamuzhen.interpreter.Constants;

public class EndsWithInterpreter extends OperatorInterpreter{
	
	public final static EndsWithInterpreter INSTANCE = new EndsWithInterpreter();
	
	private EndsWithInterpreter(){
		representationList.add(" EndsWith ");
	}

	@Override
	protected void fillInterpretedWordListInSequence() {
		interpretedWordList.add(Constants.ATTR_PREFIX + singleScriptQueryStatementObj.getAttribute());
		interpretedWordList.add(":");
		interpretedWordList.add("*" + singleScriptQueryStatementObj.getValue());
	}

}
