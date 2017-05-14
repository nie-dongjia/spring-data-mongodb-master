package com.djn.cn.spring.mongodbframework.sys.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.djn.cn.spring.mongodbframework.sys.entity.RoleInfo;
public interface IRoleInfoRepository extends MongoRepository<RoleInfo, String>{ 
}
