<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>人事管理系统——修改部门</title>
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
	<table width="100%" border="0" cellpadding="0" cellspacing="0">
		<tr>
			<td height="10"></td>
		</tr>
		<tr>
			<td width="15" height="32"><img src="../images/main_locleft.gif"
				width="15" height="32"></td>
			<td class="main_locbg font2">当前位置：部门管理 &gt; 修改部门</td>
			<td width="15" height="32"><img
				src="../images/main_locright.gif" width="15" height="32"></td>
		</tr>
	</table>
	<table width="100%" height="90%" border="0" cellpadding="5"
		cellspacing="0" class="main_tabbor">
		<tr valign="top">
			<td>
				<!-- 隐藏表单，flag表示添加标记 --> <input type="hidden" name="flag" value="2">
				<input type="hidden" name="id" value="${dept.id}">
				<table width="100%" border="0" cellpadding="0" cellspacing="10"
					class="main_tab">
					<tr>
						<td class="font3 fftd">
							<table>
								<form action="/staffhome/department/updateDep" method="post">
								<tr>
									<td class="font3 fftd">部门名称：<input required="required"
										type="text" name="name" id="name" size="20" value="${name}"/></td>
									<td class="font3 fftd">详细描述：<input required="required"
										type="text" name="info" id="info" size="20" value="${info}"/></td>
									<td class="font3 fftd">主管人：<input required="required"
										type="text" name="manager_id" size="20" value="${manager_id}" /></td>
									<input type="hidden" name="id" id="id" value="${id}"
										size="20" />
								</tr>
								<tr>
									<td align="left" class="fftd">
									<input type="submit"
										onclick="submit()" value="修改">&nbsp;&nbsp;<input
										type="reset" value="取消 "></td>
								</tr>
								</form>
							</table>
						</td>
					</tr>
					<tr>
						<td class="main_tdbor"></td>
					</tr>


				</table>

			</td>
		</tr>
	</table>
	<div style="height: 10px;"></div>
</body>
</html>