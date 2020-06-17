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
<title>修改用户</title>
</head>
<body>
	<form action="" name="changeEmp" id="changeEmp" method="post" style="margin:30px;">
		用户名：<input style="margin-top:30px; margin-right:30px;" required="required" type="text" name="name" id="name" size="20" value="${user.name}"/>
		密码：<input style="margin-top:30px; margin-right:30px;" required="required" type="text" name="password" id="password" size="20" value="${user.password}"/>
		对应员工：<select name="emp_id" id="emp_id" style="margin-top: 30px; margin-right: 30px;">
			<option>----请选择----</option>
			<c:forEach items="${emp}" var="empl">
				<option value="${empl.id}" ${user.emp_id==empl.id?'selected':''}>${empl.name}</option>
			</c:forEach>
			</select> <br/>
		<input type="hidden" name="id" id="id" value="${user.id}"/><br/>
		<input type="button" value="修改" onclick="change()">
		<input type="button" value="取消" onclick="cancel()">
	</form>
	<script>
		function change(){
			document.getElementById("changeEmp").action="/staffhome/user/changeSucceed";
			document.getElementById("changeEmp").submit();
		}
		function cancel(){
			document.getElementById("changeEmp").action="/staffhome/user/getAllEmp";
			document.getElementById("changeEmp").submit();
		}
	</script>
</body>
</html>