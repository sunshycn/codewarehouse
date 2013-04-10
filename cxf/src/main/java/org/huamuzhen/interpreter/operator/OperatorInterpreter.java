package org.huamuzhen.interpreter.operator;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.huamuzhen.interpreter.Interpreter;
import org.huamuzhen.interpreter.exception.InterpretException;
import org.huamuzhen.interpreter.model.SingleScriptQueryStatement;


/**
 * super class of the Interpreters who interpret Single Script Query statement
 * according to the Operator. SingleScriptOueryStatement have and only have
 * one Operator, one Attribute, one Value. Contains some general methods for most of
 * OperatorInterpreters, but need to be overrided for some special cases, such as,
 * Operator IN 
 *  
 * @param input,  Single Query Script only contains 1 operator, interpreter should 
 * have the ability handle to the '(' , ')' which may prefix or suffix the Query String. prefix or 
 * suffix '(' , ')' will not impact the Query, but it will be kept in the output
 * String  
 * 
 * @return a interpreted statement for Solr Query   
 * */
public abstract class OperatorInterpreter implements Interpreter<String,String>{
	
	protected List<String> representationList = new ArrayList<String>(0);
	
	protected List<String> interpretedWordList = new ArrayList<String>(0);
	
	//leftParenthesis should only exist in beforeOperatorContent
	protected int leftParenthesisCount;
	
	//rightParenthesis should only exist in afterOperatorContent
	protected int rightParenthesisCount;
	
	protected SingleScriptQueryStatement singleScriptQueryStatementObj;
	
	@Override
	public String interpret(String singleScriptQueryStatement){
		
		splitSingleScriptQueryStatement(singleScriptQueryStatement);
		validateSingleScriptQueryStatement();
		// add prefix '('
		for(int i=0;i<leftParenthesisCount;i++){
			interpretedWordList.add("(");
		}
		// add interpreted singleScriptQueryStatement
		fillInterpretedWordListInSequence();
		// add suffix ')'
		for(int i=0;i<rightParenthesisCount;i++){
			interpretedWordList.add(")");
		}
		StringBuilder sb  = new StringBuilder();
		for(CharSequence word: interpretedWordList){
			sb.append(word);
		}
		return sb.toString();
	}

	/***
	 * split the String singleScriptQueryStatement into three parts, and analysis them
	 * respectively. sub-class can override the logic, but not suggested.
	 * 
	 * */
	protected void splitSingleScriptQueryStatement(String singleScriptQueryStatement) {
		 int operatorIndex = -1;
			for(String representation:representationList){
				operatorIndex = StringUtils.indexOf(singleScriptQueryStatement, representation);
				if(operatorIndex != -1){
					singleScriptQueryStatementObj.setOperator(representation);
					break;
				}
			}
			if(operatorIndex == -1){
				throw new InterpretException("this sub-script should not be given to this interpreter");
			}
			String beforeOperatorContent = StringUtils.substring(singleScriptQueryStatement, 0,operatorIndex); 
			String afterOperatorContent = StringUtils.substring(singleScriptQueryStatement, operatorIndex+singleScriptQueryStatementObj.getOperator().length(),singleScriptQueryStatement.length());
			analysisForBeforeOperatorContent(beforeOperatorContent);
			analysisForAfterOperatorContent(afterOperatorContent);
		
	}
	
	/**
	 * Analysis the BeforeOperatorContent part. 
	 * sub-class can override the logic, but not suggested.
	 * */
	protected void analysisForBeforeOperatorContent(String beforeOperatorContent) {
		char[] tempCharArray = beforeOperatorContent.toCharArray();
		int arrayIndex = 0;
		do{		
			if(tempCharArray[arrayIndex] == '('){
				leftParenthesisCount++;
				arrayIndex++;
			}else{
				singleScriptQueryStatementObj.setAttribute(StringUtils.substring(beforeOperatorContent, arrayIndex, beforeOperatorContent.length()));
				break;
			}
		}while(arrayIndex<tempCharArray.length);
	}
	
	/**
	 * Analysis the AfterOperatorContent part. 
	 * sub-class can override the logic, but not suggested.
	 * */
	protected void analysisForAfterOperatorContent(String afterOperatorContent) {
		char[] tempCharArray = afterOperatorContent.toCharArray();
		int arrayIndex = tempCharArray.length - 1;
		do{		
			if(tempCharArray[arrayIndex] == ')'){
				rightParenthesisCount++;
				arrayIndex--;
			}else{
				singleScriptQueryStatementObj.setValue(StringUtils.substring(afterOperatorContent,0,arrayIndex));
				break;
			}
		}while(arrayIndex>0);
	}

	/**
	 *format validation, to check Attribute's value and Value's value is valid or not.
	 * **/
	protected void validateSingleScriptQueryStatement() {
				
	}
	
	/***
	 * sub-class should implement this method. Before this method, 
	 * a SingleScriptQueryStatement object singleScriptQueryStatementObj which contains
	 * Attribute,Operator,Value was prepared. In this method, sub-class need to analysis 
	 * the given singleScriptQueryStatementObj and interpret it and put the interpreted 
	 * content into interpretedWordList in correct sequence.
	 * 
	 * */
	protected abstract void fillInterpretedWordListInSequence();
	 

}
