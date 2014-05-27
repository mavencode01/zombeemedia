package com.zombeemedia.entity;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.joda.time.DateTime;
import org.springframework.data.annotation.Id;

import com.zombeemedia.utils.JsonDateSerializer;

@JsonAutoDetect
public class BaseEntity {

	@Id
	protected String id;
	@JsonSerialize(using=JsonDateSerializer.class)
	protected DateTime creationTime;
	@JsonSerialize(using=JsonDateSerializer.class)
	protected DateTime lastUpdate;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public DateTime getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(DateTime creationTime) {
		this.creationTime = creationTime;
	}

	public DateTime getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(DateTime lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

}
