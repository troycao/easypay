package com.figoyu.easypay.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.figoyu.easypay.dao.NewsTypeMapper;
import com.figoyu.easypay.pojo.NewsType;
import com.figoyu.easypay.service.NewsTypeService;

public class NewsTypeServiceImpl implements NewsTypeService {

	@Autowired
	private NewsTypeMapper newsTypeMapper;

	@Override
	public List<NewsType> findAllNewsTypes() {		
		return newsTypeMapper.findAllNewsTypes();
	}

	@Override
	public NewsType findNewsTypeById(Integer id) {		
		return newsTypeMapper.findNewsTypeById(id);
	}

}
