package com.zombeemedia.manager;

import java.util.List;

import com.zombeemedia.entity.AppResponse;
import com.zombeemedia.entity.Content;
import com.zombeemedia.entity.UserRequest;
import com.zombeemedia.exception.ContentException;

public interface ContentManager {

	public AppResponse addContent(Content content) throws ContentException;

	public AppResponse removeContent(String contentId) throws ContentException;

	public Content getZombieActiveContent(UserRequest userRequest) throws ContentException;

	public List<Content> getZombieContents(String zombeeId) throws ContentException;
}
