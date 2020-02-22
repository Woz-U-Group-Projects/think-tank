package com.mongodb.bootifulmongo.dal;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mongodb.bootifulmongo.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
