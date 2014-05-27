package com.zombeemedia.manager.impl;

import org.springframework.stereotype.Component;

import com.zombeemedia.entity.AppResponse;
import com.zombeemedia.entity.UserStats;
import com.zombeemedia.manager.StatsManager;

@Component("statsManager")
public class StatsManagerImpl extends ManagerImpl implements StatsManager {

	@Override
	public AppResponse addEngagementStats(UserStats stats) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AppResponse addRedemmedStats(UserStats stats) {
		// TODO Auto-generated method stub
		return null;
	}
}
