package com.zombeemedia.manager.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.common.base.Strings;
import com.zombeemedia.entity.AppResponse;
import com.zombeemedia.entity.Content;
import com.zombeemedia.entity.UserRequest;
import com.zombeemedia.exception.ContentException;
import com.zombeemedia.exception.ContentRequestException;
import com.zombeemedia.manager.ContentManager;
import com.zombeemedia.repository.ContentRepository;
import com.zombeemedia.repository.MerchantRepository;
import com.zombeemedia.repository.ZombeeRepository;
import com.zombeemedia.utils.Constants;

@Component("contentManager")
public class ContentManagerImpl extends ManagerImpl implements ContentManager {

	@Autowired
	ContentRepository contentRepository;

	@Autowired
	ZombeeRepository zombeeRepository;

	@Autowired
	MerchantRepository merchantRepository;

	@Override
	public AppResponse addContent(Content content) throws ContentException {
		if (content == null || Strings.isNullOrEmpty(content.getMerchantId()) || Strings.isNullOrEmpty(content.getZombeeId()) || Strings.isNullOrEmpty(content.getContentURL()))
			throw new ContentException("Failed to create content - required fields missing", Constants.INVALID_CONTENT);

		if (!zombeeRepository.exists(content.getZombeeId())) {
			throw new ContentException("Faild to create content - zombie not found", Constants.CONTENTS_INVALID_ZOMBIE);
		}

		if (!merchantRepository.exists(content.getMerchantId())) {
			throw new ContentException("Faild to create content - merchant not found", Constants.CONTENTS_INVALID_MERCHANT);
		}

		contentRepository.save(content);
		return new AppResponse(Constants.SUCCESS);
	}

	@Override
	public AppResponse removeContent(String contentId) throws ContentException {
		Content content = contentRepository.findOne(contentId);

		if (content == null) {
			throw new ContentException("Content not found", Constants.INVALID_CONTENT);
		}

		content.setMarkDelete(true);
		contentRepository.save(content);

		return new AppResponse(Constants.SUCCESS);
	}

	@Override
	public Content getZombieActiveContent(UserRequest userRequest) throws ContentRequestException {
		if (userRequest == null || Strings.isNullOrEmpty(userRequest.getZombieId())) {
			throw new ContentRequestException("Invalid content request", Constants.INVALID_REQUEST);
		}
		
		//TODO: save the request, zombee, merchants into stats
		//TODO: check condition of zombee
		return null;
	}

	@Override
	public List<Content> getZombieContents(String zombeeId) throws ContentException {
		if (!zombeeRepository.exists(zombeeId)) {
			throw new ContentException("Faild to fetch content - zombie not found", Constants.CONTENTS_INVALID_ZOMBIE);
		}
		return contentRepository.findContentByZombeeId(zombeeId);
	}

}
