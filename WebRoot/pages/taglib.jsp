<%@ page language="java" import="java.util.*" 
		contentType="text/html;charset=UTF-8" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>																										
<link rel="stylesheet" type="text/css" href="<%=path%>/js/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="<%=path%>/js/themes/icon.css">
<link rel="stylesheet" type="text/css" href="<%=path%>/css/default.css">
<script src="<%=path%>/js/jquery-1.4.4.min.js" type="text/javascript">
</script>
<script  src="<%=path%>/js/jquery.easyui.min.js" type="text/javascript">
</script>
<script type="text/javascript" src="<%=path%>/xheditor/xheditor-1.1.10-zh-cn.min.js">
</script>

