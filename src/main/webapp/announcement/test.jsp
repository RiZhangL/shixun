<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>测试使用bootstrap框架</title>
	<!-- 引入jQuery -->
	<script type="text/javascript" src="../js/jquery-1.11.0.js"></script>
	<!-- 引入bootstrap样式 -->
 	<link href="../static/bootstrap-3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
 	<script src="../static/bootstrap-3.3.7/dist/js/bootstrap.min.js"></script>
</head>
<body>
	<table class="table table-hover">
 		<thead>
 			<tr>
 				<th>标题</th>
 				<th>介绍</th>
 				<th>发布人</th>
 				<th>发布时间</th>
 				<th>操作</th>
 				<th>预览</th>
 			</tr>
 		</thead>
 		<tbody>
 			<c:forEach items="${list}" var="item">
							<tr id="data_0" align="center" class="main_trbg"
								style="background-color: rgb(220, 220, 220);">

								<td>${item.title}</td>
								<td>${item.introduction}</td>
								<td>${item.creator_name}</td>
								<td>${item.time}</td>
								<td align="center" width="40px;"><a href="showUpdateNotice.html">
									<img title="修改" src="../images/update.gif"></a>
							    </td>
							    <td align="center" width="40px;"><a href="#" id="prev_19">
									<img title="预览" src="../images/prev.gif"></a>
							    </td>
							</tr>
			</c:forEach>
 		</tbody>
	</table>
</body>
</html>
