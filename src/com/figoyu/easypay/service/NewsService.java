package com.figoyu.easypay.service;

import java.util.List;
import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

import com.figoyu.easypay.pojo.News;

public interface NewsService {
	@Transactional
	public Integer insertNews(News news); 
	
	/**
	 * 查询全部公告
	 * @return
	 */
	@Transactional
	public List<News> findAllNews();
	
	@Transactional
	public List<News> findNewsByPage(Map<String, Object> pageParams);
	
	
	/**
	 * 查询所有记录值
	 * @return
	 */
	@Transactional
	public Integer findAllRecord();
	
	
	/**
	 * 按Id号查询公告
	 * @param newsNumber
	 * @return
	 */
	@Transactional
	public News findNewsById(Integer id);
	
	/**
	 * 查询公告并排序
	 * @param params
	 * @return
	 */
	@Transactional
	public List<News> findAllNewsOrder(Map<String, Object> params);
	
	@Transactional
	public Integer updateNews(News news);
	
	/*@Transactional
	public Integer deleteNews(Integer id);*/
	
	@Transactional
	public Integer deleteNews(List idList);
}
