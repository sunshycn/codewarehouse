package org.huamuzhen.interpreter.operator;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;


/**
 * super class of the Interpreters who interpret Single Script Query statement
 * according to the Operator. SingleScriptOueryStatement have and only have
 * one Operator, one Attribute, one Value
 *  
 * @param input,  Single Query Script only contains 1 operator, interpreter should 
 * have the ability handle to the '(' , ')' which may prefix or suffix the Query String. prefix or 
 * suffix '(' , ')' will not impact the Query, but it will be kept in the output
 * String  
 * 
 * @return a interpreted statement for Solr Query   
 * */
public abstract class OperatorInterpreter implements Interpreter{
	
	protected List<String> representationList = new ArrayList<String>(0);
	
	protected List<String> interpretedWordList = new ArrayList<String>(0);
	
	protected String operatorContent;
	
	protected String beforeOperatorContent;
	
	protected String afterOperatorContent;
	
	//leftParenthesis should only exist in beforeOperatorContent
	protected int leftParenthesisCount;
	
	//rightParenthesis should only exist in afterOperatorContent
	protected int rightParenthesisCount;
	
	@Override
	public String interpret(String singleScriptQueryStatement){
		
		splitSingleScriptQueryStatement(singleScriptQueryStatement);
		
		//add prefix '('
		for(int i=0;i<leftParenthesisCount;i++){
			interpretedWordList.add("(");
		}
		fillInterpretedWordListInSequence(singleScriptQueryStatement);
		//add suffix ')'
		for(int i=0;i<leftParenthesisCount;i++){
			interpretedWordList.add(")");
		}
		StringBuilder sb  = new StringBuilder();
		for(CharSequence word: interpretedWordList){
			sb.append(word);
		}
		return sb.toString();
	}

	 private void splitSingleScriptQueryStatement(String singleScriptQueryStatement) {
		 int operatorIndex = -1;
			for(String representation:representationList){
				operatorIndex = StringUtils.indexOfIgnoreCase(singleScriptQueryStatement, representation);
				if(operatorIndex != -1){
					operatorContent=representation;
					break;
				}
			}
			if(operatorIndex == -1){
				throw new RuntimeException("this sub-script should not be given to this interpreter");
			}
			beforeOperatorContent = StringUtils.substring(singleScriptQueryStatement, 0,operatorIndex); 
			afterOperatorContent = StringUtils.substring(singleScriptQueryStatement, operatorIndex+operatorContent.length(),singleScriptQueryStatement.length());
		
	}

	protected abstract void fillInterpretedWordListInSequence(String singleScriptQueryStatement);
	 

}
