package com.zombeemedia.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Content")
public class Content extends BaseEntity {
	private String contentURL;
	private String description;
	private String counter;
	private String email;
	private String website;
	private String telephone;
	private boolean active;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCounter() {
		return counter;
	}

	public void setCounter(String counter) {
		this.counter = counter;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
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
