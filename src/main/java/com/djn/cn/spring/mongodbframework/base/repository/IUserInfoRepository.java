package com.djn.cn.spring.mongodbframework.base.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.djn.cn.spring.mongodbframework.base.entity.UserInfo;

public interface IUserInfoRepository extends MongoRepository<UserInfo, String>{ 
	UserInfo findOneByUserName(String userName);
}
