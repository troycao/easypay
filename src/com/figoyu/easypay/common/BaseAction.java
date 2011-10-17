package com.figoyu.easypay.common;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;


import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Action����
 * */
public class BaseAction extends ActionSupport implements SessionAware{


	public void setSession(Map<String, Object> sessionMap) {		
		
	}	
	
	protected Map<String,Object> getMapSession(){
		return  (Map<String,Object>)ActionContext.getContext().getSession();
	}
	
	protected Object getMapSessionGet(String key){
		return  getMapSession().get(key);
	}
	
	protected void setMapSessionPut(String key,Object value){
		 getMapSession().put(key, value);
	}
	
	/***
	 * ��ȡ�������
	 * */
	protected HttpServletRequest getRequest(){
		return ServletActionContext.getRequest (); 
	}
	
	/***
	 * ��ȡ�������
	 * */
	protected HttpServletResponse getResponse(){
		return ServletActionContext.getResponse();
	}
	
	/***
	 * ��ȡ�Ự����
	 * */
	protected javax.servlet.http.HttpSession getSession(){
		return getRequest().getSession(); 
	}
	
	/***
	 * �����������
	 * */
	protected void setRequestAttribute(String attribute,Object attrValue){
		getRequest().setAttribute(attribute, attrValue);
	}
	
	/***
	 * ��ȡ�������
	 * */
	protected Object getRequestAttribute(String attribute){
		return getRequest().getAttribute(attribute);
	}	
	
	/***
	 * ����Session������ֵ
	 * */
	protected void setSessionAttribute(String attribute,Object attrValue){
		getSession().setAttribute(attribute, attrValue);
	}
	
	/***
	 * ��ȡSession������ֵ
	 * */
	protected Object getSessionAttribute(String attribute){
		return getSession().getAttribute(attribute);
	}	
	/***
	 * ��ȡ�����ļ�·��
	 */
	protected String getServerRealPath(String fileName){
		return ServletActionContext.getServletContext().getRealPath("fileName");
	}
}
