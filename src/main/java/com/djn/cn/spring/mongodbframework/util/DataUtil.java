package com.djn.cn.spring.mongodbframework.util;

import java.math.BigDecimal;

/**
 * 
 * @ClassName DataUtil
 * @Description  数据处理工具类
 * @author NieDongjia
 * @date 2017年6月9日 上午10:55:47
 *
 */
public class DataUtil {
	/**
	 * 格式化double数据
	 * @Title  doubleFormat  
	 * @return double   
	 *
	 */
	public static double  doubleFormat(int lenght,double data){
		BigDecimal b = new BigDecimal(data);
		return b.setScale(lenght, BigDecimal.ROUND_HALF_UP).doubleValue();
	}
}
