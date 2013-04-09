package org.huamuzhen.interpreter.operator;

import java.util.HashSet;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;

/**
 * facade class which is used to interpret sub script, sub script can not be 
 * complex query statement which contains two or more query contacted by Conditions(OR, AND)
 * 
 * */
public final class InterpreterFacade implements Interpreter{
	
	private final Set<OperatorInterpreter> interpreterSet = new HashSet<OperatorInterpreter>();
	
	public InterpreterFacade(){
		interpreterSet.add(BeginsWithInterpreter.INSTANCE);
		interpreterSet.add(ContainsInterpreter.INSTANCE);
		interpreterSet.add(EndsWithInterpreter.INSTANCE);
		interpreterSet.add(EqualsInterpreter.INSTANCE);
		interpreterSet.add(GreaterThanInterpreter.INSTANCE);
		interpreterSet.add(GreaterThanOrEqualToInterpreter.INSTANCE);
		interpreterSet.add(InInterpreter.INSTANCE);
		interpreterSet.add(LessThanInterpreter.INSTANCE);
		interpreterSet.add(LessThanOrEqualToInterpreter.INSTANCE);
		interpreterSet.add(NotContainsInterpreter.INSTANCE);
		interpreterSet.add(NotEqualsInterpreter.INSTANCE);
	}
	
	/**
	 * find the corresponding OperatorInterpreter according to the content of input
	 * single script query statement
	 * 
	 * @param String singleScriptQUeryStatement the main part of ScriptQueryStatement is 
	 * one ATTR, one Operator, one Value.
	 * 
	 * */
	private final Interpreter getRelevantOperatorInterpreter(String singleScriptQueryStatement){
		for(OperatorInterpreter interpreter : interpreterSet){
			for(String representation : interpreter.representationList){
				if(StringUtils.containsIgnoreCase(singleScriptQueryStatement, representation)){
					return interpreter;
				}
			}
		}
		return DoNothingInterpreter.INSTANCE;
	}

	/**
	 * a facade method to handle general input. can be modified if there is new requirements 
	 * 
	 * @param input
	 * */
	@Override
	public final String interpret(String input) {
		return getRelevantOperatorInterpreter(input).interpret(input);
	}

}
