<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

	<style type="text/css">
		/* 기본값 설정 */
		*{ margin: 0; padding: 0; 
			box-sizing: border-box; font-family: "돋움" }
		li{ list-style-type: none;}
		header{ position: relative; height: 70px; }
		header .logo{ position: absolute; top:25px; left: 20px;}
		header .logo span{ color: blue; font-weight: bold; }
		header .menu{ position: absolute; top:25px; right: 20px; }
		header .menu li{ 
			display: inline; margin-left: 20px;
		}
		a{ text-decoration: none; color: black;}
		.box{ position: relative; }
	</style>	

</head>
<body>
	<header>
		<div class="box">
			<h1 class="logo"> <a href="index.jsp"><span>THE</span> 스튜디오</a> </h1>
			<ul class="menu">
				<li><a href="#"> 스튜디오 소개 </a>  </li>
				<li><a href="#">  스튜디오 예약  </a> </li>
				<li><a href="#">  블로그  </a> </li>
				<li><a href="#">  포토 갤러리  </a> </li>
				<li><a href="#">  오시는 길  </a> </li>
			</ul>
		</div>
	</header>
</body>
</html>











