package org.huamuzhen.interpreter.operator;

public class ContainsInterpreter extends OperatorInterpreter {

	public final static ContainsInterpreter INSTANCE = new ContainsInterpreter();
	
	public final static String CONTAINS = " Contains ";
	
	private ContainsInterpreter(){
		representationList.add(CONTAINS);
	}

	@Override
	protected void fillInterpretedWordListInSequence() {
		interpretedWordList.add(ATTR_PREFIX + singleScriptQueryStatementObj.getAttribute());
		interpretedWordList.add(":");
		interpretedWordList.add("*" + singleScriptQueryStatementObj.getValue() + "*");
	}
	
}
