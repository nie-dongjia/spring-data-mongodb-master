<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta content="IE=edge" http-equiv="X-UA-Compatible">
<meta http-equiv="pragma" content="no-cache"> 
<meta http-equiv="cache-control" content="no-cache"> 
<meta http-equiv="expires" content="0">  
<title>难忘后台管理</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/AdminLTE-2.3.11/bootstrap/css/bootstrap.css">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/font-awesome.min.css">
    <!-- Ionicons -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/ionicons.min.css">
    <!-- Theme style -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/AdminLTE-2.3.11/dist/css/AdminLTE.min.css">
    <!-- AdminLTE Skins. Choose a skin from the css/skins
         folder instead of downloading all of them to reduce the load. -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/AdminLTE-2.3.11/dist/css/skins/_all-skins.min.css">
    <!-- iCheck -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/AdminLTE-2.3.11/plugins/iCheck/flat/blue.css">
    <!-- Morris chart -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/AdminLTE-2.3.11/plugins/morris/morris.css">
    <!-- jvectormap -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/adminLTE/2.3.0/plugins/jvectormap/jquery-jvectormap-1.2.2.css">
    <!-- Date Picker -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/adminLTE/2.3.0/plugins/datepicker/datepicker3.css">
    <!-- Daterange picker -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/adminLTE/2.3.0/plugins/daterangepicker/daterangepicker-bs3.css">
    <!-- bootstrap wysihtml5 - text editor -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/adminLTE/2.3.0/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">
 	<!-- DataTables -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/adminLTE/2.3.0/plugins/datatables/dataTables.bootstrap.css">
  	<!-- 全局自定义CSS -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/system-common.css">
    <!--  bootstrap-treeview  -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap-treeview.min.css">
    <!-- cropper -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/cropper/cropper.min.css"/>

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
        <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  
 	
  </head>
<body class="hold-transition skin-blue sidebar-mini">
	<div class="wrapper">
		<%@ include file="/WEB-INF/pages/layout/header.jsp"%>
		<%@ include file="/WEB-INF/pages/layout/left.jsp"%>
		<%@ include file="/WEB-INF/pages/layout/content.jsp"%>
		<%@ include file="/WEB-INF/pages/layout/footer.jsp"%>
	</div><!-- ./wrapper -->	
 <!-- jQuery 2.1.4 -->
    <script src="${pageContext.request.contextPath}/adminLTE/2.3.0/plugins/jQuery/jQuery-2.1.4.min.js"></script>
    <!-- jQuery UI 1.11.4 -->
    <script src="${pageContext.request.contextPath}/js/jquery-ui.min.js"></script>
    <!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
    <script>
      $.widget.bridge('uibutton', $.ui.button);
      $.ajaxSetup({cache:false});
    </script>
    <!-- Bootstrap 3.3.5 -->
    <script src="${pageContext.request.contextPath}/adminLTE/2.3.0/bootstrap/js/bootstrap.min.js"></script>
    <!-- Morris.js charts -->
    <script src="${pageContext.request.contextPath}/js/raphael-min.js"></script>
    <script src="${pageContext.request.contextPath}/adminLTE/2.3.0/plugins/morris/morris.min.js"></script>
    <!-- Sparkline -->
    <script src="${pageContext.request.contextPath}/adminLTE/2.3.0/plugins/sparkline/jquery.sparkline.min.js"></script>
    <!-- jvectormap -->
    <script src="${pageContext.request.contextPath}/adminLTE/2.3.0/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
    <script src="${pageContext.request.contextPath}/adminLTE/2.3.0/plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
    <!-- jQuery Knob Chart -->
    <script src="${pageContext.request.contextPath}/adminLTE/2.3.0/plugins/knob/jquery.knob.js"></script>
    <!-- daterangepicker -->
    <script src="${pageContext.request.contextPath}/js/moment.min.js"></script>
    <script src="${pageContext.request.contextPath}/adminLTE/2.3.0/plugins/daterangepicker/daterangepicker.js"></script>
    <!-- datepicker -->
    <script src="${pageContext.request.contextPath}/adminLTE/2.3.0/plugins/datepicker/bootstrap-datepicker.js"></script>
    <!-- Bootstrap WYSIHTML5 -->
    <script src="${pageContext.request.contextPath}/adminLTE/2.3.0/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
    <!-- Slimscroll -->
    <script src="${pageContext.request.contextPath}/adminLTE/2.3.0/plugins/slimScroll/jquery.slimscroll.min.js"></script>
    <!-- FastClick -->
    <script src="${pageContext.request.contextPath}/adminLTE/2.3.0/plugins/fastclick/fastclick.min.js"></script>
    <!-- AdminLTE App -->
    <script src="${pageContext.request.contextPath}/adminLTE/2.3.0/dist/js/app.min.js"></script>
      <!-- DataTables -->
    <script src="${pageContext.request.contextPath}/adminLTE/2.3.0/plugins/datatables/jquery.dataTables.min.js"></script>
    <script src="${pageContext.request.contextPath}/adminLTE/2.3.0/plugins/datatables/dataTables.bootstrap.min.js"></script>
     <!-- SlimScroll -->
    <script src="${pageContext.request.contextPath}/adminLTE/2.3.0/plugins/slimScroll/jquery.slimscroll.min.js"></script>
    <!-- FastClick -->
    <script src="${pageContext.request.contextPath}/adminLTE/2.3.0/plugins/fastclick/fastclick.min.js"></script>
    <!-- 全局封装相关组件 -->
    <script src="${pageContext.request.contextPath}/js/common.js"></script>
    <!-- jquery.validate -->
	<script src="${pageContext.request.contextPath}/js/jquery.validate.min.js"></script>	
	<!-- bootstrap-treeview.min.js -->
	<script src="${pageContext.request.contextPath}/js/bootstrap-treeview.min.js"></script>	
	<!-- cropper -->
	<script src="${pageContext.request.contextPath}/js/cropper/cropper.min.js"></script>

	<!-- 系统全局控制跳转 -->
	<script>
	function openUrl(url,node) {
		var contentPath = '${pageContext.request.contextPath}';
		url =contentPath + url;
		// load 加载 
		$("#mainContent").load(url); 
		 if(node!=undefined && node.parentNode.nodeName=="LI"){
			 var ul = node.parentNode.parentNode;
			 var li = ul.getElementsByTagName("li");
			 for (j = 0; j < li.length; j++) {
					li[j].className = ""
				}
			 node.parentNode.className='active';
		} 
	}
	$(document).ready(function() { 
		$("#mainContent").load("${pageContext.request.contextPath}/userinfo/userinfo_center.do"); 
	});
	</script>	
	<script type="text/javascript">
	// 初始化全局 js 参数
	var currentUserID = '${currentUser.id}';  // 用户id  
	</script>	
</body>
</html>