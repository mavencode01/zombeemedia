package com.zombeemedia.entity;

public class AppResponseList<T> extends AppResponse {
	private int index;
	private int total;
	private T data;

	public AppResponseList(T data, int status, int idx, int total) {
		super(status);
		this.data = data;
		this.index = idx;
		this.setTotal(total);
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

}
