<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/view.css" rel="stylesheet" type="text/css" />
<title>Insert title here</title>

</head>
<body id="body">
	<!--顶部导航-->
	<div class="top">
		<div class="top1">
			<div  class="top_menu">
				<ul>
					<a href="index.html" target="_blank"><li>首页</a>
					</li>
					</a>
					<a href="Cus_ho.html" target="_blank"><li>预约</li></a>
					<a href="front/view.action" target="_blank"><li>推荐场景</li></a>
					<a href="漫展活动.html" target="_blank"><li>漫展</li></a>
					<a href="works.html" target="_blank"><li>作品秀</li></a>
					<a href="讨论圈.html" target="_blank"><li>讨论圈</li></a>
				</ul>
			</div>
			<div class="top_search">
				<form action="" method="get">
					<input type="text" name="search" class="text" /> <input
						type="submit" name="submit" value="搜索" class="submit" />
				</form>
			</div>
			<div class="top_right">
				<ul>
					<c:if test="${loginer.cusName==null}">
						<a href="front/login.jsp"><li>登录</li></a>
						<a href="#"><li>注册</li></a>
					</c:if>
					<c:if test="${loginer.cusName!=null}">
						<li style="color: #FFF">${loginer.cusName},欢迎你</li>
						<a href="front/person_home.action"><li>个人中心</li></a>
						<a href="front/loginout.action"><li class="release">退出</li></a>
					</c:if>

				</ul>
			</div>
		</div>
	</div>
	
	<!--主图和功能-->
<div class="th_fu">
<!--主题图片-->
  <div class="theme_img">
    <img src="image/viewImages/timg4.jpg">
  </div>
  
  <!--功能导航-->
  <div class="function">
    <div class="logo">
      <img src="" alt="" />
    </div>
    <div class="func">
      <ul>
        <a href=""><li>本周排行榜</li></a>
        <a href=""><li>今日排行榜</li></a>
        <a href=""><li>人气榜</li></a>
        <a href=""><li>新晋榜</li></a>
        <a href=""><li>地区榜</li></a>
        <a href=""><li>原著榜</li></a>
        <a href=""><li>排行榜日历</li></a>
      </ul>
    </div>
  </div>
  
</div>

<!-- 主体详情 -->
  <div class="wrap">
    <div class="viewdetail">
      <div class="viewdetail_top">
		<!--景点图片 -->
	    <div class="viewImageshow">
	      <img src="${vInfo.viewImage}">
	    </div>
	    <!-- 景点名称地址门票显示 -->
	    <div class="viewpartdetail">
	      <div class="viewName"><h2 style="line-height:50px;">${vInfo.viewName}</h2></div>
	      <div class="viewTicket"><p><strong style="color:gray">门票：</strong><span style="color:red">${vInfo.viewTicket}</span></p></div>
	      <div class="viewAdd"><p><strong style="color:gray">景点地址：</strong>${vInfo.viewAdd}</p></div>
	       <br/><p style="color:gray;font-size:14px;text-indent:20px;"><span style="color:red">* </span>最终信息以相关景点公布为准</p>
	    </div>
	 </div>
     <!-- 景点介绍 -->
     <div class="viewIntroduce">
       <br/>
       <p style="text-indent:2em;"><span style="color:gray">详情介绍：</span>${vInfo.viewIntro}</p><br/>
     </div>
    </div>
    
  </div>



<!--底部-->
	<div class="bottom">
		<div class="bottom_nav">
			<ul>
				<li><a href="">联系我们</a></li>
				<li><a href="">关于我们</a></li>
				<li><a href="">常见问题</a></li>
				<li><a href="">意见反馈</a></li>
				<li><a href="">二次元社区</a></li>
				<li><a href="">加入我们</a></li>
			</ul>
		</div>
		<div class="copyright">
			<p>
				Copyright (C) 二次园 2017-1019 <br /> All Rights
				Reserved京ICP证fghka4号出版物经营许可证 新出发京批字第直N号
			</p>
		</div>
	</div>
</body>
</html>