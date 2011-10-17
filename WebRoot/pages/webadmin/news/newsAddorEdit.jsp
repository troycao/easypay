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
    <title>增加、编辑公告</title>    
    <style type="text/css">
    	.newstable {
    		margin:10px;    		
    	}
    	
    
    </style>
   	<script type="text/javascript">
    	$(function(){
    		$('#newsType').combobox({
				url:'<%=path%>/news/getNewsTypes',
				valueField:'newsTypeId',
				textField:'newsTypeName'
				
			});
			
			$('#newsContent').xheditor({
				tools:'mfull',
				skin:'default',
				width:500,
				height:300
			});
			
			
			$('#newsType').combobox('setValue', '${requestScope.news.newsType}');
			$('#newsContent').val('${requestScope.news.newsContent}');
    	});  	
    	
    	function back(){
    		closeWindow();
    	}
    	
    	function save(){
    		var params = $("#newsForm").serialize();
    		alert(params);
	  		params = encodeURI(params);	  		
	  		$.post("<%=path%>/news/insertOrUpdateNews",params,function(data){
	  			if(data.msg > 0){
	  				$.messager.alert('提示','插入或更新公告成功！','info');
	  				$('#MyPopWindow').window('close');
					$('#NewsTable').datagrid('reload'); 
	  			}else{
	  				$.messager.alert('提示','插入或更新公告出现异常！','info');
	  			}				
			});
    	}
   	</script>

  </head>
  
  <body>
  	<s:set name="news" value="#request.news"></s:set>
	<form id="newsForm" method="post">	
		<input id="id" name="id" type="hidden" value="<s:property value="#news.id"/>"/>
  	 <table width="600" border="0" align="center" cellpadding="2" cellspacing="2" class="newstable">
	    <tr>
		    <td>公告标题</td>
		    <td><input id="newsName" name="newsName" type="text" 
		    class="input_text" style="width:400px" 
		    value="<s:property value="#news.newsName" />"/></td>
	    </tr>
	    <tr>
	    	<td>公告类型</td>
	    	<td><input id="newsType" name="newsType" style="width:150px"/></td>
	    </tr>
	    <tr>
	    	<td>公告内容</td>
	    	<td>
	    		<textarea id="newsContent" name="newsContent" class="xheditor">
	    		</textarea>
	    	</td>
	    </tr>	    
	     <tr align="center">
	    	<td colspan="2"><a href="#" id="btn-back" onclick="back();"
							class="easyui-linkbutton" iconCls="icon-back">返回</a>&nbsp;&nbsp;
			<a href="#" id="btn-save" onclick="save();"
							class="easyui-linkbutton" iconCls="icon-save">保存</a></td>
	    </tr>	    
    </table>
  </form>
   
  </body>
</html>
