package com.zombeemedia.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.zombeemedia.entity.UserStats;

public interface UserStatsRepository extends PagingAndSortingRepository<UserStats, String>, MongoRepository<UserStats, String> {

	
}
