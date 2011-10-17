package com.figoyu.easypay.dao;

import java.util.List;
import java.util.Map;

import com.figoyu.easypay.pojo.News;

public interface NewsMapper {
	
	/**
	 * 查询全部公告
	 * @return
	 */
	public List<News> findAllNews();
	
	/**
	 * 分页查询全部公告
	 * @return
	 */
	public List<News> findNewsByPage(Map<String, Object> pageParams);
	
	/**
	 * 查询所有记录值
	 * @return
	 */
	public Integer findAllRecord();
	
	
	/**
	 * 按Id号查询公告
	 * @param newsNumber
	 * @return
	 */
	public News findNewsById(Integer id);
	
	/**
	 * 查询公告并排序
	 * @param params
	 * @return
	 */
	public List<News> findAllNewsOrder(Map<String, Object> params);
	public Integer insertNews(News news);
	public Integer updateNews(News news);
	//public Integer deleteNews(Integer id);
	public Integer deleteNews(List idList);
	
}
