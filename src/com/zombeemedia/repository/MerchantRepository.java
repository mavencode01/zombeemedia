package com.zombeemedia.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.zombeemedia.entity.Merchant;

public interface MerchantRepository extends PagingAndSortingRepository<Merchant, String>, MongoRepository<Merchant, String> {

}
