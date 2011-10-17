<%@ page language="java" contentType="text/html;charset=UTF-8" 
				import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">    
    <title>公告详细内容</title>    
    <style type="text/css">
    	.newstable {
    		margin:10px;    		
    	}
    	
    	h1 {
    		color:#FF6600;
    		font-size:20px;
    		font-weight:bold;
    	}
    	
    
    </style>
   	<script type="text/javascript">
    	$(function(){			
			var strcontent = '${requestScope.news.newsContent}';				
			//strcontent = strcontent.replace(/<br>/ig, "\n");
			$('#newsContent').html(strcontent);
    	});  	
    	
    	function back(){
    		closeWindow();
    	}
    	
    	
   	</script>

  </head>
  
  <body>
  	<s:set name="news" value="#request.news"></s:set>	
  	 <table width="600" border="0" align="center" cellpadding="2" cellspacing="2" class="newstable">
	    <tr>		    
		    <td><h1><s:property value="#news.newsName" /></h1></td>
	    </tr>
	    <tr>	    	
	    	<td>发布时间：<s:date name="#news.publishDate" format="yyyy-MM-dd HH:mm:ss"/></td>
	    </tr>
	    <tr>	    	
	    	<td>
	    		<div id="newsContent"></div>
	    	</td>
	    </tr>	    
	     <tr align="center">
	    	<td><a href="#" id="btn-back" onclick="back();"
							class="easyui-linkbutton" iconCls="icon-back">返回</a>		
	    </tr>	    
    </table>
  
   
  </body>
</html>
