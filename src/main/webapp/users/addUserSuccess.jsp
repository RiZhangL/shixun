<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加完成</title>
</head>
<body>
	<t1>已为员工${emp_name}成功添加新账户用户： ${name}</t1>
	
		<a href="<%=basePath%>./user/getDep">
		<button >确定</button>
		</a>
	
	
	
	
</body>
</html>