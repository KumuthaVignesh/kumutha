package com.exception;

public class Ex {
	public static void main(String[] args) {
			 
		    try{  
		    	Exceptionthrow ed=new Exceptionthrow();
		    	ed.method();
		    }
		    catch(Exception e){System.out.println("exception handled");}     
		  
		    System.out.println("normal flow...");  
		  
		}


	}


