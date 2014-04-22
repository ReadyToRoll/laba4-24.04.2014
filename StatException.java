package laba4;

public class StatException extends Exception{
	
	private String msg; 

	StatException(){ msg = null;} 

	StatException(String s){ msg = s;} 

	public String toString(){

	return "StatException (" + msg + ")"; 

	} 
}
	
