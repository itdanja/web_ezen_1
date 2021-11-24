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

		/* 그리드 */
		[class*="col_"]{ float: left; padding: 15px;  } 	/* 와일드카드 */
		.col_1{ width: 8.33%; }.col_2{ width: 16.66%;}.col_3{ width: 25%; }
		.col_4{ width: 33.33%;}.col_5{ width: 41.66%; }.col_6{ width: 50%; }
		.col_7{ width: 58.33%; }.col_8{ width: 66.66%; }.col_9{ width: 75%; }
		.col_10{ width: 83.33%; }.col_11{ width: 91.66%; }.col_12{ width: 100%; }
		/* 미디어 쿼리 */
		@media only screen and( min-width : 770px; )  { 		/* 테블릿 css */
			.col_m_1{ width: 8.33%; }.col_m_2{ width: 16.66%;}.col_m_3{ width: 25%; }
			.col_m_4{ width: 33.33%;}.col_m_5{ width: 41.66%; }.col_m_6{ width: 50%; }
			.col_m_7{ width: 58.33%; }.col_m_8{ width: 66.66%; }.col_m_9{ width: 75%; }
			.col_m_10{ width: 83.33%; }.col_m_11{ width: 91.66%; }.col_m_12{ width: 100%; }
			.box{ max-width: 1200px; margin: 0 auto; position: relative; }
		}
		@media only screen and( min-width : 1200px; ){ 			/* 데스크탑 css */
			.col_1{ width: 8.33%; }.col_2{ width: 16.66%;}.col_3{ width: 25%; }
			.col_4{ width: 33.33%;}.col_5{ width: 41.66%; }.col_6{ width: 50%; }
			.col_7{ width: 58.33%; }.col_8{ width: 66.66%; }.col_9{ width: 75%; }
			.col_10{ width: 83.33%; }.col_11{ width: 91.66%; }.col_12{ width: 100%; }
			.box{ max-width: 1200px; margin: 0 auto; position: relative; }	
		}
		
		
		
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











