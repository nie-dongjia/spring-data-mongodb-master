package com.djn.cn.spring.mongodbframework.bootstrap.controller;




import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 
 * @ClassName IndexController
 * @Description  BootStrapV4
 * @author BigJia-Perfect
 * @date 2018年1月23日 下午11:26:33
 *
 */
@Controller
@RequestMapping("/bootstrap/v4")
public class BootStrapV4Controller {
	@RequestMapping("/demo")
	public String toDemo() {
		return "bootstrap/demo";
	}

}
