<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>${pageTitle}</title>
<link href="/css/bootstrap.css" rel="stylesheet">
<link href="/css/bootstrap-theme.css" rel="stylesheet">
</head>
<body>
	div class="main_panel">
	<div class="container">
		<div class="row">
			<div class="col-md-6">
				<font class="logo">${LOG Here!}</font>
			</div>
			<div id="navbar" class="navbar-collapse collapse">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="#"></a></li>
					<li><a href="#"></a></li>
					<li><a href="#"></a></li>
					<li><a href="#"></a></li>
				</ul>
			</div>
		</div>
	</div>
	<div class="container login_panel">
		<div class="panel">
			<div class="panel-heading">
				<center>
					<h3>Register</h3>
				</center>
			</div>

<!-- 			<div class="alert alert-danger alert-dismissible" role="alert"
				ng-if="msgs.length > 0">
				<span ng-repeat="msg in msgs"><label ng-if="msg.length>1"><span
						ng-bind="msg"></span></label><label ng-if="msg.length=1"><span
						ng-bind="msg[0]"></span></label><br /></span>
			</div> -->

			<div class="container">

				<form name="loginForm" class="form-horizontal" action="<%=path %>/userController/addUser.do">
					<div class="form-group">
						<div class="col-sm-8">
							<input class="form-control" name="emailAddress"  type="text" id="emailAddress"
								placeholder="Email Address">
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-8">
							<input class="form-control" name="userName" type="text" id="userName" placeholder="userName">
						</div>
					</div>

					<div class="form-group">
						<div class="col-sm-8">
							<input class="form-control"  type="password"
								id="password" name="password" placeholder="Password">
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-8">
							<input class="form-control"  type="password"
								id="passwordConform" name="password" placeholder="Password">
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-8" align="right">
							<button type="submit" class="btn btn-primary btn-lg outline">Create an account</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
	<script src="/js/bootstrap.js"></script>
</body>
</html>