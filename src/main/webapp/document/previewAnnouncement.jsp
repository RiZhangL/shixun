<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>人事管理系统 ——公告管理</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="pragma" content="no-cache" />
<meta http-equiv="cache-control" content="no-cache" />
<meta http-equiv="expires" content="0" />
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3" />
<meta http-equiv="description" content="This is my page" />
<link href="../css/css.css" type="text/css" rel="stylesheet" />
<link rel="stylesheet" type="text/css"
	href="../js/ligerUI/skins/Aqua/css/ligerui-dialog.css" />
<link href="../js/ligerUI/skins/ligerui-icons.css" rel="stylesheet"
	type="text/css" />
<script type="text/javascript" src="../js/jquery-1.11.0.js"></script>
<script type="text/javascript" src="../js/jquery-migrate-1.2.1.js"></script>
<script src="../js/ligerUI/js/core/base.js" type="text/javascript"></script>
<script src="../js/ligerUI/js/plugins/ligerDrag.js"
	type="text/javascript"></script>
<script src="../js/ligerUI/js/plugins/ligerDialog.js"
	type="text/javascript"></script>
<script src="../js/ligerUI/js/plugins/ligerResizable.js"
	type="text/javascript"></script>
<link href="../css/pager.css" type="text/css" rel="stylesheet" />
<!-- 引入bootstrap样式 -->
<link href="../static/bootstrap-3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
 <link href="http://libs.baidu.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet">
 <script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
 <script src="http://libs.baidu.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>
<script src="../static/bootstrap-3.3.7/dist/js/bootstrap.min.js"></script>
<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
</head>
<body>
	<div style="margin-left:30;margin-top:10">
		<a href="selectAllAnnoucement"><< 返回</a>
	  
	</div>
	<div align="center" style="margin-top:30">
		<h1>${announcement.title}</h1>
	</div>
	<div align="center" style="margin-top:30">
		<p class="lead">发布人:${announcement.creator_name} &nbsp &nbsp &nbsp发布时间:${announcement.time}</p>
	</div>
	<div  style="margin-top:30;margin-left:30">
		<p>&nbsp &nbsp${announcement.content}</p>
	</div>
		

</body>