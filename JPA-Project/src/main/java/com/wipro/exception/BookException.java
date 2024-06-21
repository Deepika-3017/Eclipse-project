package com.wipro.exception;

public class BookException extends Exception{
	
	public BookException() {
		super("BookException");
	}
	
	public BookException(String message) {
		super(message);
	}
	
	public BookException(String message, Throwable throwable) {
		super(message,throwable);
	}


}
