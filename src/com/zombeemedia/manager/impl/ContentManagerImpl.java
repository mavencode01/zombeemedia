package com.zombeemedia.manager.impl;

import org.springframework.stereotype.Component;

import com.zombeemedia.entity.AppResponse;
import com.zombeemedia.entity.ConditionType;
import com.zombeemedia.entity.Content;
import com.zombeemedia.manager.ContentManager;

@Component("contentManager")
public class ContentManagerImpl extends ManagerImpl implements ContentManager {

	@Override
	public AppResponse addContent(Content content) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AppResponse removeContent(String contentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AppResponse getZombieContent(String zombeeId, ConditionType type) {
		// TODO Auto-generated method stub
		return null;
	}

}
