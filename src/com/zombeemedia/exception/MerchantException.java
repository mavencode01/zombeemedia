package com.zombeemedia.exception;

public class MerchantException extends Exception {

	private static final long serialVersionUID = 1L;
	private int code;

	public MerchantException() {
		super();
	}

	public MerchantException(String message, int code) {
		super(message);
		this.code = code;
	}

	public MerchantException(Throwable t) {
		super(t);
	}

	public int getCode() {
		return code;
	}
}
