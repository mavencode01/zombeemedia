package com.zombeemedia.entity;

public class UserStats extends BaseEntity {

	private Address location;
	private User user;
	private Content content;
	private Merchant merchant;
	private Zombee zombee;
	private String device;
	private boolean redemmed;

	public Address getLocation() {
		return location;
	}

	public void setLocation(Address location) {
		this.location = location;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Content getContent() {
		return content;
	}

	public void setContent(Content content) {
		this.content = content;
	}

	public Merchant getMerchant() {
		return merchant;
	}

	public void setMerchant(Merchant merchant) {
		this.merchant = merchant;
	}

	public Zombee getZombee() {
		return zombee;
	}

	public void setZombee(Zombee zombee) {
		this.zombee = zombee;
	}

	public String getDevice() {
		return device;
	}

	public void setDevice(String device) {
		this.device = device;
	}

	public boolean isRedemmed() {
		return redemmed;
	}

	public void setRedemmed(boolean redemmed) {
		this.redemmed = redemmed;
	}
}
