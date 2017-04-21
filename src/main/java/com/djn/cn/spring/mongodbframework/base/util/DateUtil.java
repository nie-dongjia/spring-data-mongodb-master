package com.djn.cn.spring.mongodbframework.base.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 
 * @ClassName DateUtil
 * @Description 时间工具类
 * @author NieDongjia
 * @date 2017年4月20日 上午11:02:32
 *
 */
public class DateUtil {
	/**
	 * "2017-05" -> Date 转换成日期 
	 * 
	 * @Title getDateByYearAndMonth
	 * @return Date
	 * @throws ParseException 
	 *
	 */
	public static Date getDateByYearAndMonth(String month) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
		Date date  = sdf.parse(month);
		return date;
	}

	/**
	 * 获取时间月份天数
	 * @Title getDaysOfMonth
	 * @return int
	 *
	 */
	public static int getDaysOfMonth(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
	}
	

	/**
	 * 获取当月的 天数
	 * @Title  getCurrentMonthDay  
	 * @return int   
	 *
	 */
	public static int getCurrentMonthDay() {
		
		Calendar a = Calendar.getInstance();
		a.set(Calendar.DATE, 1);
		a.roll(Calendar.DATE, -1);
		int maxDate = a.get(Calendar.DATE);
		return maxDate;
	}
	
	/**
	 * 判断选择的日期是否是本周
	 * @Title  isThisWeek  
	 * @return boolean   
	 *
	 */
	public static boolean isThisWeek(long time) {
		Calendar calendar = Calendar.getInstance();
		int currentWeek = calendar.get(Calendar.WEEK_OF_YEAR);
		calendar.setTime(new Date(time));
		int paramWeek = calendar.get(Calendar.WEEK_OF_YEAR);
		if (paramWeek == currentWeek) {
			return true;
		}
		return false;
	}
	
	
	/**
	 * 判断选择的日期是否是今天
	 * @Title  isToday  
	 * @return boolean   
	 *
	 */
	public static boolean isToday(long time) {
		return isThisTime(time, "yyyy-MM-dd");
	}

	/**
	 * 判断选择的日期是否是本月
	 * @Title  isThisMonth  
	 * @return boolean   
	 *
	 */
	public static boolean isThisMonth(long time) {
		return isThisTime(time, "yyyy-MM");
	}

	private static boolean isThisTime(long time, String pattern) {
		Date date = new Date(time);
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String param = sdf.format(date);// 参数时间
		String now = sdf.format(new Date());// 当前时间
		if (param.equals(now)) {
			return true;
		}
		return false;
	}
	/**
	 * 查询当月[到今天时间]与非当月天数 
	 * @Title  getDaysOfMonths  
	 * @return int   
	 *
	 */
	public static int getDaysOfMonths(long time){
		if(isThisMonth(time)){
			// 本月
			return Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
		} else {
			// 历史月 
			return getDaysOfMonth(new Date(time));
		}
	}
	public static void main(String[] args) throws ParseException {
//		System.out.println(getDateByYearAndMonth("2017-05"));
		
		System.out.println(getDaysOfMonth(getDateByYearAndMonth("2017-03")));
		System.out.println(getDateByYearAndMonth("2017-03").getTime());
		System.out.println(isThisMonth(getDateByYearAndMonth("2017-04").getTime()));
		System.out.println(isThisMonth(getDateByYearAndMonth("2017-4").getTime()));
		System.out.println(getDaysOfMonths(getDateByYearAndMonth("2017-4").getTime()));
		
		
	}

}
