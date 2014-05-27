package com.zombeemedia.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.zombeemedia.entity.Content;

public interface ContentRepository extends PagingAndSortingRepository<Content, String>, MongoRepository<Content, String> {

}
