package com.zombeemedia.manager.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import com.google.common.collect.Lists;
import com.zombeemedia.entity.AppResponse;
import com.zombeemedia.entity.AppResponseList;
import com.zombeemedia.entity.Content;
import com.zombeemedia.entity.Zombee;
import com.zombeemedia.exception.ZombeeException;
import com.zombeemedia.manager.ZombeeManager;
import com.zombeemedia.repository.ContentRepository;
import com.zombeemedia.repository.ZombeeRepository;
import com.zombeemedia.utils.Constants;

@Component("zombeeManager")
public class ZombeeManagerImpl extends ManagerImpl implements ZombeeManager {

	@Autowired
	ZombeeRepository zombeeRepository;

	@Autowired
	ContentRepository contentRepository;

	@Override
	public AppResponse addZombee(Zombee zombee) throws ZombeeException {
		if (zombee == null) {
			throw new ZombeeException("Failed to create zombeee - required fields missing", Constants.INVALID_ZOMBEE);
		}
		zombeeRepository.save(zombee);

		return new AppResponse(Constants.SUCCESS);
	}

	@Override
	public AppResponse updateZombee(Zombee zombee) throws ZombeeException {
		if (zombee == null) {
			throw new ZombeeException("Failed to update zombeee - required fields missing", Constants.INVALID_ZOMBEE);
		}

		if (zombeeRepository.exists(zombee.getId())) {
			zombeeRepository.save(zombee);
		} else {
			throw new ZombeeException("Failed to update zombeee - zombee not found", Constants.ZOMBEE_NOT_FOUND);
		}

		return new AppResponse(Constants.SUCCESS);
	}

	@Override
	public Zombee getZombee(String zombeeId) throws ZombeeException {
		Zombee zombee = zombeeRepository.findOne(zombeeId);
		if (zombee == null) {
			throw new ZombeeException("Zombee not found", Constants.ZOMBEE_NOT_FOUND);
		}
		return zombee;
	}

	@Override
	public AppResponse removeZombee(String zombeeId) throws ZombeeException {
		Zombee zombee = zombeeRepository.findOne(zombeeId);
		if (zombee == null) {
			throw new ZombeeException("Zombee not found", Constants.ZOMBEE_NOT_FOUND);
		}
		zombee.setMarkDelete(true);
		zombeeRepository.save(zombee);

		return new AppResponse(Constants.SUCCESS);
	}

	@Override
	public AppResponseList<List<Zombee>> listZombees(Pageable pageable) {
		Page<Zombee> zombees = zombeeRepository.findAll(pageable);

		AppResponseList<List<Zombee>> zombeeListResponse = new AppResponseList<List<Zombee>>(zombees.getContent(), Constants.SUCCESS, zombees.getNumber(), zombees.getTotalPages());

		return zombeeListResponse;
	}

	@Override
	public AppResponseList<List<Zombee>> listMerchantZombees(String merchantId) {
		List<Content> contents = contentRepository.findContentByMerchantId(merchantId);

		HashSet<String> zombeeIds = new HashSet<String>();
		for (Content content : contents) {
			zombeeIds.add(content.getZombeeId());
		}
		Iterable<Zombee> zombeesItr = zombeeRepository.findAll(new ArrayList<String>(zombeeIds));

		AppResponseList<List<Zombee>> zombeeListResponse = new AppResponseList<List<Zombee>>(Lists.newArrayList(zombeesItr), Constants.SUCCESS, 0, zombeeIds.size());

		return zombeeListResponse;
	}

}
