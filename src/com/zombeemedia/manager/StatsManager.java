package com.zombeemedia.manager;

import com.zombeemedia.entity.AppResponse;
import com.zombeemedia.entity.UserStats;
import com.zombeemedia.exception.UserStatsException;

public interface StatsManager {

	public AppResponse addEngagementStats(UserStats stats) throws UserStatsException;
}
