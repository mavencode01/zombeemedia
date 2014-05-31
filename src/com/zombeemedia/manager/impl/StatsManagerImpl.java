package com.zombeemedia.manager.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zombeemedia.entity.AppResponse;
import com.zombeemedia.entity.UserStats;
import com.zombeemedia.exception.UserStatsException;
import com.zombeemedia.manager.StatsManager;
import com.zombeemedia.repository.UserStatsRepository;
import com.zombeemedia.utils.Constants;

@Component("statsManager")
public class StatsManagerImpl extends ManagerImpl implements StatsManager {

	@Autowired
	UserStatsRepository userStatsRepository;

	@Override
	public AppResponse addEngagementStats(UserStats stats) throws UserStatsException {
		if (stats == null) {
			throw new UserStatsException("Failed to save stats - invalid stats", Constants.INVALID_STATS);
		}

		userStatsRepository.save(stats);
		// also send it to the Rabbit MQ

		return new AppResponse(Constants.SUCCESS);
	}
}
