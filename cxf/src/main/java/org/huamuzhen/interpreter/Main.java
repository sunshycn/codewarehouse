package org.huamuzhen.interpreter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.huamuzhen.interpreter.operator.InterpreterFacade;

public class Main {
	
	public static final String AND = " AND ";
	
	public static final String OR = " OR ";
	
	public static InterpreterFacade interpreterFacade = new InterpreterFacade();
		
	public static void main(String args[]){
		
		StringBuilder solrQuery = new StringBuilder();
		String script = "(product_name CONTAINS  'gui tars' OR item_status IN ('Retired','UnRetired','Published')) AND modified_by EQUALS ‘sanveka'";
System.out.println(script);
		//List<String> singleQueryStatementList = new ArrayList<String>();
		List<String> subScriptList = new ArrayList<String>();
		splitScriptByCondition(script.trim(),subScriptList);
System.out.println(subScriptList.size());
		for(String subScript: subScriptList){
			System.out.println(subScript);
			solrQuery.append(interpreterFacade.interpret(subScript));
		}
System.out.println(solrQuery.toString());
		
	/*	int index = 0;
		int start = 0;
		boolean singleQuoteNeed = false;
		List<CharSequence> words = new ArrayList<CharSequence>();
		
		for (char c : script.toCharArray()) {
			if (c == ' ') {
				if (!singleQuoteNeed) {
					String subStr = script.substring(start, index);
					if (!subStr.equals(" ")) {
						words.add(subStr);
					}
					words.add(String.valueOf(c));
					start = index;
				}
			} else if (c == '(' || c == ')') {
				words.add(String.valueOf(c));
				start = index;
			} else if (c == '\'') {
				singleQuoteNeed = !singleQuoteNeed;
			}else if(c == ','){
				
			}

			index++;
			if (index == script.length()) {
				words.add(script.substring(start, index - 1));
			}
		}

		for (CharSequence word : words) {
			System.out.println(word);
		}*/
		
	}
	
	private static void splitScriptByCondition(final String script,final List<String>  subScriptList) {
		
		int indexOfAnd = StringUtils.indexOfIgnoreCase(script,AND);
		int indexOfOr = StringUtils.indexOfIgnoreCase(script, OR);
		int index=-1;
		String condition="";
		if(indexOfAnd == -1 && indexOfOr == -1){
			// no matching Condition found.
			subScriptList.add(script);
		
		}else if (indexOfAnd == -1){
			index = indexOfOr;
			condition = OR;
		}else if (indexOfOr == -1){
			index = indexOfAnd;
			condition = AND;
		}else{
		    index = indexOfAnd<indexOfOr?indexOfAnd:indexOfOr;
			condition = indexOfAnd<indexOfOr?AND:OR;
			
		}
		String leftScript = StringUtils.substring(script, 0, index);
		subScriptList.add(leftScript);
		subScriptList.add(condition);
		String rightScript = StringUtils.substring(script, index+condition.length(), script.length());
		splitScriptByCondition(rightScript,subScriptList);
		
	}

}
