<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加用户</title>
</head>
<body>
	<form id="UserForm" name="UserForm" action="" method="POST">
		<table border="1" style="width: 85%; border:black;">
			<tr>
				<th style="width: 5%;">选择</th>
				<th style="width: 10%;">用户名</th>
				<th style="width: 5%;">密码</th>
				<th style="width: 5%;">状态</th>
				<th style="width: 10%;">入职时间</th>
				<th style="width: 10%;">对应员工</th>
			</tr>
			<c:forEach items="${allUser}" var="user">
				<tr>
					<th><input type="radio" name="id" value="${user.id}"></th>
					<th>${user.name}</th>
					<th>${user.password}</th>
					<th>${user.state}</th>
					<th>${user.creation_time}</th>
					<th>${user.emp_name}</th>
				</tr>
			</c:forEach>
		</table>
			<input type="button" id="deleteBtn" style="margin: 10px;" value="删除用户" onclick="dele()">
			<input type="button" id="changeBtn" style="margin: 10px;" value="修改用户" onclick="change()">
			<input type="button" id="changeBtn" style="margin: 10px;" value="冻结/解冻" onclick="freeze()">
	</form>
	<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>

	<script>
	function dele(){
		document.getElementById("UserForm").action="/staffhome/user/deleteConfirm";
		document.getElementById("UserForm").submit();
	}

	function change(){
		document.getElementById("UserForm").action="/staffhome/user/changeEmp";
		document.getElementById("UserForm").submit();
	}
	function freeze(){
		document.getElementById("UserForm").action="/staffhome/user/freezeEmp";
		document.getElementById("UserForm").submit();
	}
	</script>


</body>
</html>
