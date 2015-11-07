<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>网站首页</title>
</head>
<body>
	<h1>网站首页</h1>
	<fieldset>
		<legend>用户登陆</legend>
		<form action="login" method="post">
			<label for="username">UserName:</label>
			<input type="text" id="username" name="username">
			<br>
			<label for="password">PassWord:</label>
			<input type="password" id="password" name="password">
			<br>
			<input type="submit" value="登陆">
		</form>
	</fieldset>
</body>
</html>