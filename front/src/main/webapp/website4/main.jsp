<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
	
</head>
<body>

	<%@include file="header.jsp" %>
	
	<!-- 캐러셀 start -->
	<div id="carouselcontent" class="carousel slide" data-ride="carousel" data-interval="1000">
	
		<!-- 현재 슬라이드 위치 알려주는 리스트 -->
		<ol class="carousel-indicators">
			<li data-target="#carouselcontent" data-slide-to="0" class="active"></li>
			<li data-target="#carouselcontent" data-slide-to="1"></li>
			<li data-target="#carouselcontent" data-slide-to="2"></li>
			<li data-target="#carouselcontent" data-slide-to="3"></li>
		</ol>
		
		<!-- 캐러셀 이미지 넣기 -->
		<div class="carousel-inner">
			<div class="carousel-item active"><img src="img/mainimg1.jpg"></div>
			<div class="carousel-item"><img src="img/mainimg2.jpg"></div>
			<div class="carousel-item"><img src="img/mainimg3.jpg"></div>
			<div class="carousel-item"><img src="img/mainimg4.gif"></div>
		</div>
		
		<!-- 케러셀 이미지 이동 버튼 -->
		<a class="carousel-control-prev" href="#carouselcontent" data-slide="prov" >
			<span class="carousel-control-prev-icon"></span>
		</a>
		<a class="carousel-control-next" href="#carouselcontent" data-slide="next" >
			<span class="carousel-control-next-icon"></span>
		</a>
		
	</div>
	<!-- 캐러셀 end -->
	
	
	<hr> <!-- 구분선 -->
	<div class="container text-center">
		<h3> New ARRIVAL </h3>
		<P> 신상품 </P>
	</div>
	
	<!-- 아이템 : 제품 start -->
	<div class="container">	<!-- 박스권 -->
		<div class="row mb-2">	<!-- 가로 12 그리드 -->
		
			<div class="col-md-4 col-sm-6 my-5"> <!-- col-md-4 : 700~900	col-sm-6 : 500~700  my: 위아래 마진-->
				<div class="card"> <!-- 카드 -->
					<img class="card-img-top" src="img/item1.gif">	<!-- 카드 상단 이미지 -->
					<div class="card-body">	<!-- 카드 내용 -->
						<p class="card-text"> 엑티브 웰론 패딩 </p>
						<hr>
						<p class="item p-1">
							프리미엄 웰론충전재를 빵빵하게 채워넣은
							훌륭한 보온성의 트랜디한 패딩입니다. <br> <br>
						<span class="price mr-2">79,900원 </span>  75,900원 <br>
						
						<span class="badge badge-pill badge-warning my-2"> 주문폭주 </span>
						<span class="badge badge-pill badge-danger my-2"> 품절임박 </span>
						</p>
					</div>
				</div>
			</div>
			
			
			<div class="col-md-4 col-sm-6 my-5"> <!-- col-md-4 : 700~900	col-sm-6 : 500~700  my: 위아래 마진-->
				<div class="card"> <!-- 카드 -->
					<img class="card-img-top" src="img/item1.gif">	<!-- 카드 상단 이미지 -->
					<div class="card-body">	<!-- 카드 내용 -->
						<p class="card-text"> 엑티브 웰론 패딩 </p>
						<hr>
						<p class="item p-1">
							프리미엄 웰론충전재를 빵빵하게 채워넣은
							훌륭한 보온성의 트랜디한 패딩입니다. <br> <br>
						<span class="price mr-2">79,900원 </span>  75,900원 <br>
						
						<span class="badge badge-pill badge-warning my-2"> 주문폭주 </span>
						<span class="badge badge-pill badge-danger my-2"> 품절임박 </span>
						</p>
					</div>
				</div>
			</div>
			
			
			<div class="col-md-4 col-sm-6 my-5"> <!-- col-md-4 : 700~900	col-sm-6 : 500~700  my: 위아래 마진-->
				<div class="card"> <!-- 카드 -->
					<img class="card-img-top" src="img/item1.gif">	<!-- 카드 상단 이미지 -->
					<div class="card-body">	<!-- 카드 내용 -->
						<p class="card-text"> 엑티브 웰론 패딩 </p>
						<hr>
						<p class="item p-1">
							프리미엄 웰론충전재를 빵빵하게 채워넣은
							훌륭한 보온성의 트랜디한 패딩입니다. <br> <br>
						<span class="price mr-2">79,900원 </span>  75,900원 <br>
						
						<span class="badge badge-pill badge-warning my-2"> 주문폭주 </span>
						<span class="badge badge-pill badge-danger my-2"> 품절임박 </span>
						</p>
					</div>
				</div>
			</div>
			
			
			<div class="col-md-4 col-sm-6 my-5"> <!-- col-md-4 : 700~900	col-sm-6 : 500~700  my: 위아래 마진-->
				<div class="card"> <!-- 카드 -->
					<img class="card-img-top" src="img/item1.gif">	<!-- 카드 상단 이미지 -->
					<div class="card-body">	<!-- 카드 내용 -->
						<p class="card-text"> 엑티브 웰론 패딩 </p>
						<hr>
						<p class="item p-1">
							프리미엄 웰론충전재를 빵빵하게 채워넣은
							훌륭한 보온성의 트랜디한 패딩입니다. <br> <br>
						<span class="price mr-2">79,900원 </span>  75,900원 <br>
						
						<span class="badge badge-pill badge-warning my-2"> 주문폭주 </span>
						<span class="badge badge-pill badge-danger my-2"> 품절임박 </span>
						</p>
					</div>
				</div>
			</div>
			
			
		</div>
	</dIV>
	
	
	<!-- 아이템 : 제품 end -->
	
</body>
</html>




