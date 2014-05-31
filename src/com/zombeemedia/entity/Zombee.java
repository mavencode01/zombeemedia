package com.zombeemedia.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import com.zombeemedia.entities.conditions.Condition;

@Document(collection = "Zombee")
public class Zombee extends BaseEntity {

	private String beaconId;
	private int maxZombeedCountAllowed;
	private String majorIdentifer;
	private String minorIdentifer;
	private ZombeeType type;
	private Condition condition;

	public Zombee() {
		setMaxZombeedCountAllowed(1);
	}

	public String getBeaconId() {
		return beaconId;
	}

	public void setBeaconId(String beaconId) {
		this.beaconId = beaconId;
	}

	public int getMaxZombeedCountAllowed() {
		return maxZombeedCountAllowed;
	}

	public void setMaxZombeedCountAllowed(int maxZombeedCountAllowed) {
		this.maxZombeedCountAllowed = maxZombeedCountAllowed;
	}

	public String getMajorIdentifer() {
		return majorIdentifer;
	}

	public void setMajorIdentifer(String majorIdentifer) {
		this.majorIdentifer = majorIdentifer;
	}

	public String getMinorIdentifer() {
		return minorIdentifer;
	}

	public void setMinorIdentifer(String minorIdentifer) {
		this.minorIdentifer = minorIdentifer;
	}

	public ZombeeType getType() {
		return type;
	}

	public void setType(ZombeeType type) {
		this.type = type;
	}

	public Condition getCondition() {
		return condition;
	}

	public void setCondition(Condition condition) {
		this.condition = condition;
	}

}
