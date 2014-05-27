package com.zombeemedia.entity;

public class Zombee extends BaseEntity {
	private String contentId;
	private String beaconId;
	private String majorIdentifer;
	private String minorIdentifer;

	public String getContentId() {
		return contentId;
	}

	public void setContentId(String contentId) {
		this.contentId = contentId;
	}

	public String getBeaconId() {
		return beaconId;
	}

	public void setBeaconId(String beaconId) {
		this.beaconId = beaconId;
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

}
