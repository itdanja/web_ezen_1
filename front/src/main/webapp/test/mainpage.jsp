<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

</head>
<body>

	
	<%@include file="header.jsp" %>
	
	
      <div id="carouselcontents" class="carousel slide" data-ride="carousel" data-interval="2000">
		<!-- carousel slide : 이미지 슬라이드   	data-interval : 슬라이드 전환 초[1000/1]   -->
		
		<ol class="carousel-indicators">	<!-- carousel-indicators : 현재 슬라이드 위치  -->
			<li data-target="#carouselcontents" data-slide-to="0" class="active"></li>
			<li data-target="#carouselcontents" data-slide-to="1" ></li>
			<li data-target="#carouselcontents" data-slide-to="2" ></li>
		</ol>
		<div class="carousel-inner">
			<div class="carousel-item active">	<!-- 슬라이드내 아이템 -->
				<img src="img/main1.gif" alt="첫번째 슬라이드" style="width: 100%">
			</div>
			<div class="carousel-item">	<img src="img/main2.jpg" alt="두번째 슬라이드" style="width: 100%">	</div>
			<div class="carousel-item">	<img src="img/main3.jpg" alt="세번째 슬라이드" style="width: 100%">	</div> 
		</div>
		<!-- 이동 버튼 -->
		<a class="carousel-control-prev" href="#carouselcontents" data-slide="prev">	<!-- 이전 이미지 이동 버튼 -->
			<span class="carousel-control-prev-icon"></span>	<!-- 아이콘 -->
		</a>
		<a class="carousel-control-next" href="#carouselcontents" data-slide="next">	<!-- 다음 이미지 이동 버튼 -->
			<span class="carousel-control-next-icon"></span>	<!-- 아이콘 -->
		</a>
		
</div>
   	<br>
   	<br>
   	<hr>
   		<div class="container text-center">
   			<h3>NEW ARRIVAL</h3>
   		</div>

	<div class="container">
	      <div class="row mb-2">
	       <div class="col-md-4 col-sm-6 col-6 my-5">
			         <div class="card">
					  <img class="card-img-top" src="img/2.gif">
					  <div class="card-body">
					    <p class="card-text">러브미 울 니트.</p>
					    <hr>
					     <p style="font-size: 12px;"> 소프트한 터칭감을 선사해주는 니트웨어 ! <br>
					    정상가 : <span style="text-decoration: line-through;">54,000원</span> <br>
					   	<span style="font-weight: bold"> 할인가 : 50,220원(3,780원 할인) </span> <br><br>
					   	<span class="badge badge-pill badge-warning">주문폭주</span>
					   	<span class="badge badge-pill badge-danger">품절임박</span>
					   	 </p>
					  </div>
					</div>
	        </div>
	          <div class="col-md-4 col-sm-6 col-6 my-5">
			         <div class="card">
					  <img class="card-img-top" src="img/2.gif">
					  <div class="card-body">
					    <p class="card-text">러브미 울 니트.</p>
					    <hr>
					     <p style="font-size: 12px;"> 소프트한 터칭감을 선사해주는 니트웨어 ! <br>
					    정상가 : <span style="text-decoration: line-through;">54,000원</span> <br>
					   	<span style="font-weight: bold"> 할인가 : 50,220원(3,780원 할인) </span> <br><br>
					   	<span class="badge badge-pill badge-warning">주문폭주</span>
					   	<span class="badge badge-pill badge-danger">품절임박</span>
					   	 </p>
					  </div>
					</div>
	        </div>
	        <div class="col-md-4 col-sm-6 col-6 my-5">
			         <div class="card">
					  <img class="card-img-top" src="img/1.jpg">
					  <div class="card-body">
					    <p class="card-text">러브미 울 니트.</p>
					    <hr>
					      <p style="font-size: 12px;"> 소프트한 터칭감을 선사해주는 니트웨어 ! <br>
					    정상가 : <span style="text-decoration: line-through;">54,000원</span> <br>
					   	<span style="font-weight: bold"> 할인가 : 50,220원(3,780원 할인) </span> <br><br>
					   	<span class="badge badge-pill badge-warning">주문폭주</span>
					   	<span class="badge badge-pill badge-danger">품절임박</span>
					   	 </p>
					  </div>
					</div>
	        </div>
	      
	        <div class="col-md-4 col-sm-6 col-6 my-5" >
			         <div class="card">
					  <img class="card-img-top" src="img/1.jpg">
					  <div class="card-body">
					    <p class="card-text">러브미 울 니트.</p>
					    <hr>
					    <p style="font-size: 12px;"> 소프트한 터칭감을 선사해주는 니트웨어 ! <br>
					    정상가 : <span style="text-decoration: line-through;">54,000원</span> <br>
					   	<span style="font-weight: bold"> 할인가 : 50,220원(3,780원 할인) </span> <br><br>
					   	<span class="badge badge-pill badge-warning">주문폭주</span>
					   	<span class="badge badge-pill badge-danger">품절임박</span>
					   	 </p>
					  </div>
					</div>
	        </div>
	    </div>
	</div>
	
	
	<%@include file="footer.jsp" %>
	
	

</body>
</html>