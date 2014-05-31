package com.zombeemedia.exception;

public class ContentException extends Exception {

	protected static final long serialVersionUID = 1L;
	protected int code;

	public ContentException() {
		super();
	}

	public ContentException(String message, int code) {
		super(message);
		this.code = code;
	}

	public ContentException(Throwable t) {
		super(t);
	}

	public int getCode() {
		return code;
	}
}
