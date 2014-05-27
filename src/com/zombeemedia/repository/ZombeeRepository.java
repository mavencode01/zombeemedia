package com.zombeemedia.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.zombeemedia.entity.Zombee;

public interface ZombeeRepository extends PagingAndSortingRepository<Zombee, String>, MongoRepository<Zombee, String> {

}
