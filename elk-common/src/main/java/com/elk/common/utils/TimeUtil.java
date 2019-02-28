package com.elk.common.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 * 时间处理类
 * @author liao
 *
 */
public class TimeUtil {
	
	/**
	 * 生成时间并格式化
	 * @return
	 */
	public static String dateTimeFormatter() {
		// 使用新时间线程安全
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String format = ofPattern.format(now);
		
		return format;
	}
}
