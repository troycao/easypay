package com.figoyu.easypay.common;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.ServletActionContext;
import com.google.gson.Gson;

public class JsonUtil {
	  
    /** 
     * 输出JSON信息 
     * @param jsonObj 
     */  
    public static void outputJson(Object jsonObj){          
        HttpServletResponse response = ServletActionContext.getResponse();  
        response.setContentType("application/json;charset=utf-8");  
        response.setHeader("Cache-Control", "no-cache");          
        try {               
            PrintWriter pw = response.getWriter();  
            //将Java对象转换为JSON字符串  
            String gsonStr = new Gson().toJson(jsonObj);  
            //输出JSON字符串  
            //System.out.println(gsonStr);
            pw.print(gsonStr);                
            pw.flush();  
            pw.close();               
        } catch (IOException e) {  
            System.out.println("输出GSON出错：" + e);  
        }  
    }  
}
