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
<title>删除确认</title>
</head>
<body>
	是否确认删除员工${name}的账户${username}?<br/>
	<input type="hidden" id="id" name="id" value="${id}" >

	<form action="/staffhome/user/deleteEmp" id="deleteConfirm" mothed="POST">
		<input type="hidden" id="id" name="id" value="${id}" >
		<input type="submit" value="是" onclick="yes()">
		<input type="submit" value="否" style="margin:10px;" onclick="no()">
		
	</form>
	
	
	
	<script>
		function yes(){
			document.getElementById("deleteConfirm").action="/staffhome/user/deleteEmp";
			document.getElementById("deleteConfirm").submit();
		}

		function no(){
			document.getElementById("deleteConfirm").action="/staffhome/user/getAllEmp";
			document.getElementById("deleteConfirm").submit();
		}

	</script>
</body>
</html>