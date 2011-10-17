package com.figoyu.easypay.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.figoyu.easypay.pojo.NewsType;

public interface NewsTypeService {
	@Transactional
	public NewsType findNewsTypeById(Integer id);
	@Transactional
	public List<NewsType> findAllNewsTypes();
}
