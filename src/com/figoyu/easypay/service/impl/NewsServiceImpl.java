package com.figoyu.easypay.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.figoyu.easypay.dao.NewsMapper;
import com.figoyu.easypay.pojo.News;
import com.figoyu.easypay.service.NewsService;

public class NewsServiceImpl implements NewsService {
	
	@Autowired
	private NewsMapper newsMapper;

	@Override
	public Integer insertNews(News news) {		
		return newsMapper.insertNews(news);
	}

	/*@Override
	public Integer deleteNews(Integer id) {		
		return newsMapper.deleteNews(id);
	}*/

	@Override
	public List<News> findAllNews() {		
		return newsMapper.findAllNews();
	}

	@Override
	public List<News> findAllNewsOrder(Map<String, Object> params) {		
		return newsMapper.findAllNewsOrder(params);
	}

	@Override
	public News findNewsById(Integer id) {		
		return newsMapper.findNewsById(id);
	}


	@Override
	public Integer updateNews(News news) {		
		return newsMapper.updateNews(news);
	}

	@Override
	public List<News> findNewsByPage(Map<String, Object> pageParams) {		
		return newsMapper.findNewsByPage(pageParams);
	}

	@Override
	public Integer findAllRecord() {		
		return newsMapper.findAllRecord();
	}

	@Override
	public Integer deleteNews(List idList) {		
		return newsMapper.deleteNews(idList);
	}

}
