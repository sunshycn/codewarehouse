package org.huamuzhen.interpreter.exception;

public class InterpretException extends RuntimeException {

	private static final long serialVersionUID = 5100470002293614727L;
	
	public InterpretException(){
		super();
	}
	
	public InterpretException(String errMsg){
		super(errMsg);
	}

}
