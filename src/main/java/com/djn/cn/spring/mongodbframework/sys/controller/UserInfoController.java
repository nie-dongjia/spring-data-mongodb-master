package com.djn.cn.spring.mongodbframework.sys.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.djn.cn.spring.mongodbframework.base.controller.BaseController;
import com.djn.cn.spring.mongodbframework.sys.service.IUserInfoService;

@Controller
@RequestMapping(value = "/web/user_info")
public class UserInfoController extends BaseController{
	@Resource
	private IUserInfoService iUserInfoService;
	
	@RequestMapping("findAll")
	@ResponseBody
	public Object findAll(){
		Map<String,Object> result = new HashMap<>();
		result.put("result", iUserInfoService.findAll());
		return result;
	}
	
	@RequestMapping("findById")
	@ResponseBody
	public Object findById(String id){
		Map<String,Object> result = new HashMap<>();
		result.put("result", iUserInfoService.findById(id));
		return result;
	}
	
	
	
}
