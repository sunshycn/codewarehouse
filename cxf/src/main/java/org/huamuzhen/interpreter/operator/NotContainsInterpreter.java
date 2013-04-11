package org.huamuzhen.interpreter.operator;

public class NotContainsInterpreter extends OperatorInterpreter {

	public final static NotContainsInterpreter INSTANCE = new NotContainsInterpreter();
	
	private NotContainsInterpreter(){
		representationList.add(" NotContains ");
	}

	@Override
	protected void fillInterpretedWordListInSequence() {
		interpretedWordList.add("-" + ATTR_PREFIX + singleScriptQueryStatementObj.getAttribute());
		interpretedWordList.add(":");
		interpretedWordList.add("*" + singleScriptQueryStatementObj.getValue() + "*");
	}

}
