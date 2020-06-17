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
	<form action="/staffhome/user/addEmp" method="post" style="margin:30px;">
		用户名：<input style="margin-top:30px; margin-right:30px;" required="required" type="text" name="name" id="name" size="20" />
		密码：<input style="margin-top:30px; margin-right:30px;" required="required" type="password" name="password" id="password" size="20" />
		对应员工：<select name="emp_id" id="emp_id" style="margin-top: 30px; margin-right: 30px;">
			<option>----请选择----</option>
			<c:forEach items="${emp}" var="empl">
				<option value="${empl.id}">${empl.name}</option>
			</c:forEach>
			</select> <br/>
		<tr>
		

		</tr>
		<td align="left"><input style="margin-top: 30px;" type="submit" value="添加 ">&nbsp;&nbsp;<input
			type="reset" value="重置"></td>
	</form>
</body>
</html>