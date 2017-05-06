package com.djn.cn.spring.mongodbframework.util;

import java.io.IOException;
import java.util.Properties;

/**
 * 
 * @ClassName ConfigUtil
 * @Description  读取配置文件工具类
 * @author 聂冬佳
 * @date 2017年2月28日 上午11:15:16
 *
 */
public class ConfigUtil {
	private static Properties prop = new Properties();
	static{
		try {
			prop.load(ConfigUtil.class.getClassLoader().getResourceAsStream("config.properties"));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	/**
	 * 获取指定的值 
	 * @Title  getValue  
	 * @return String   
	 *
	 */
	public static String getValue(String key){
		return prop.getProperty(key);
	}	
}
