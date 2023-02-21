package com.hu.hono.server.controller;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author hlh
 * @version v1.0
 * @title UserRepository
 * @projectName hono
 * @description
 * @date 2023/2/21 10:32
 */
@Repository
public interface UserRepository extends MongoRepository<User, Long> {
    
}
