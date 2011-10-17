package com.figoyu.easypay.common;

import java.net.URLDecoder;
import java.util.Arrays;
import java.util.List;

public class StringUtil {

	public static String decode(String str) throws Exception{
		return URLDecoder.decode(str,"utf-8");
	}
	
	public static String SqlInConcat(Object[] objects, String sql){
		String result = sql;
		for (int i = 0; i < objects.length; i++) {
			if (i == objects.length - 1) {
				result = result + objects[i] + ")";
			} else {
				result = result + objects[i] + ", ";
			}
		}
		return result;
	}
	
	public static List<String> toList(String s){
		String[] temp = null;
		if(s.contains("-")){
			temp = s.substring(0, s.length()-1).split("-");
		}
		List<String> result = Arrays.asList(temp);
		return result;
	}
}
