package com.zombeemedia.exception;

public class UserException extends Exception {

	private static final long serialVersionUID = 1L;
	private int code;

	public UserException() {
		super();
	}

	public UserException(String message, int code) {
		super(message);
		this.code = code;
	}

	public UserException(Throwable t) {
		super(t);
	}

	public int getCode() {
		return code;
	}
}
