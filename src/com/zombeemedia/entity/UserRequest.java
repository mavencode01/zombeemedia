package com.zombeemedia.entity;

public class UserRequest {

	private String device;
	private String zombieId;
	private Location location;

	public String getDevice() {
		return device;
	}

	public void setDevice(String device) {
		this.device = device;
	}

	public String getZombieId() {
		return zombieId;
	}

	public void setZombieId(String zombieId) {
		this.zombieId = zombieId;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

}
