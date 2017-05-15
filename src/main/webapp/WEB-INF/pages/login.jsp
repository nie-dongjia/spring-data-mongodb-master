<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>登录</title>
<meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <!-- Bootstrap 3.3.5 -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/AdminLTE-2.3.11/bootstrap/css/bootstrap.css">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/font-awesome.min.css">
    <!-- Ionicons -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/ionicons.min.css">
    <!-- Theme style -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/AdminLTE-2.3.11/dist/css/AdminLTE.min.css">
    <!-- iCheck -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/AdminLTE-2.3.11/plugins/iCheck/square/blue.css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
        <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
 <body class="hold-transition login-page">
    <div class="login-box">
      <div class="login-logo">
      	<b>**************</b><br/>**系统
      </div><!-- /.login-logo -->
      <div class="login-box-body">
        <p class="login-box-msg">登录****帐号</p>
        	<form id="loginForm">
	          <div class="form-group has-feedback">
	            <input type="text" class="form-control" placeholder="帐号" name="loginName" id="loginName">
	            <span class="glyphicon glyphicon-user form-control-feedback"></span>
	          </div>
	          <div class="form-group has-feedback">
	            <input type="password" class="form-control" placeholder="密码" name=password id="password">
	            <span class="glyphicon glyphicon-lock form-control-feedback"></span>
	          </div>
	          <div class="row">
	            <div class="col-xs-8">
	              
	            </div><!-- /.col -->
	            <div class="col-xs-4">
	              <button type="submit"  class="btn btn-primary btn-block btn-flat" id="loginBtn">登 录</button>
	            </div><!-- /.col -->
	          </div>
	          <div class="form-group has-feedback">
	            
	          </div>
	           <div class="row">
	            <div class="col-xs-8">
	            </div><!-- /.col -->
	            <div class="col-xs-4 text-right">
	             <!--  <a>忘记密码？</a> -->
	            </div><!-- /.col -->
	          </div>
          </form>
      </div><!-- /.login-box-body -->
    </div>
    

    
    <!-- /.login-box -->
<!-- jQuery 2.1.4 -->
<script src="${pageContext.request.contextPath}/resources/AdminLTE-2.3.11/plugins/jQuery/jQuery-2.1.4.min.js"></script>
<!-- Bootstrap 3.3.5 -->
<script src="${pageContext.request.contextPath}/resources/AdminLTE-2.3.11/bootstrap/js/bootstrap.min.js"></script>
<!-- iCheck -->
<script src="${pageContext.request.contextPath}/resources/AdminLTE-2.3.11/plugins/iCheck/icheck.min.js"></script>	
<!-- jquery.validate -->
<script src="${pageContext.request.contextPath}/resources/js/jquery.validate.min.js"></script>
<script>
  $(function () {
    $('input').iCheck({
      checkboxClass: 'icheckbox_square-blue',
      radioClass: 'iradio_square-blue',
      increaseArea: '20%' // optional
    });
    
    $( "#loginForm" ).validate( {
    	rules: {
    		loginName: {
				required: true,
				minlength: 3
			},
			password: {
				required: true,
				minlength:6
			}
    	}
    ,
	messages: {
		loginName: {
			required: "请输入帐号！",
			minlength: "至少输入3位帐号！"
		},
		password: {
			required: "请输入密码！",
			minlength: "至少输入6位密码"
		}
	},
	errorElement: "em",
	errorPlacement: function ( error, element ) {
		error.addClass( "text-red" );
		if ( element.prop( "type" ) === "checkbox" ) {
			error.insertAfter( element.parent( "label" ) );
		} else {
			error.insertAfter( element );
		}
	},
	submitHandler:function(){
        var loginName = $('#loginName').val();
		var password = $('#password').val();
		$.ajax({
			type : 'post',
			url : '${pageContext.request.contextPath}/logon/logon_judge.do',
			data : {
				"loginName" : loginName,
				"password" : password
			},
			success : function(data) {
				if (data.results == 'success') {
					document.location.href = "${pageContext.request.contextPath}/imanager/main.do";
				} else {
					Alert({
					    msg: data.description,
					    onOk: function(){
					    	$('#password').val("");
					    }
					}); 
				}
			}
		});
        
    }    
    });
	});
</script>
</body>
</html>