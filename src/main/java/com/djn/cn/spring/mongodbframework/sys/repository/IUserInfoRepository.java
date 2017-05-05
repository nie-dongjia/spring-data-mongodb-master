package com.djn.cn.spring.mongodbframework.sys.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.djn.cn.spring.mongodbframework.sys.entity.UserInfo;

public interface IUserInfoRepository extends MongoRepository<UserInfo, String>{ 
	UserInfo findOneByUserName(String userName);
}
