package com.cg.exception;

public class NutritionistAlreadyDeletedException extends Exception {
	private static final long serialVersionUID = 1L;
	 
    //default constructor
    public NutritionistAlreadyDeletedException() {
        super();
        // TODO Auto-generated constructor stub
    }
 
    //parameterized constructor
    public NutritionistAlreadyDeletedException(String message) {
         super(message);
        // TODO Auto-generated constructor stub
    }
}
