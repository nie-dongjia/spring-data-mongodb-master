package com.djn.cn.spring.mongodbframework.base.controller;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.djn.cn.spring.mongodbframework.base.service.IUserInfoService;
/**
 * 
 * @ClassName IndexController
 * @Description MVC 测试 
 * @author BigJia-Perfect
 * @date 2017年5月5日 上午1:02:45
 *
 */
@Controller
public class IndexController {
	@Resource
	private IUserInfoService iUserInfoService;
	@RequestMapping("index")
	public String toLogin(){
		System.out.println(iUserInfoService.findAll());
		return "index";
	}
	@RequestMapping("json")
	@ResponseBody
	public Object toTestJson(){
		return iUserInfoService.findAll();
	}
}
