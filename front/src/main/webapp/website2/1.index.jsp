<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

	<style type="text/css">
		*{ border:  solid 1px red;}
		header{ height: 150px;  }
		.box{ width: 1100px; margin: 0 auto; }
		#main_img{ height: 200px;}
		aside{ width: 200px; float:left; height: 300px;}
		#main{ width: 840px; float:right; height: 300px; }
		footer{ clear: both; height: 150px;}
	</style>













</head>
<body>
	<header>
		<div class="box">
			헤더
		</div>
	</header>
	
	<section id="main_img">
		메인 이미지
	</section>
	
	<div class="box">	
		<aside>
			사이드바
		</aside>
		<section id="main">
			메인 섹션
		</section>
	</div>
	
	<footer>
		<div class="box">
			푸터
		</div>	
	</footer>
</body>
</html>



