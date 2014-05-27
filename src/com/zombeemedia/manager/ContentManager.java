package com.zombeemedia.manager;

import com.zombeemedia.entity.AppResponse;
import com.zombeemedia.entity.ConditionType;
import com.zombeemedia.entity.Content;

public interface ContentManager {

	public AppResponse addContent(Content content);

	public AppResponse removeContent(String contentId);

	public AppResponse getZombieContent(String zombeeId, ConditionType type);
}
