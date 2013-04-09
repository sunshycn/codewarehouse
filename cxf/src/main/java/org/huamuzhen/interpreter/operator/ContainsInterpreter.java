package org.huamuzhen.interpreter.operator;

import org.apache.commons.lang3.StringUtils;

public class ContainsInterpreter extends OperatorInterpreter {

	public final static ContainsInterpreter INSTANCE = new ContainsInterpreter();
	
	public final static String CONTAINS = " Contains ";
	
	private ContainsInterpreter(){
		representationList.add(CONTAINS);
	}

	@Override
	protected void fillInterpretedWordListInSequence(String input) {
		int operatorIndex = -1;
		String operatorContent="";
		for(String representation:representationList){
			operatorIndex = StringUtils.indexOfIgnoreCase(input, representation);
			if(operatorIndex != -1){
				operatorContent=representation;
				break;
			}
		}
		if(operatorIndex == -1){
			throw new RuntimeException("this sub-script should not be given to this interpreter");
		}
		String beforeOperatorContent = StringUtils.substring(input, 0,operatorIndex); 
		String afterOperatorContent = StringUtils.substring(input, operatorIndex+operatorContent.length(),input.length());
		
		
	}
	
}
