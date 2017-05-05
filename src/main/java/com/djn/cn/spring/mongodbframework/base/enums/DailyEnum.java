package com.djn.cn.spring.mongodbframework.base.enums;

/**
 * 
 * @ClassName DayEnum
 * @Description 星期Enum
 * @author NieDongjia
 * @date 2017年4月26日 上午9:44:22
 *
 */
public enum DailyEnum {
	MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6) {
        @Override
        public boolean isRest() {
            return true;
        }
    }, SUNDAY(7) {
        @Override
        public boolean isRest() {
            return true;
        }
    };
	private int value;

	private DailyEnum(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public boolean isRest() {
		return false;
	}
}
