package com.djn.cn.spring.mongodbframework.util;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

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
		Date date = sdf.parse(month);
		return date;
	}

	/**
	 * 获取时间月份天数
	 * 
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
	 * 
	 * @Title getCurrentMonthDay
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
	 * 
	 * @Title isThisWeek
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
	 * 
	 * @Title isToday
	 * @return boolean
	 *
	 */
	public static boolean isToday(long time) {
		return isThisTime(time, "yyyy-MM-dd");
	}

	/**
	 * 判断选择的日期是否是本月
	 * 
	 * @Title isThisMonth
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
	 * 
	 * @Title getDaysOfMonths
	 * @return int
	 *
	 */
	public static int getDaysOfThisMonth(long time) {
		if (isThisMonth(time)) {
			// 本月
			return Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
		} else {
			// 历史月
			return getDaysOfMonth(new Date(time));
		}
	}

	/**
	 * 获取月份DateList 包括当月
	 * 
	 * @Title dayReport
	 * @return List<Date>
	 *
	 */
	public static List<Date> dayReport(Date month) {
		List<Date> dates = new ArrayList<Date>();
		Calendar cal = Calendar.getInstance();
		cal.setTime(month);// month 为指定月份任意日期
		int dayNumOfMonth = getDaysOfThisMonth(month.getTime());
		cal.set(Calendar.DAY_OF_MONTH, 1);// 从一号开始
		for (int i = 0; i < dayNumOfMonth; i++, cal.add(Calendar.DATE, 1)) {
			Date d = cal.getTime();
			// SimpleDateFormat simpleDateFormat = new
			// SimpleDateFormat("yyyy-MM-dd");
//			System.out.println(d);
			// String df = simpleDateFormat.format(d);
			dates.add(d);
		}
		return dates;
	}
	/**
	 * 获取时间Date  "2017-08-15"  -> "2017-08-15 00:00:00" 时间格式 
	 * @Title  getShortDate  
	 * @return Date   
	 * @throws ParseException 
	 *
	 */
	public static Date  getShortDate(String dateStr) throws ParseException{
		DateFormat fmt =new SimpleDateFormat("yyyy-MM-dd");
		return  fmt.parse(dateStr);
	}
	
	public static void main(String[] args) throws ParseException {
		// System.out.println(getDateByYearAndMonth("2017-05"));
		// System.out.println(getDaysOfMonth(getDateByYearAndMonth("2017-03")));
		// System.out.println(getDateByYearAndMonth("2017-03").getTime());
		// System.out.println(isThisMonth(getDateByYearAndMonth("2017-04").getTime()));
		// System.out.println(isThisMonth(getDateByYearAndMonth("2017-4").getTime()));
		// System.out.println(getDaysOfThisMonth(getDateByYearAndMonth("2017-4").getTime()));
//		dayReport(getDateByYearAndMonth("2017-3"));
//		System.out.println(dayReport(getDateByYearAndMonth("2017-5")));
//		Date d = new Date();
//		System.out.println(d);
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
//		String fSerachMonth = sdf.format(d);
//		System.out.println(fSerachMonth);
//		int i = 1;   
//		int j = 31;  
//		System.out.println(1/31);
//		Date date = new  Date();
//		System.out.println(date.getHours());
//		System.out.println(date.getMinutes());
//		System.out.println(date.getHours()*60+date.getMinutes()+"min");
//		String str = "9:00";
//		System.out.println(str.substring(0, 1));
//		System.out.println(str.substring(2, 4));
//		List<Date> listDate = new ArrayList<>();
//		listDate = DateUtil.dayReport(new Date());
//		System.out.println(listDate.size());
//		System.out.println(getCurrentMonthDay());
//      "2017-05-18"  到 Date 2017-05-18 00：00：00   
//      new SimpleDateFormat("yyyy-MM-dd").format(new Date());
//		System.out.println(new Date());
//		System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
//      获取当前时间  

//		DateFormat fmt =new SimpleDateFormat("yyyy-MM-dd");
//		Date date = fmt.parse();
		System.out.println(getShortDate("2017-05-18"));
	}

}
