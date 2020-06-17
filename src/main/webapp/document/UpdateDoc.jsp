<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>人事管理系统 ——文档管理</title>
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
		<!-- 引入bootstrap样式 -->
		<link href="../static/bootstrap-3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
	   <link href="http://libs.baidu.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet">
	   <script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
	   <script src="http://libs.baidu.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>
		<script src="../static/bootstrap-3.3.7/dist/js/bootstrap.min.js"></script>
		<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
		<script type="text/javascript">

			function submit(){
					var errorMsg='';
					var title=document.getElementById("title").value;
					var content=document.getElementById("content").value;
					var introduction=document.getElementById("introduction").value;
					var id=document.getElementById("content").getAttribute("name");
					title=title.trim()
					content=content.trim();
					if(title==''){
						errorMsg="标题不能为空";
					}else if(content==''){
						errorMsg="内容不能为空";
					}else if(introduction==''){
						errorMsg="介绍不能为空";
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
						var opt4 = document.createElement("textarea");
						opt4.name="introduction";
						opt4.value=introduction;
						temp.appendChild(opt4);
						document.body.appendChild(temp);
						temp.submit(); 
						return;  
					}

			    }

		    function back(){
		    	var temp = document.createElement("form");
		    	temp.action = "http://localhost:8080/staffhome/selectAllAnnoucement";
		    	temp.method = "post";
		    	temp.style.display = "none";
		    	document.body.appendChild(temp);
		    	temp.submit(); 
		    	return;
			}
		</script>
	</head>
	<body>
	
		 <!-- 请求异常错误  -->
		<table width="100%" height="90%" border="0" cellpadding="10" cellspacing="0" class="main_tabbor">
		  	<tr valign="top">
			    <td>
			   <form action="/staffhome/document/updateDoc" method="post" enctype="multipart/form-data">
				  <!-- 隐藏表单，flag表示添加标记 -->
    	 			<input type="hidden" name="flag" value="2">
    	 			<input type="hidden" name="id" value="${document.id }">
    	 			<input type="hidden" name="filename" value="${document.filename }">
    	 			<input type="hidden" name="create_date" value="${document.create_date }">
    	 			<input type="hidden" name="user_id" value="${document.user_id }">
				  <table width="100%" border="0" cellpadding="0" cellspacing="10" class="main_tab">
				  		<tr height="20">
				  		</tr>
					    <tr><td class="font3 fftd" align="center">
					               文档标题：<input type="text" name="title" size="30" id="title" value="${document.title}"/>
					    	  <span style="color: #ff0000;"></span>
					    	</td>
					    </tr>
						<tr><td class="main_tdbor"></td></tr>
						<tr height="20">
				  		</tr>
					
						
						<tr><td class="font3 fftd" align="center">文档介绍：<br/>
							<textarea name="remark" cols="88" rows="11" id="remark" >${document.remark}</textarea>
						</td></tr>
						<tr><td class="main_tdbor"></td></tr>
						<tr height="20">
				  		</tr>
						
						<tr><td class="font3 fftd" align="center">
								<input type="button" class="btn btn-success " onclick="submit()" value="确认修改" style="margin-right:30">
								<input type="button" class="btn btn-default " onclick="back()" value="取消修改">
						</td></tr>
						<tr><td class="main_tdbor"></td></tr>
					
				  </table>
				  </form>
				  
				</td>
		  	</tr>
		</table>
		<div style="height:10px;"></div>
	</body>
</html>