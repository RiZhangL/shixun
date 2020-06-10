<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>人事管理系统 ——后台管理</title>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta http-equiv="pragma" content="no-cache" />
		<meta http-equiv="cache-control" content="no-cache" />
		<meta http-equiv="expires" content="0" />    
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3" />
		<meta http-equiv="description" content="This is my page" />
		<link href="../css/css.css" type="text/css" rel="stylesheet" />
		<link rel="stylesheet" type="text/css" href="../js/ligerUI/skins/Aqua/css/ligerui-dialog.css"/>
		<link href="../js/ligerUI/skins/ligerui-icons.css" rel="stylesheet" type="text/css" />
		<script type="text/javascript" src="../js/jquery-1.11.0.js"></script>
	    <script type="text/javascript" src="../js/jquery-migrate-1.2.1.js"></script>
		<script src="../js/ligerUI/js/core/base.js" type="text/javascript"></script>
		<script src="../js/ligerUI/js/plugins/ligerDrag.js" type="text/javascript"></script> 
		<script src="../js/ligerUI/js/plugins/ligerDialog.js" type="text/javascript"></script>
		<script src="../js/ligerUI/js/plugins/ligerResizable.js" type="text/javascript"></script>
		<link href="../css/pager.css" type="text/css" rel="stylesheet" />
		<script type="text/javascript">

			function submit(){
					var errorMsg='';
					var title=document.getElementById("title").value;
					var content=document.getElementById("content").value;
					var id=document.getElementById("content").getAttribute("name");
					title=title.trim()
					content=content.trim();
					if(title==''){
						errorMsg="标题不能为空";
					}else if(content==''){
						errorMsg="内容不能为空";
					}
					if(errorMsg!=''){
						alert(errorMsg);
						return ;
					}else{
  						var temp = document.createElement("form");
						temp.action = "http://localhost:8080/staffhome/updateAnnouncement2";
						temp.method = "post";
						temp.style.display = "none";
						var opt1 = document.createElement("textarea");
						opt1.name="title";
						opt1.value=title;
						temp.appendChild(opt1);
						var opt2 = document.createElement("textarea");
						opt2.name="content";
						opt2.value=content;
						temp.appendChild(opt2);
						var opt3 = document.createElement("textarea");
						opt3.name="id";
						opt3.value=id;
						temp.appendChild(opt3);
						document.body.appendChild(temp);
						temp.submit(); 
						return;  
					}

			    }
		</script>
	</head>
	<body>
	
		 <!-- 请求异常错误  -->
		<table width="100%" height="90%" border="0" cellpadding="10" cellspacing="0" class="main_tabbor">
		  	<tr valign="top">
			    <td>
			   
				  <!-- 隐藏表单，flag表示添加标记 -->
    	 			<input type="hidden" name="flag" value="2">
    	 			<input type="hidden" name="id" value="${notice.id }">
				  <table width="100%" border="0" cellpadding="0" cellspacing="10" class="main_tab">
					    <tr><td class="font3 fftd">
					                公告标题：<input type="text" name="title" size="30" id="title" value="${announcement.title}"/>
					    	  <span style="color: #ff0000;"></span>
					    	</td>
					    </tr>
						<tr><td class="main_tdbor"></td></tr>
						
						<tr><td class="font3 fftd">公告内容：<br/>
							<textarea name="${announcement.id}" cols="88" rows="11" id="content" >${announcement.content}</textarea>
						</td></tr>
						<tr><td class="main_tdbor"></td></tr>
						
						<tr><td class="font3 fftd">
								<input type="button" onclick="submit()" value="修改">
								<input type="reset" value="重置">
						</td></tr>
						<tr><td class="main_tdbor"></td></tr>
					
				  </table>
				  
				</td>
		  	</tr>
		</table>
		<div style="height:10px;"></div>
	</body>
</html>