package com.djn.cn.spring.mongodbframework.base.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;

import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.UnknownSessionException;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.djn.cn.spring.mongodbframework.base.entity.JsonResult;
import com.djn.cn.spring.mongodbframework.util.EncryptUtil;

/**
 * 
 * @ClassName IndexController
 * @Description 系统跳转
 * @author BigJia-Perfect
 * @date 2017年5月5日 上午1:02:45
 *
 */
@Controller
public class IndexController {
	@RequestMapping("/login")
	public String toLogin() {
		return "login";
	}
	@RequestMapping("/main")
	public String toMain() {
		return "layout/main";
	}
	@RequestMapping(value = "/login_judge")
	@ResponseBody
	public Object  loginJudge(String loginName, String password, HttpServletRequest request) {
		JsonResult jsonObject = new JsonResult();
		Subject subject = SecurityUtils.getSubject();
		System.out.println(EncryptUtil.encryptToMD5(password));
		UsernamePasswordToken token = new UsernamePasswordToken(loginName, password);
		try {
			subject.login(token);// 会跳到我们自定义的realm中
		} catch (UnknownAccountException uae) {
			jsonObject.setResults("未知账户");
		    return jsonObject;
		} catch (IncorrectCredentialsException ice) {
			jsonObject.setResults("密码不正确");
			return jsonObject;
		} catch (LockedAccountException lae) {
			jsonObject.setResults("账户已锁定");
			return jsonObject;
		} catch (UnknownSessionException ue) {  
	    }  
		// 验证是否登录成功
		if (subject.isAuthenticated()) {
			jsonObject.setResults("success");
		} else {
			token.clear();
			jsonObject.setResults("帐号密码不正确");
		}
		return jsonObject;
	}
}
