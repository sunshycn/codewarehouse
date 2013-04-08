package org.huamuzhen.interpreter.operator;

import java.util.ArrayList;
import java.util.List;

public abstract class OperatorInterpreter {
	
	protected List<String> representation = new ArrayList<String>(0);
	
	protected OperatorInterpreter(){
		
	}
	
	/**
	 * please override this method, if implement Sub-Operator
	 * 
	 * @param input Single Query Script only contains 1 operator, could handle
	 * the '(' , ')' which may prefix or suffix the Query String
	 * 
	 * @return a interpreted statement for Solr Query   
	 * */
	public abstract String interpret(String input);
	
}
