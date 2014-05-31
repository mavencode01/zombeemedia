package com.zombeemedia.exception;

public class UserStatsException extends Exception {

	private static final long serialVersionUID = 1L;
	private int code;

	public UserStatsException() {
		super();
	}

	public UserStatsException(String message, int code) {
		super(message);
		this.code = code;
	}

	public UserStatsException(Throwable t) {
		super(t);
	}

	public int getCode() {
		return code;
	}
}
