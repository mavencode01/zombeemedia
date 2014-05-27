package com.zombeemedia.entity;

import com.sun.mail.imap.Utility.Condition;

public class Content extends BaseEntity {
	private String contentURL;
	private boolean active;
	private Condition condition;
	private String merchantId;
	private String zombeeId;

	public String getContentURL() {
		return contentURL;
	}

	public void setContentURL(String contentURL) {
		this.contentURL = contentURL;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Condition getCondition() {
		return condition;
	}

	public void setCondition(Condition condition) {
		this.condition = condition;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getZombeeId() {
		return zombeeId;
	}

	public void setZombeeId(String zombeeId) {
		this.zombeeId = zombeeId;
	}

}
