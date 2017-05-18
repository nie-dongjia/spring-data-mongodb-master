<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <header class="main-header">
        <!-- Logo -->
        <a href="#" class="logo">
          <!-- mini logo for sidebar mini 50x50 pixels -->
          <span class="logo-mini"><b>难</b>忘</span>
          <!-- logo for regular state and mobile devices -->
          <span class="logo-lg"><b>难忘</b>后台管理</span>
        </a>
        <!-- Header Navbar: style can be found in header.less -->
        <nav class="navbar navbar-static-top" role="navigation">
          <!-- Sidebar toggle button-->
          <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
            <span class="sr-only">Toggle navigation</span>
          </a>
          <div class="navbar-custom-menu">
            <ul class="nav navbar-nav">
              <!-- User Account: style can be found in dropdown.less -->
              <li class="dropdown user user-menu">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                  <%-- <img src="${pageContext.request.contextPath}/${currentUser.iconPath}" class="user-image" alt="User Image"> --%>
                  <img src="${pageContext.request.contextPath}/${currentUser.iconPath}" class="user-image" alt="User Image" id="headPortrait">
                  <span class="hidden-xs">${currentUser.userName}</span>
                </a>
                <ul class="dropdown-menu">
                  <!-- User image -->
                  <li class="user-header">
                    <img src="${pageContext.request.contextPath}/${currentUser.iconPath}" class="img-circle" alt="User Image" id="dropdownHeadPortrait">
                    <p>
                      	${currentUser.userName} 
                    </p>
                  </li>
             
                  <!-- Menu Footer-->
                  <li class="user-footer">
                    <div class="pull-left">
                      <a href="#" onclick="openUrl('/userinfo/userinfo_center.do')" class="btn btn-default btn-flat">个人中心</a>
                    </div>
                    <div class="pull-right">
                      <a href="#" class="btn btn-default btn-flat" onclick="loginOut()">注销登录</a>
                    </div>
                  </li>
                </ul>
              </li>
            </ul>
          </div>
        </nav>
      </header>
<script type="text/javascript">

function refreshIconPath(){
	var iconpath;
	$.ajax({
		async:false,
		type : 'post',
		url : 	'${pageContext.request.contextPath}/file/getIconpath.do',
		success : function(result) {
			iconpath=result;
		}
	});
	return iconpath;
}



function loginOut(){
	$.ajax({
		type : 'get',
		url : 'login/loginOut.do',
		success : function(data) {
			if (data.results == 'success') {
				Alert({
				    msg: "注销成功",
				    onOk: function(){
				    	document.location.href ="${pageContext.request.contextPath}/main/main.do";
				    }
				});
				setTimeout(function(){
					document.location.href ="${pageContext.request.contextPath}/main/main.do";
				},3000);
			} else {
				Alert({
				    msg: "注销成功",
				    onOk: function(){
				    	document.location.href ="${pageContext.request.contextPath}/main/main.do";
				    }
				});
			}
		}
	});
}

</script>






