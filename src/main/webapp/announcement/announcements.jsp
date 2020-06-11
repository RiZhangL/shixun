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
<script type="text/javascript">
	function deleteAnn(){
			var items = document.getElementsByName("Isdelete");
			var arr = "";
			for (i = 0; i < items.length; i++) {                    
	            if (items[i].checked) {                        
	                arr+=(items[i].value+",");               
	            }                
	        }
	        var temp = document.createElement("form");
			temp.action = "http://localhost:8080/staffhome/deleteAnnouncement";
			temp.method = "post";
			temp.style.display = "none";
			var opt1 = document.createElement("textarea");
			opt1.name="deleteIds";
			opt1.value=arr;
			temp.appendChild(opt1);
			document.body.appendChild(temp);
			temp.submit();
			return;
		}

	function selectAll(){
		var items = document.getElementsByName("Isdelete");
		if(items[0].checked){
			for (i = 0; i < items.length; i++) {                    
	            items[i].checked=false;             
	        }
			return;
		}else{
			for (i = 0; i < items.length; i++) {                    
	            items[i].checked=true;             
	        }
			return;
		}
	}
</script>

</head>
<body>
	<!-- 导航 -->
	
	<table width="100%" height="90%" border="0" cellpadding="5"
		cellspacing="0" class="main_tabbor">
		<!-- 查询区  -->
		<tr valign="top">
			<td height="30">
				<table width="100%" border="0" cellpadding="0" cellspacing="10"
					class="main_tab">
					<tr>
						<td class="fftd">

							<table width="100%" border="0" cellpadding="0" cellspacing="0">
								<form action="querySimilar" method="post">
									<tr>
										<td class="font3">公告标题：<input type="text" name="name">
											<input type="submit" value="搜索" />
											<input type="button" onclick="deleteAnn()" value="删除"/>
										</td>
									</tr>
								</form>
							</table>

						</td>
					</tr>
				</table>
			</td>
		</tr>

		<!-- 数据展示区 -->
		<tr valign="top">
			<td height="20">
				<table class="table table-hover" width="100%" border="1" cellpadding="5" cellspacing="0">
					<tbody>
						<tr class="main_trbg_tit" align="center"
							style="background-color: rgb(169, 169, 169);">
							<td>
								<input type="button" onclick="selectAll()" value="全选"/>
							</td>
							<td>公告标题</td>
							<td>公告介绍</td>
							<td>发布人</td>
							<td>发布时间</td>
							<td align="center">操作</td>
							<td align="center">预览</td>

						</tr>
						<c:forEach items="${list}" var="item" varStatus="xh">
							<tr id="data_0" align="center">
								<td>
									<p><input type="checkbox" name="Isdelete" value="${xh.count}" /></p>
								</td>
								<td>${item.title}</td>
								<td>${item.introduction}</td>
								<td>${item.creator_name}</td>
								<td>${item.time}</td>
								<td align="center" width="40px;"><a href="updateAnnoucement?id=${xh.count}">
									<button type="button" class="btn btn-default">
										<span class="glyphicon glyphicon-pencil"></span>
									</button>
							    </td>
							    <td align="center" width="40px;"><a href="#" id="prev_19">
									<button type="button" class="btn btn-default">
										<span class="glyphicon glyphicon-search"></span>
									</button>
							    </td>
							</tr>
						</c:forEach>


					</tbody>
				</table>
			</td>
		</tr>
		<!-- 分页标签 -->
		<tr valign="top">
			<td align="center" class="font3">
				<table width="100%" align="center" style="font-size: 13px;"
					class="digg">
					<tbody>
						<tr>

						</tr>
						<tr align="center">
							<td style="font-size: 13px;"></td>
						</tr>
						<tr>
							<td
								style="COLOR: #0061de; MARGIN-RIGHT: 3px; PADDING-TOP: 2px; TEXT-DECORATION: none" align="center">总共<font
								color="red">${number}</font>条公告，当前显示${minist}-${number}条公告。
							</td>
						</tr>
					</tbody>
				</table>
			</td>
		</tr>
	</table>
	<div style="height: 10px;"></div>
</body>
</html>