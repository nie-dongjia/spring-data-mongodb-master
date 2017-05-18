package com.djn.cn.spring.mongodbframework.base.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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
	@RequestMapping("/index")
	public String toIndex(){
		return "index";
	}
	@RequestMapping("/login")
	public String toLogin(){
		return "login";
	}
	@RequestMapping("/sys/main")
	public String toMain(){
		return "layout/main";
	}
}
