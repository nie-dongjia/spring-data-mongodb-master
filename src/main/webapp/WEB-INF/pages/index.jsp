<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-1.12.2.min.js" ></script>

<title>首页</title>
</head>
<body>


<h1>测试获取Json</h1>
<button onclick="getJson()">测试3</button>
<script type="text/javascript">
function getJson(){
 	 $.post (
 			{
 		url : '${pageContext.request.contextPath}/web/user_info/findAll.do',
 		data:{}, 
 		success:function(data){ 
 			alert(data);
			 }
		}); 
	/* 	
	$.ajax({
		type : "post",
		url : "${pageContext.request.contextPath}/web/user_info/findAll.do",
		success:function(data){ 
 			alert(data);
			 }
		}); */
}
</script>
</body>
</html>