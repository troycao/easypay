<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ include file="../taglib.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">
		<script>
			function setmain(title, href) {
				var centerURL = href;
				var centerTitle = title;
				$('body').layout('panel', 'center').panel( {
					title : centerTitle,
					href : centerURL
				});
				$('body').layout('panel', 'center').panel('refresh');
				return false;
			}
		
			//弹出窗口
			function showWindow(options) {
				$("#MyPopWindow").window(options);
			}
			//关闭弹出窗口
			function closeWindow() {
				$("#MyPopWindow").window('close');
			}
		
			function getWidth(percent) {
				var centerWidth = $("#center").width();
				return centerWidth * percent;
			}
		
			function getHeight(percent) {
				var centerHeight = $("#center").height();
				return centerHeight * percent;
			}
		
			function forwardmain() {
				alert('ok');
			}
		</script>

	</head>

	<!-- 上-->
	<body class="easyui-layout" id="mainBody">
		<div region="north" split="false"
			style="height: 40px; background: #D6D6FF;" border="false">
			<table cellspacing="0" cellpadding="0" width="100%" border="0">
				<tr>
					<td rowspan="2" align="center" valign="middle"
						style="height: 40px; width: 150px;">
						<img src="<%=path%>/images/user_logo.gif" alt="商户后台系统" border="0" />
					</td>
					<td colspan="2"
						style="padding-right: 10px; margin-top: 0px; line-height: 28px; height: 28px; text-align: right;">
						<span> <font color="#000"> 商户: <strong>sorrobird</strong>
								(您好) 您的商户编号: <strong>1080</strong> 上次登录时间: 2011-8-30 15:41:35
								登录IP：125.66.63.115</font>
						</span>
					</td>
				</tr>
			</table>
		</div>

		<!-- 左-->

		<div region="west" class="menudiv" split="true" title="系统菜单"
			style="width: 200px; overflow: hidden;">
			<div id="menuDiv" class="easyui-accordion" fit="fasle" border="false"
				animate="true">
				<div title="常规设置" style="overflow: hidden;">
					<ul>
						<li id="rightLiNewsManager" style="cursor: pointer;">
							<div>
								<a href="#" onclick="setmain('公告管理','<%=path%>/news/forwardNews')">公告管理</a>
							</div>							
						</li>
					</ul>
					<ul>
						<li id="rightLiChannelManager" style="cursor: pointer;">
							<div>
								<a href="#" onclick="setmain('通道接口管理','<%=path%>/news/forwardNews')">通道接口管理</a>
							</div>							
						</li>
					</ul>
					<ul>
						<li id="rightLiDataManager" style="cursor: pointer;">
							<div>
								<a href="#" onclick="setmain('数据管理','<%=path%>/news/forwardNews')">数据管理</a>
							</div>							
						</li>
					</ul>
				</div>
				<div title="服务器管理" style="overflow: hidden;">
					<ul>
						<li id="rightLiUserinfo" style="cursor: pointer;">
							订单列表
						</li>
					</ul>
					<ul>
						<li id="rightLiUserinfo" style="cursor: pointer;">
							订单列表
						</li>
					</ul>
					<ul>
						<li id="rightLiUserinfo" style="cursor: pointer;">
							订单列表
						</li>
					</ul>
				</div>

			</div>
		</div>


		<!-- 中 -->
		<div id="center" region="center" title="首页"
			style="overflow-x: hidden; padding: 0px;"
			href=""></div>
		<div region="south" border="false"
			style="height: 40px; background: #D6D6FF; padding: 10px;">
			<div class="footer">
				2011-2012 © 版权所有 EasyPay 易支付平台程序™
			</div>
		</div>

		<div id="MyPopWindow" modal="true" shadow="false" minimizable="false"
			cache="false" maximizable="false" collapsible="false"
			resizable="false" style="margin: 0px; padding: 0px; overflow: auto;">
		</div>
	</body>
</html>

