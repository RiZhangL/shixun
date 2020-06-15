<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>人事管理系统——添加员工</title>
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

			<td class="main_locbg font2">&nbsp;&nbsp;&nbsp;&nbsp;当前位置：员工管理
				&gt; 添加员工</td>
			
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

									<form action="/staffhome/employee/addEmp" method="post">
										
										<tr>
											<td class="font3 fftd">姓名：<input required="required" type="text"
											name="name" id="name" size="20" /></td>
										</tr>
										<tr>
											<td class="font3 fftd">性别：<input required="required" type="text"
											name="gender" id="gender" size="20" /></td>
										</tr>
										<tr>
											<td class="font3 fftd">生日：<input required="required" type="text"
											name="birthday" id="birthday" size="20" /></td>
										</tr>
										<tr>
											<td class="font3 fftd">地址：<input required="required" type="text"
											name="address" id="address" size="20" /></td>
										</tr>
										<tr>
											<td class="font3 fftd">电话：<input required="required" type="text"
											name="phone" id="phone" size="20" /></td>
										</tr>
										<tr>
											<td class="font3 fftd">部门：<input required="required" type="text"
											name="department" id="department" size="20" /></td>
										</tr>
										<tr>
											<td class="font3 fftd">职位：<input required="required" type="text"
											name="position" id="position" size="20" /></td>
										</tr>
										<tr>
											<td class="font3 fftd">状态：<input required="required" type="text"
											name="state" id="state" size="20" /></td>
										</tr>
										<tr>
											<td class="font3 fftd">创建日期：<input required="required" type="text"
											name="creation_time" id="creation_time" size="20" /></td>
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