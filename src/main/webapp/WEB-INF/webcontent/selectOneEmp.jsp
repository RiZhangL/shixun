<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>人事管理系统 ——员工管理</title>
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

</head>
<body>
	<!-- 导航 -->
	<table width="100%" border="0" cellpadding="0" cellspacing="0">
		<tr>
			<td height="10"></td>
		</tr>
		<tr>
			
			<td class="main_locbg font2">当前位置：员工管理 &gt; 员工查询</td>
			
	</table>

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
								<form action="/staffhome/employee/selectOneEmployee" method="post">
									<tr>
										<td class="font3">员工姓名：<input type="text" name="name">
											<input type="submit" value="搜索" />
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
				<table width="100%" border="1" cellpadding="5" cellspacing="0"
					style="border: #c2c6cc 1px solid; border-collapse: collapse;">
					<tbody>
						<tr class="main_trbg_tit" align="center"
							style="background-color: rgb(169, 169, 169);">

							<td>姓名</td>
							<td>部门</td>
							<td>电话</td>
							<td align="center">操作</td>

						</tr>
						<c:forEach items="${list}" var="item">
							<tr id="data_0" align="center" class="main_trbg"
								style="background-color: rgb(220, 220, 220);">

								<td><a
									href="OneEmployee?name=${item.name}&gender=${item.gender}&birthday=${item.birthday}&address=${item.address}
									&phone=${item.phone}&position=${item.position}&department=${item.department}
									&state=${item.state}&creation_time=${item.creation_time}" style='text-decoration: none;'>${item.name}</a></td>
								<td>${item.department}</td>
								<td>${item.phone}</td>
								<td align="center" width="130px;"
									style="background-color: rgb(220, 220, 220);"><a
									href="update?name=${item.name}&gender=${item.gender}&birthday=${item.birthday}
									&address=${item.address}&phone=${item.phone}&position=${item.position}
									&department=${item.department}&state=${item.state}&creation_time=${item.creation_time}&item=${item.id}"
									style='text-decoration: none;'>修改</a>&nbsp;<a
									href="deleteEmp?id=${item.id}" style='text-decoration: none;'>删除</a></td>

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
								style="COLOR: #0061de; MARGIN-RIGHT: 3px; PADDING-TOP: 2px; TEXT-DECORATION: none">总共<font
								color="red">${number}</font>条记录，当前显示${minist}-${number}条记录。
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