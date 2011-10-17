package com.figoyu.easypay.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.figoyu.easypay.pojo.News;
import com.figoyu.easypay.service.NewsService;
import junit.framework.TestCase;

public class TestSpringMyBatis extends TestCase {
	//Spring整合MyBatis相关配置文件  
    private String[] configFiles = {"applicationContext-mybatis.xml", "applicationContext-services.xml"};  
    //创建Spring应用上下文  
    private ApplicationContext context =  new ClassPathXmlApplicationContext(configFiles);
    
    public void testNews(){
    	NewsService newsService = (NewsService) context.getBean("newsService");
    	
    	try{
    		/* News news = new News();
             news.setNewsNumber(5);
             news.setNewsName("测试555");
             news.setNewsContent("测试测试测试测试测试测试5555555555");
             news.setNewsType(2);
             news.setPublishDate(new Date());
             news.setIsDated(0);
             newsService.insertNews(news); */
    		
    		/*News news = newsService.findNewsByNumber(1);
    		news.setNewsName("【最新公告】严格打击非正常使用");
    		int i = newsService.updateNews(news);
    		System.out.println("更新了  "+i);*/
    		
    		Map<String, Integer> params = new HashMap<String, Integer>();
    		params.put("pageId", 0);
    		params.put("pageSize", 3);
    		//List<News> newsList = newsService.findNewsByPage(params);
    		/*
    		for(News news : newsList){
    			//System.out.println(news.getNewsNumber()+" : "+news.getNewsName());
    		}*/
    		
    	}catch(Exception e){
    		System.out.println(e.getMessage());
    	}
    }
}
