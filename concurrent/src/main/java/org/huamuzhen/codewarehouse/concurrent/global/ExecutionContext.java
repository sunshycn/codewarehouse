package org.huamuzhen.codewarehouse.concurrent.global;

public class ExecutionContext {
	
	public static final ThreadLocal<ExecutionContext> tl = new ThreadLocal<ExecutionContext>();
	
	String context="NoContext";
	
	private ExecutionContext(String context){
		this.context = context;
	}
	
	public static ExecutionContext getCurrentContext(){
		ExecutionContext context = tl.get();
		return context;
	}
	
	public static void setCurrentContext(String context){
		
	   tl.set(new ExecutionContext(context));
	}
	
	public void printContext(){
System.out.println("This is the current ExecutionContext: " + context);
	}
	
/*	private void setContext(String context){
		this.context = context;
	}
*/
}
