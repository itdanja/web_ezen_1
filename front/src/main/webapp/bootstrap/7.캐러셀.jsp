<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>


	
	<style type="text/css">
	
		.carousel-item{
			width : 1110px;
			height: 580px;
		}
		
	</style>

</head>
<body>

	<%@include file="1.부트스트랩시작.jsp" %> <!-- 부트스트랩 css, js -->
	
	<h3> 이미지 슬라이드 [ 캐러셀 ] </h3>
	<div class="container">	
	
		<div id="carouselcontents" class="carousel slide" data-ride="carousel" data-interval="1000">
			<!-- carousel slide : 이미지 슬라이드   	data-interval : 슬라이드 전환 초[1000/1]   -->
			
			<ol class="carousel-indicators">	<!-- carousel-indicators : 현재 슬라이드 위치  -->
				<li data-target="#carouselcontents" data-slide-to="0" class="active"></li>
				<li data-target="#carouselcontents" data-slide-to="1" ></li>
				<li data-target="#carouselcontents" data-slide-to="2" ></li>
			</ol>
			
			<div class="carousel-item active">	<!-- 슬라이드내 아이템 -->
				<img src="나이키.png" alt="첫번째 슬라이드">
				<div class="carousel-caption"> <!-- 이미지 레이블 -->
					<h3> 강아지 </h3>
					<p> 안녕하세요 강아지 이미지 입니다 </p>
				</div>
			</div>
			<div class="carousel-item">	<img src="나이키.png" alt="두번째 슬라이드">	</div>
			<div class="carousel-item">	<img src="나이키.png" alt="세번째 슬라이드">	</div> 
			
			<!-- 이동 버튼 -->
			<a class="carousel-control-prev" href="#carouselcontents" data-slide="prev">	<!-- 이전 이미지 이동 버튼 -->
				<span class="carousel-control-prev-icon"></span>	<!-- 아이콘 -->
			</a>
			<a class="carousel-control-next" href="#carouselcontents" data-slide="next">	<!-- 다음 이미지 이동 버튼 -->
				<span class="carousel-control-next-icon"></span>	<!-- 아이콘 -->
			</a>
			
		</div>
		
	</div>

</body>
</html>



