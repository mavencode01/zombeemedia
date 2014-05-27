package com.zombeemedia.entity;

public class AppResponse {
	private int status;

	public AppResponse(int status) {
		this.status = status;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}
