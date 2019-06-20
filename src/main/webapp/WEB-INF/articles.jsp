<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Feedit</title>
<link
	href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<style>
body {
	font-family: URW Chancery L, cursive;
	font-size: 20px;
	background: #DAE2F8; /* fallback for old browsers */
	background: -webkit-linear-gradient(to right, #D6A4A4, #DAE2F8);
	/* Chrome 10-25, Safari 5.1-6 */
	background: linear-gradient(to right, #D6A4A4, #DAE2F8);
	/* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */
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

a {
	color: #9400D3;
	font-size: 20px;
}

button {
	background-color: #4B0082;
	color: #9400D3;
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
	position: relative;
	bottom: 0;
	left: 0;
	right: 0;
	margin: auto;
	width: 600px;
	height: 100px;
	text-align: center;
	vertical-align: middle;
}

.glyphicon-lg {
	font-size: 4em
}

.info-block {
	margin-bottom: 25px;
	text-align: center;
	vertical-align: middle
}

.logoutLblPos{

   position:fixed;
   right:40px;
   top:5px;
   color:#9400D3
}

.info-block .square-box {
	width: 100px;
	min-height: 110px;
	margin-right: 22px;
	text-align: center !important;
	background-color: #676767;
	padding: 20px 0
}

.info-block.block-info {
	border-color: #20819e
}

.info-block.block-info .square-box {
	background-color: #20819e;
	color: #FFF
}

.clearfix {
	outline-width: 0;
}

.items {
	align: center;
	outline-width: 0;
}
</style>
</head>
</head>
<body>
	<sql:setDataSource var="myDatabase" driver="org.postgresql.Driver"
		url="jdbc:postgresql://localhost:5432/mydb" user="postgres"
		password="test" />

	<sql:query var="listOfArticles" dataSource="${myDatabase}">
        SELECT * FROM Article;
    </sql:query>
	<div class="container">
		<div class="row">
			<br />
			<div class="wrapper">
				<input type="search" class="form-control" id="input-search"
					placeholder="Search Articles...">
			</div>
			<div class="searchable-container" style="position: relative;">
				<c:forEach var="articleItem" items="${listOfArticles.rows}">
					<div class="items">
						<div class="info-block block-info clearfix">
							<h5>
								<a href="${articleItem.LinkToArticle}" target="_blank">${articleItem.Headline}</a>
							</h5>
							<span>Author: ${articleItem.FullAuthorName}</span>
						</div>
					</div>
				</c:forEach>
			</div>
		</div>
	</div>
	<form action="/task/logout" method="get" align="right">
		<label class="logoutLblPos">
			<button type="Submit"
				style="float: right; background-color: transparent; border-color: transparent"top:"0px";right:"0px">Logout</button>
		</label>
	</form>
</body>
<script>
	$(function() {
		$('#input-search').on('keyup', function() {
			var inputLength = $(this).val();
			if (inputLength.length >= 3) {
				var rex = new RegExp($(this).val(), 'i');
				$('.searchable-container .items').hide();
				$('.searchable-container .items').filter(function() {
					return rex.test($(this).text());
				}).show();
			} else {
				$('.searchable-container .items').show();
			}
		});

	});
</script>
</html>