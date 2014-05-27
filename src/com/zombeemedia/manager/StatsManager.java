package com.zombeemedia.manager;

import com.zombeemedia.entity.AppResponse;
import com.zombeemedia.entity.UserStats;

public interface StatsManager {

	public AppResponse addEngagementStats(UserStats stats);

	public AppResponse addRedemmedStats(UserStats stats);
}
