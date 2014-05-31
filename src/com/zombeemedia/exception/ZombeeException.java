package com.zombeemedia.exception;

public class ZombeeException extends Exception {

	private static final long serialVersionUID = 1L;
	private int code;

	public ZombeeException() {
		super();
	}

	public ZombeeException(String message, int code) {
		super(message);
		this.code = code;
	}

	public ZombeeException(Throwable t) {
		super(t);
	}

	public int getCode() {
		return code;
	}
}
