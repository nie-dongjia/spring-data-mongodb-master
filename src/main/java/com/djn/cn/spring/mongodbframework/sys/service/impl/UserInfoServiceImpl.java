package com.djn.cn.spring.mongodbframework.sys.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.djn.cn.spring.mongodbframework.sys.entity.UserInfo;
import com.djn.cn.spring.mongodbframework.sys.repository.IUserInfoRepository;
import com.djn.cn.spring.mongodbframework.sys.service.IUserInfoService;
@Service
public class UserInfoServiceImpl  implements IUserInfoService {
	@Autowired
	private IUserInfoRepository iUserInfoRepository;
	@Override
	public List<UserInfo> findAll() {
		return iUserInfoRepository.findAll();
	}
	@Override
	public UserInfo findById(String id) {
		return iUserInfoRepository.findOne(id);
	}
	@Override
	public UserInfo findByUserName(String userName) {
		return iUserInfoRepository.findOneByUserName(userName);
	}
}
