<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">    
    <title>公告管理</title>
    <script type="text/javascript">
    	$(function(){
    		$('#NewsTable').datagrid({
				url:'<%=path%>/news/findAllNews',
				width:getWidth(0.98),
				height:getHeight(0.9),
				idField:'id',
				striped:true,
				pagination:true, //显示分页			    
			    loadMsg:'数据加载中...',
			    queryParams:{},
			    pageSize:10,//若后台禁用pageList,此只用于显示
                pageList:[10,20,30,50],  
				frozenColumns:[[
					{field:'ck', checkbox:true},
					{title:'ID号',field:'id',width:100}
				]],
				columns:[[
					{field:'newsNumber', title:'编号', width:getWidth(0.05), align:'center'},
					{field:'newsType', title:'公告类型', width:getWidth(0.12), align:'center'},
					{field:'newsName', title:'公告标题', width:getWidth(0.2)},
					{field:'publishDate', title:'发布时间', width:getWidth(0.2), align:'center'},
					{field:'isDated', title:'是否过期', width:getWidth(0.12), align:'center',
						formatter:function(value, row ,index){
							if(value == 0){
								return '正在公示';
							}else{
								return '已过期';
							}
						}
					},
					{field:'operation', title:'操作', width:getWidth(0.12), align:'center',
						formatter:function(value, row ,index){
							return '<a href="#" onclick="editNews('
							+row.id
							+')">编辑&nbsp;&nbsp;<a href="#" onclick="deleteNews('
							+row.id
							+')">删除';
						}	
					}
				]],
				toolbar:[{
					text:'新增',
					iconCls:'icon-add',
					handler:function()
					{
						addNews();
					}
				},{
					text:'删除',
					iconCls:'icon-remove',
					handler:function()
					{
						deleteNewses();
					}
				}],
				onLoadSuccess:function()
				{
										  
				}			
			});	
			$('#NewsTable').datagrid('hideColumn', 'id');			
			//datagrid分页设置
			$('#NewsTable').datagrid('getPager').pagination({
				displayMsg:'当前显示从第<span style="color:red">{from}</span>条记录到第<span style="color:red">{to}</span>条记录，共<span style="color:red">{total}</span>记录',
				beforePageText:'第',
				afterPageText:'页，共<span style="color:red">{pages}</span>页'
			});
    	});
    
    </script>

  </head>
  
  <body>
    <div style="padding:10px" id="tabdiv"> 
        <table id="NewsTable"></table>
    </div>
  </body>
</html>
