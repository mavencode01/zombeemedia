package com.zombeemedia.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.zombeemedia.entity.Content;

public interface ContentRepository extends PagingAndSortingRepository<Content, String>, MongoRepository<Content, String> {

	List<Content> findContentByZombeeId(String zombeeId);

	@Query(value = "{ 'merchantId' : ?0 }", fields = "{ 'zombeeId' : 1 }")
	List<Content> findContentByMerchantId(String merchantId);
}
