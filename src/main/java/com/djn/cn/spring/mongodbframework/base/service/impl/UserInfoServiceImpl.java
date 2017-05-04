package com.djn.cn.spring.mongodbframework.base.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.djn.cn.spring.mongodbframework.base.entity.UserInfo;
import com.djn.cn.spring.mongodbframework.base.repository.IUserInfoRepository;
import com.djn.cn.spring.mongodbframework.base.service.IUserInfoService;
@Service
public class UserInfoServiceImpl implements IUserInfoService {
	@Autowired
	private IUserInfoRepository iUserInfoRepository;
	@Override
	public List<UserInfo> findAll() {
		return iUserInfoRepository.findAll();
	}
}
