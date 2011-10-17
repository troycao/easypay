package com.figoyu.easypay.pojo;

import java.util.Date;

public class News {
	private Integer id;
	private Integer newsType;
	private String newsName;
	private String newsContent;
	private Date publishDate;
	private Integer isDated;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getNewsType() {
		return newsType;
	}
	public void setNewsType(Integer newsType) {
		this.newsType = newsType;
	}
	public String getNewsName() {
		return newsName;
	}
	public void setNewsName(String newsName) {
		this.newsName = newsName;
	}
	public String getNewsContent() {
		return newsContent;
	}
	public void setNewsContent(String newsContent) {
		this.newsContent = newsContent;
	}
	public Date getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(Date publishDate) {		
		this.publishDate = publishDate;
	}
	public Integer getIsDated() {
		return isDated;
	}
	public void setIsDated(Integer isDated) {
		this.isDated = isDated;
	}
}
