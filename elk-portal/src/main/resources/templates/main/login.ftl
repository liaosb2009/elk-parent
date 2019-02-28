<html lang="zh-CN">
  <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="keys" content="">
    <meta name="author" content="">
	<link rel="stylesheet" href="${APP_PATH}/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" href="${APP_PATH}/css/font-awesome.min.css">
	<link rel="stylesheet" href="${APP_PATH}/css/login.css">
	<style>

	</style>
  </head>
  <body>
    <nav  class="navbar navbar-inverse navbar-fixed-top" role="navigation">
      <div   class="container">
        <div class="navbar-header">
          <div><img src="${APP_PATH}/img/timg3.gif" height="50px" width="150" style="float:left;margin-top:3px"><a class="navbar-brand"  style="font-size:35px;margin-left: 10px;margin-top:3px" href="#"> 态势感知+电商+设备服务系统</a></div>
        </div>
      </div>
    </nav>

    <div  class="container">

      <form class="form-signin" role="form">
        <h2 class="form-signin-heading"><i class="glyphicon glyphicon-user"></i>用户登录</h2>
		  <div class="form-group has-success has-feedback">
			<input type="text" class="form-control" id="floginacct" placeholder="请输入登录账号" autofocus>
			<span class="glyphicon glyphicon-ok form-control-feedback"></span>
		  </div>
		  <div class="form-group has-success has-feedback">
			<input type="password" class="form-control" id="fuserpswd" placeholder="请输入登录密码" style="margin-top:10px;">
			<span class="glyphicon glyphicon-lock form-control-feedback"></span>
		  </div>
       <!--  <div class="checkbox">
          <label>
            <input type="checkbox" id="remeber" name="remeber" onclick="RemeberBtn()" value="remember-me">记住我
          </label>
        </div> -->
        <a class="btn btn-lg btn-success btn-block" id="loginBtn" name="loginBtn" ><i class="glyphicon glyphicon-log-in">登录</i></a>
      </form>
    
    </div>
    <script src="${APP_PATH}/jquery/jquery-2.1.1.min.js"></script>
    <script src="${APP_PATH}/bootstrap/js/bootstrap.min.js"></script>
    <script src="${APP_PATH}/layer/layer.js"></script>
    <script type="text/javascript">
 	
 	
 	// 初始化一个 WebSocket 对象
		/*var ws = new WebSocket("ws://localhost:9998/echo");

			// 建立 web socket 连接成功触发事件
			ws.onopen = function () {
			  // 使用 send() 方法发送数据
			  ws.send("发送数据");
			  alert("数据发送中...");
			};
			
			// 接收服务端数据时触发事件
			ws.onmessage = function (evt) {
			  var received_msg = evt.data;
			  alert("数据已接收...");
			};
			
			// 断开 web socket 连接成功触发事件
			ws.onclose = function () {
			  alert("连接已关闭...");
			};*/
    
    	 $("#loginBtn").click(function(){
    	    	var floginacct = $("#floginacct");
    	    	if ( floginacct.val() == "" ) {
    	    		//alert("登陆账号不能为空，请输入");
    	    		layer.msg("登陆账号不能为空，请输入", {time:1000, icon:5, shift:6}, function(){
    	        		floginacct.focus();
    	    		});
    	    		return;
    	    	}
    	    	
    	    	
    	    	var fuserpswd = $("#fuserpswd");
    	    	if ( fuserpswd.val() == "" ) {
    	    		//alert("登陆密码不能为空，请输入");
    	    		layer.msg("登陆密码不能为空，请输入", {time:1000, icon:5, shift:6}, function(){
    	    			fuserpswd.focus();
    	    		});
    	    		return;
    	    	}
    	    	var loadingIndex = -1;
    	    	var paramObj = {
    	    		url  : "${APP_PATH}/main/doLogin",
    	    		type : "POST",
    	    		data : {
    	    			"name" : floginacct.val(),
    	    			"password"  : fuserpswd.val()
    	    		},
    	    		beforeSend : function(){
    	    			//loadingIndex = layer.msg('数据处理中', {icon: 16});
    	    			loadingIndex = layer.load(2, {time: 10*1000});
    	    		},
    	    		success : function(result) {
    	    			layer.close(loadingIndex);
    	    			if ( result.success ) {
    	    				layer.msg(result.error, {time:1000, icon:6, shift:6}, function(){
    	    					window.location.href = "${APP_PATH}/main/getMain";
    	    	    		});
    	    			} else {
    	    	    		layer.msg(result.error, {time:1000, icon:5, shift:6}, function(){
    	    	    			//fuserpswd.focus();
    	    	    		});
    	    			}
    	    		}
    	    	};
    	    	$.ajax(paramObj);
    	    });

    
    </script>
  </body>
</html>