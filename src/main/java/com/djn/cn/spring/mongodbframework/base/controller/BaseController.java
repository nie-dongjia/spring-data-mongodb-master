package com.djn.cn.spring.mongodbframework.base.controller;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import org.springframework.context.MessageSource;

import com.djn.cn.spring.mongodbframework.sys.entity.UserInfo;

public abstract class  BaseController {
	@Resource
	protected HttpServletRequest request;
	@Resource
	protected ServletContext application;
	@Resource
	protected HttpServletResponse response;
	@Resource  
	protected  HttpSession session;
	@Resource
	private MessageSource messageSource;
	/**
	 * 获取当前用户
	 * @Title  getCurrentUser  
	 * @return UserInfo   
	 *
	 */
	protected UserInfo getCurrentUserInfo(){
		return (UserInfo) session.getAttribute("currentUserInfo");
	}
}
