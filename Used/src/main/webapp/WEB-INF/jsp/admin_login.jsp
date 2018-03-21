<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Login</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<script type="application/x-javascript">
	
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 

</script>
<link href="${pageContext.request.contextPath }/resources/css/style.css"
	rel='stylesheet' type='text/css' />
<!--webfonts-->

<!--//webfonts-->
</head>
<body>
	<!-- <script>
		$(document).ready(function(c) {
			$('.close').on('click', function(c) {
				$('.login-form').fadeOut('slow', function(c) {
					$('.login-form').remove();
				});
			});
		});
	</script> -->
	<!--SIGN UP-->
	<h1>Login</h1>
	<div class="login-form">
		<div class="close"></div>
		<div class="head-info">
			<label class="lbl-1"> </label> <label class="lbl-2"> </label> <label
				class="lbl-3"> </label>
		</div>
		<div class="clear"></div>
		<div class="avtar">
			<img
				src="${pageContext.request.contextPath }/resources/images/login/avtar.png" />
		</div>
		<form method="post" action="login.do">
			<input type="text" class="text" name="username" value="username"
				onfocus="this.value = '';"
				onblur="if (this.value == '') {this.value = 'username';}">
			<div class="key">
				<input type="password" name="password" value="password"
					onfocus="this.value = '';"
					onblur="if (this.value == '') {this.value = 'password';}">
			</div>

			<div class="signin">
				<input type="submit" value="Login">
			</div>
		</form>
	</div>


</body>
</html>