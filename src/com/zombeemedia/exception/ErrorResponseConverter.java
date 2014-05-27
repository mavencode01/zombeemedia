package com.zombeemedia.exception;

public class ErrorResponseConverter {

	private String message;
	private long code;

	public ErrorResponseConverter() {
	}

	public ErrorResponseConverter(String message, long code) {
		this.message = message;
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public long getCode() {
		return code;
	}

	public void setCode(long code) {
		this.code = code;
	}

}
