<%@ page language="java" contentType="text/html;charset=UTF-8" 
				import="java.util.*" pageEncoding="utf-8"%>
<%@ include file="../taglib.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">
		<title>商户管理首页</title>
	</head>

	<body>
		<div id="main">
			<div class="business_top_note">
				<div style="text-align: left; margin-left: 30px">
					<marquee scrollamount="3" direction="left">
						<p>
							<a href="">申请提现与结算时间说明<a> <sapn>2011-08-09</sapn> <a
									href="">申请提现与结算时间说明<a> <sapn>2011-08-09</sapn> <a
											href="">申请提现与结算时间说明<a> <sapn>2011-08-09</sapn> <a
													href="">申请提现与结算时间说明<a> <sapn>2011-08-09</sapn>
						</p>
					</marquee>
				</div>
			</div>
			<div>
				<div class="business_userinfo">
					<div class="business_userinfo_left">
						<div class="business_userinfo_title">
							代理信息
						</div>
						<div class="business_userinfo_box">
							<div class="business_userinfo_admend_box_left">
								<img src="<%=path %>/images/user_pic.jpg" width="58px" height="59px">
								<span>点击<font color="blue"><a href="UserInfo.aspx"
										target="rightframe">查看资料</a>
								</font>
								</span>
							</div>
							<p>
								<span>余川</span> 欢迎您！ 代理类型:
								<span>高级代理</span>
							</p>
							<p>
								站点名称:
								<span>93支付中心</span> 域名
								<a href="http://1.93bf.net" target="_blank"><strong>http://1.93bf.net</strong>
								</a>
							</p>
							<p>
								今日交易额
								<strong><font color="#ff000">5103.00元</font>
								</strong> 昨日
								<strong><font color="#ff0000">8887.00元</font>
								</strong>
								<a href="CPSCount.aspx?status=2">明细</a>
							</p>
							<p>
								下属商户数量: 15个
								<a href="UserList.aspx" target="rightframe">下家商户列表</a>
							</p>
						</div>
					</div>
					<div class="business_userinfo_right">
						<div class="business_money_title">
							<span>帐户余额</span><a href="GetMoney.aspx">申请提现</a>
							<a href="PayLog.aspx">提现记录</a>
						</div>
						<div class="business_money_box">
							您的帐户余额为：
							<br>
							<em>￥</em><span
								style="font-size: 16px; font-family: tahoma; color: #B70000; font-weight: bold">1719.02</span>
							元
						</div>
					</div>
				</div>

			</div>
	</body>
</html>

