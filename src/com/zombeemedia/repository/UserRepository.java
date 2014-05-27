package com.zombeemedia.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.zombeemedia.entity.User;

public interface UserRepository extends PagingAndSortingRepository<User, String>, MongoRepository<User, String> {

	User findByEmail(String email);

	User findByEmailAndPassword(String email, String password);
}
