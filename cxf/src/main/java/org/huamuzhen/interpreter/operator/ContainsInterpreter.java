package org.huamuzhen.interpreter.operator;

import org.huamuzhen.interpreter.Constants;

public class ContainsInterpreter extends OperatorInterpreter {

	public final static ContainsInterpreter INSTANCE = new ContainsInterpreter();
	
	public final static String CONTAINS = " Contains ";
	
	private ContainsInterpreter(){
		representationList.add(CONTAINS);
	}

	@Override
	protected void fillInterpretedWordListInSequence() {
		interpretedWordList.add(Constants.ATTR_PREFIX + singleScriptQueryStatementObj.getAttribute());
		interpretedWordList.add(":");
		interpretedWordList.add(singleScriptQueryStatementObj.getValue());
	}
	
}
