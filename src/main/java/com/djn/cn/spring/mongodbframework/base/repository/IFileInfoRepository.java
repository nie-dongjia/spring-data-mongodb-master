package com.djn.cn.spring.mongodbframework.base.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.djn.cn.spring.mongodbframework.base.entity.FileInfo;

public interface IFileInfoRepository extends MongoRepository<FileInfo, String>{ 
}
