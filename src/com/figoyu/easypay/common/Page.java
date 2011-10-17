package com.figoyu.easypay.common;

import java.util.HashMap;
import java.util.Map;

public class Page {
	private Integer page;
	private Integer rows;
	
	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}
	
	public Page(Integer page, Integer rows){
		this.page = page;
		this.rows = rows;
	}
	
	public Map<String, Object> getPageParams(){
		Map<String, Object> pageParams = new HashMap<String, Object>();
		if(page == 1){
			pageParams.put("pageId", page - 1);
			pageParams.put("pageSize", rows);
			pageParams.put("order", "Id desc");
		}else{
			pageParams.put("pageId", (page - 1) * rows);
			pageParams.put("pageSize", rows);
			pageParams.put("order", "Id desc");
		}		
		return pageParams;
	}
}
