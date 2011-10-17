package com.figoyu.easypay.dao;

import java.util.List;

import com.figoyu.easypay.pojo.NewsType;

public interface NewsTypeMapper {
	public NewsType findNewsTypeById(Integer id);
	public List<NewsType> findAllNewsTypes();
}
