package com.djn.cn.spring.mongodbframework.base.controller;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.MessageSource;

import com.djn.cn.spring.mongodbframework.sys.entity.UserInfo;

/**
 * 
 * @ClassName BaseController
 * @Description 公共Controller
 * @author BigJia-Perfect
 * @date 2017年5月6日 下午9:47:34
 *
 */
public abstract class BaseController {
    protected Logger logger = LoggerFactory.getLogger(getClass());
	@Resource
	protected HttpServletRequest request;
	@Resource
	protected ServletContext application;
	@Resource
	protected HttpServletResponse response;
	@Resource
	private MessageSource messageSource;
	@Resource
	protected HttpSession session;

	/**
	 * 获取当前用户
	 * 
	 * @Title getCurrentUser
	 * @return UserInfo
	 *
	 */
	protected UserInfo getCurrentUserInfo() {
		return (UserInfo) request.getSession().getAttribute("currentUserInfo");
	}
	
}
