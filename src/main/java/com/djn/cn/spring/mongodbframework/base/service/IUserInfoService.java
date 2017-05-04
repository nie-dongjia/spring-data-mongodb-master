package com.djn.cn.spring.mongodbframework.base.service;

import java.util.List;

import com.djn.cn.spring.mongodbframework.base.entity.UserInfo;

/**
 * 
 * @ClassName IUserInfoService
 * @Description  用户服务接口
 * @author BigJia-Perfect
 * @date 2017年5月5日 上午12:50:44
 *
 */
public interface IUserInfoService {
	List<UserInfo> findAll();
}
