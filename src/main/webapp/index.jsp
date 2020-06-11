<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,Chrome=1">
<!-- Google Chrome Frame也可以让IE用上Chrome的引擎: -->
<meta name="renderer" content="webkit">
<!--国产浏览器高速模式-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 定义页面的最新版本 -->
<meta name="description" content="网站简介" />
<!-- 网站简介 -->
<meta name="keywords" content="搜索关键字，以半角英文逗号隔开" />
<title>穷在闹市出品</title>


<link rel="stylesheet" type="text/css"
	href="<%=basePath%>./css/base.css">
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>./css/frame_sys.css">
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>./css/iconfont.css">
<script type="text/javascript"
	src="<%=basePath%>./framework/jquery-1.11.3.min.js"></script>
<script type="text/javascript" src="<%=basePath%>./js/frame.js"></script>
<!--分页插件-->
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>./css/jquery.page.css">
<script type="text/javascript"
	src="<%=basePath%>./framework/jquery.page.js"></script>

<!--自定义滚动条-->
<script type="text/javascript"
	src="<%=basePath%>./framework/jquery-ui-1.10.4.min.js"></script>
<script type="text/javascript"
	src="<%=basePath%>./framework/jquery.mousewheel.min.js"></script>
<script type="text/javascript"
	src="<%=basePath%>./framework/jquery.mCustomScrollbar.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>./css/jquery.mCustomScrollbar.css">


</head>
<body>

	<div class="top">
		<p>
			穷在闹市<font>系统设置</font>
		</p>
		<span> <a class="but" href=""><i class="iconfont">&#xe6a3;</i>退出系统</a>
			<a class="but" href=""><i class="iconfont">&#xe600;</i>返回首页</a> <a>欢迎您，张伟平</a>
		</span>
	</div>

	<div class="main">

		<div class="menu">
			<div class="menuList">
				<ul class="menu1">
					<li class="menuli1"><a class="menua1"
						href="javascript:menu_ajax('tgls/index.html', '后台主页')"><i
							class="iconfont left">&#xe600;</i>
							<p>后台主页</p></a></li>
					<li class="menuli1"><a class="menua1"
						href="javascript:void(0)"><i class="iconfont left">&#xe697;</i>
							<p>用户管理</p> <i class="iconfont right">&#xe608;</i></a>
						<ul class="menu2">
							<li class="menuli2"><a class="menua2"
								href="javascript:menu_ajax('<%=basePath%>./WEB-INF/webcontent/selectUser.jsp', '用户管理,用户查询')"><i
									class="menua2_ico"><span></span></i>用户查询</a></li>
							<li class="menuli2"><a class="menua2"
								href="javascript:menu_ajax('<%=basePath%>./WEB-INF/webcontent/addUser.jsp', '用户管理,添加用户')"><i
									class="menua2_ico"><span></span></i>添加用户</a></li>
						</ul></li>
					<li class="menuli1"><a class="menua1"
						href="javascript:void(0)"><i class="iconfont left">&#xe697;</i>
							<p>部门管理</p> <i class="iconfont right">&#xe608;</i></a>
						<ul class="menu2">
							<li class="menuli2"><a class="menua2"
								href="javascript:menu_ajax('department/queryAllDep', '部门管理,部门查询')"><i
									class="menua2_ico"><span></span></i>部门查询</a></li>
							<li class="menuli2"><a class="menua2"
								href="javascript:menu_ajax('addDep.jsp', '部门管理,添加部门')"><i
									class="menua2_ico"><span></span></i>添加部门</a></li>
						</ul></li>
					<li class="menuli1"><a class="menua1"
						href="javascript:void(0)"><i class="iconfont left">&#xe697;</i>
							<p>职位管理</p> <i class="iconfont right">&#xe608;</i></a>
						<ul class="menu2">
							<li class="menuli2"><a class="menua2"
								href="javascript:menu_ajax('position/queryAllPos', '职位管理,职位查询')"><i
									class="menua2_ico"><span></span></i>职位查询</a></li>
							<li class="menuli2"><a class="menua2"
								href="javascript:menu_ajax('addPos.jsp', '职位管理,添加职位')"><i
									class="menua2_ico"><span></span></i>添加职位</a></li>
						</ul></li>
					<li class="menuli1"><a class="menua1"
						href="javascript:void(0)"><i class="iconfont left">&#xe697;</i>
							<p>员工管理</p> <i class="iconfont right">&#xe608;</i></a>
						<ul class="menu2">
							<li class="menuli2"><a class="menua2"
								href="javascript:menu_ajax('tgls/agent/agent_list.html', '员工管理,员工查询')"><i
									class="menua2_ico"><span></span></i>员工查询</a></li>
							<li class="menuli2"><a class="menua2"
								href="javascript:menu_ajax('tgls/agent/agent_add.html', '员工管理,添加员工')"><i
									class="menua2_ico"><span></span></i>添加员工</a></li>
						</ul></li>
					<li class="menuli1"><a class="menua1"
						href="javascript:void(0)"><i class="iconfont left">&#xe697;</i>
							<p>公告管理</p> <i class="iconfont right">&#xe608;</i></a>
						<ul class="menu2">
							<li class="menuli2"><a class="menua2"
								href="javascript:menu_ajax('tgls/agent/agent_list.html', '公告管理,公告查询')"><i
									class="menua2_ico"><span></span></i>公告查询</a></li>
							<li class="menuli2"><a class="menua2"
								href="javascript:menu_ajax('tgls/agent/agent_add.html', '公告管理,添加公告')"><i
									class="menua2_ico"><span></span></i>添加公告</a></li>
						</ul></li>
					<li class="menuli1"><a class="menua1"
						href="javascript:void(0)"><i class="iconfont left">&#xe697;</i>
							<p>下载中心</p> <i class="iconfont right">&#xe608;</i></a>
						<ul class="menu2">
							<li class="menuli2"><a class="menua2"
								href="javascript:menu_ajax('tgls/agent/agent_list.html', '下载中心,文档查询')"><i
								href="javascript:menu_ajax('document/selectAllDoc', '下载中心,文档查询')"><i
									class="menua2_ico"><span></span></i>文档查询</a></li>
							<li class="menuli2"><a class="menua2"
								href="javascript:menu_ajax('tgls/agent/agent_add.html', '下载中心,上传文档')"><i
								href="javascript:menu_ajax('document/addDoc_pre', '下载中心,上传文档')"><i
									class="menua2_ico"><span></span></i>上传文档</a></li>
						</ul></li>
				</ul>
			</div>
		</div>

		<div class="main_body">
			<div class="main_body_title">
				<font>后台主页</font>
			</div>
			<div class="main_body_con">
				<iframe id="mainIframe" src="tgls/index.html" scrolling="no"></iframe>
			</div>
		</div>

	</div>

	<div class="copyright">刘日章小组出品</div>


	<script>
		$(".menu").mCustomScrollbar({
			scrollButtons : {
				enable : false,
				scrollType : "continuous",
				scrollSpeed : 20,
				scrollAmount : 40
			},
			horizontalScroll : false
		});
		$(".main_body_con").mCustomScrollbar({
			scrollButtons : {
				enable : false,
				scrollType : "continuous",
				scrollSpeed : 20,
				scrollAmount : 40
			},
			horizontalScroll : false
		});
	</script>
</body>
</html>
