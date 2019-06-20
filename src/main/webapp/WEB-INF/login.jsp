<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Feedit</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
body {
	font-family: Arial;
	font-size: 14px;
	background: #DAE2F8;  /* fallback for old browsers */
	background: -webkit-linear-gradient(to right, #D6A4A4, #DAE2F8);  /* Chrome 10-25, Safari 5.1-6 */
	background: linear-gradient(to right, #D6A4A4, #DAE2F8); /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */
}
input[type=text], input[type=password], input[type=username], input[type=email]
	{
	display: block;
	margin: auto;
	max-width: 20em;
	width: 50%;
	border: 1px solid #818181;
	padding: 5px;
}
button {
	background-color: #4B0082;
	color: yellow;
	display: block;
	margin: auto;
	max-width: 20em;
	width: 50%;
	border: 1px solid #818181;
	padding: 5px;
	border: 1px solid #818181;
	text-align: center;
}
div.wrapper {
	position: absolute;
	top:100;
	bottom: 0;
	left: 0;
	right: 0;
	margin: auto;
	width: 600px;
	height: 400px;
	text-align:center;
	vertical-align:middle;
}
}
</style>
</head>
<body>
<div id="top" style="position:fixed;width:100%;text-align:center;top:100;">
	<font size="30px" style="font-family:URW Chancery L, cursive;">Feedit</font>
</div>
	<div class="wrapper">
	<form method="post" action="/task/index.jsp">
		<input type="text" name="username" placeholder="Username"
			required class="form-control" /> <br/><input type="password" name="password"
			placeholder="Password" required class="form-control" /><br />
			<button name="Submit" value="Login" type="Submit"
				class="btn btn-primary">Login</button>
	</form>
	</div>
</body>
</html>

