<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>人事管理系统——添加部门</title>
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
<!-- <script type="text/javascript"> -->
<!-- // 	function submit() { -->
<!-- // 		/** 部门表单提交 */ -->
<!-- // 		//$("#deptForm").submit(function(){ -->
<!-- // 		var name = $("#name"); -->
<!-- // 		var info = $("#info"); -->
<!-- // 		var manager_id = $("#manager_id"); -->
<!-- // 		var msg = ""; -->
<!-- // 		if ($.trim(name.val()) == "") { -->
<!-- // 			msg = "部门名称不能为空！"; -->
<!-- // 			name.focus(); -->
<!-- // 		} else if ($.trim(info.val()) == "") { -->
<!-- // 			msg = "详细描述不能为空！"; -->
<!-- // 			info.focus(); -->
<!-- // 		} else if ($.trim(manager_id.val()) == "") { -->
<!-- // 			msg = "主管人ID不能为空！"; -->
<!-- // 			info.focus(); -->
<!-- // 		} -->
<!-- // 		if (msg != "") { -->
<!-- // 			$.ligerDialog.error(msg); -->
<!-- // 			return false; -->
<!-- // 		} else { -->
<!-- // 			window.location.href = 'department/addDep' -->
<!-- // 			return true; -->

<!-- // 		} -->
<!-- // 		//$("#deptForm").submit(); -->
<!-- // 		//}); -->
<!-- // 	} -->
<!-- </script> -->
</head>
<body>
	<table width="100%" border="0" cellpadding="0" cellspacing="0">
		<tr>
			<td height="10"></td>
		</tr>
		<tr>

			<td class="main_locbg font2">&nbsp;&nbsp;&nbsp;&nbsp;当前位置：部门管理
				&gt; 添加部门</td>
			<td width="15" height="32"><img
				src="../images/main_locright.gif" width="15" height="32"></td>
		</tr>
	</table>
	<table width="100%" height="90%" border="0" cellpadding="5"
		cellspacing="0" class="main_tabbor">
		<tr valign="top">
			<td>
				<!-- 隐藏表单，flag表示添加标记 --> <input type="hidden" name="flag" value="2">
				<table width="100%" border="0" cellpadding="0" cellspacing="10"
					class="main_tab">
					<tr>
						<td class="font3 fftd">
							<table>
								<tr>

									<form action="/staffhome/department/addDep" method="post">
										<td class="font3 fftd">部门名称：<input required="required" type="text"
											name="name" id="name" size="20" /></td>
										<td class="font3 fftd">详细描述：<input required="required" type="text"
											name="info" id="info" size="20" /></td>
										<td class="font3 fftd">主管人ID：<input required="required" type="text"
											name="manager_id" id="manager_id" size="20" /></td>
										<tr>

										</tr>
									<td align="left" class="fftd"><input type="submit"
										value="添加 ">&nbsp;&nbsp;<input type="reset"
										value="取消 "></td>
									</form>
								</tr>

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