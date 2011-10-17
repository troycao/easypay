package com.figoyu.easypay.web.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import com.figoyu.easypay.common.DateUtil;
import com.figoyu.easypay.common.JsonUtil;
import com.figoyu.easypay.common.Page;
import com.figoyu.easypay.common.StringUtil;
import com.figoyu.easypay.pojo.News;
import com.figoyu.easypay.pojo.NewsType;
import com.figoyu.easypay.service.NewsService;
import com.figoyu.easypay.service.NewsTypeService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class NewsAction extends ActionSupport implements ModelDriven<News> {
	
	private static final long serialVersionUID = -6421557472260672285L;
	
	
	@Autowired
	private NewsService newsService;
	@Autowired
	private NewsTypeService newsTypeService;
	
	private News news = new News();
	private List<News> newsList;
	
	private String rows;
	private String page;
	
	public String getRows() {
		return rows;
	}
	public void setRows(String rows) {
		this.rows = rows;
	}
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}

	public List<News> getNewsList() {
		return newsList;
	}

	public void setNewsList(List<News> newsList) {
		this.newsList = newsList;
	}


	@Override
	public News getModel() {		
		return news;
	}
	
	
	public String findAllNews() throws Exception{
		Integer rows = Integer.valueOf(this.rows);
		Integer page = Integer.valueOf(this.page);
		
		Page curPage = new Page(page, rows);
		newsList = newsService.findNewsByPage(curPage.getPageParams());
		List<Map<String, Object>> mapList = new ArrayList<Map<String, Object>>();
		for(News news : newsList){
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("id", news.getId());
			NewsType newsType = newsTypeService.findNewsTypeById(news.getNewsType());
			map.put("newsType", newsType.getTypeName());
			map.put("newsName", news.getNewsName());
			map.put("publishDate", DateUtil.formatLongDate(news.getPublishDate()));
			map.put("isDated", news.getIsDated());
			mapList.add(map);
		}
		
		Integer total = newsService.findAllRecord();
		Map<String, Object> jsonMap = new HashMap<String, Object>();
		jsonMap.put("total", total);
		jsonMap.put("rows", mapList);
		JsonUtil.outputJson(jsonMap);		
		return null;
	}
	
	public String forwardNews() throws Exception{
		return SUCCESS;
	}
	
	public String forwardAddNews() throws Exception{
		return SUCCESS;
	}
	
	public String forwardEditNews() throws Exception{
		String strid = ServletActionContext.getRequest().getParameter("newsId");
		News news = newsService.findNewsById(Integer.valueOf(strid));
		ServletActionContext.getRequest().setAttribute("news", news);
		return SUCCESS;
	}
	
	public String insertOrUpdateNews() throws Exception{		
		news.setNewsName(StringUtil.decode(news.getNewsName()));
		news.setNewsContent(StringUtil.decode(news.getNewsContent()));			
		news.setPublishDate(new Date());
		news.setIsDated(0);
		
		Integer result = -1;
		
		if(news.getId() != null){
			result = newsService.updateNews(news);
		}else{
			result = newsService.insertNews(news);
		}		
		Map map = new HashMap();
		map.put("msg", result);
		JsonUtil.outputJson(map);
		return null;
	}
	
	public String getNewsTypes() throws Exception{
		List<NewsType> newsTypeList = newsTypeService.findAllNewsTypes();
		List<Map<String, Object>> mapList = new ArrayList<Map<String, Object>>();
		for(NewsType newsType : newsTypeList){
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("newsTypeId", newsType.getId());
			map.put("newsTypeName", newsType.getTypeName());
			mapList.add(map);
		}
		JsonUtil.outputJson(mapList);
		return null;
	}
	
	public String deleteNews() throws Exception{
		String strids = ServletActionContext.getRequest().getParameter("newsids");
		List<String> idList = StringUtil.toList(strids);
		Integer result = newsService.deleteNews(idList);
		
		Map map = new HashMap();
		map.put("msg", result);
		JsonUtil.outputJson(map);
		return null;
	}
	
	public String showNewsDetail() throws Exception{
		String strid = ServletActionContext.getRequest().getParameter("newsid");
		News news = newsService.findNewsById(Integer.valueOf(strid));
		ServletActionContext.getRequest().setAttribute("news", news);		
		return SUCCESS;
	}

}
