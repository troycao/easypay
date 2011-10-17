package com.figoyu.easypay.test;

import java.io.Reader;
import java.util.Date;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.figoyu.easypay.dao.NewsMapper;
import com.figoyu.easypay.pojo.News;

import junit.framework.TestCase;

public class TestMyBatis extends TestCase {
	//指定MyBatis配置文件  
    private static final String RESOURCE = "mybatis-config.xml";  
    
    public void testBatis() throws Exception{
    	 //1、指定MyBaties配置文件  
        Reader reader = Resources.getResourceAsReader(RESOURCE);  
        //2、创建SqlSessionFactory()  
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);          
        SqlSession session = null;  
        try {              
            //3、获取SqlSession  
            session = sessionFactory.openSession();             
            NewsMapper newsMapper = session.getMapper(NewsMapper.class);            
            News news = new News();
           // news.setNewsNumber(4);
            news.setNewsName("测试");
            news.setNewsContent("测试测试测试测试测试测试");
            news.setNewsType(2);
            news.setPublishDate(new Date());
            news.setIsDated(0);
            newsMapper.insertNews(news);
            session.commit();
        }catch(Exception e){
        	System.out.println(e.getMessage());
        }finally{
        	//6、关闭SqlSession  
            if(session != null){  
                session.close();  
            } 
        }
    }
}
