package com.djn.cn.spring.mongodbframework.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @ClassName UserInfoApi
 * @Description  UserInfoApi 
 * @author BigJia-Perfect
 * @date 2017年5月18日 下午11:46:22
 *
 */
@Controller
@RequestMapping("/rest/user_info")
public class UserInfoAPI {
	// 测试        
	@RequestMapping("/main")
	public String toMain(){
		return "layout/main";
	}
}
