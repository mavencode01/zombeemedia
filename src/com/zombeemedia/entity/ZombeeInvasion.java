package com.zombeemedia.entity;

import org.joda.time.DateTime;

public class ZombeeInvasion extends BaseEntity {
	private String description;
	private String merchantId;
	private DateTime invasionDate;
	private int invasionDays;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public DateTime getInvasionDate() {
		return invasionDate;
	}

	public void setInvasionDate(DateTime invasionDate) {
		this.invasionDate = invasionDate;
	}

	public int getInvasionDays() {
		return invasionDays;
	}

	public void setInvasionDays(int invasionDays) {
		this.invasionDays = invasionDays;
	}

}
