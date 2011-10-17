package com.figoyu.easypay.common;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	public static String formatLongDate(Date date){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String strDate = sdf.format(date);		
		return strDate;
	}
	public static String formatShortDate(Date date) throws Exception{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String strDate = sdf.format(date);		
		return strDate;
	}
}
