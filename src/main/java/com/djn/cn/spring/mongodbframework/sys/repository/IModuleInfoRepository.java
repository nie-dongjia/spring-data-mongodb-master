package com.djn.cn.spring.mongodbframework.sys.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.djn.cn.spring.mongodbframework.sys.entity.ModuleInfo;
public interface IModuleInfoRepository extends MongoRepository<ModuleInfo, String>{ 
}
