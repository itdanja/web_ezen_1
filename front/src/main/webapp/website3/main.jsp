<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

	<style type="text/css">
		.main_iamge img{ max-width: 100%; }
		.banners{ height: 200px; }
		.items{  height: 200px;  }
		
		[class*="col_"]{ float: left; padding: 15px;  } 	/* 와일드카드 */
		.col_1{ width: 8.33%; }.col_2{ width: 16.66%;}.col_3{ width: 25%; }
		.col_4{ width: 33.33%;}.col_5{ width: 41.66%; }.col_6{ width: 50%; }
		.col_7{ width: 58.33%; }.col_8{ width: 66.66%; }.col_9{ width: 75%; }
		.col_10{ width: 83.33%; }.col_11{ width: 91.66%; }.col_12{ width: 100%; }
		
		/* 배너 */
		.banner { padding: 15px; } 
		.banner li{ padding: 10px;}
		.banner img{ max-width: 100%; }
		.banner p{ margin-top: 10px; line-height: 150%; }
		
		/* 아이템 */
		
		
	</style>


</head>
<body>
	<section class="main_iamge">
		<img alt="" src="img/main.jpg">
	</section>
	
	<section class="banners">
		<div class="box">
		
			<div class="banner col_6">	<!--  첫번째 배너 -->
				<ul>
					<li class="col_3"> <img alt="" src="img/icon1.png"> </li>
					<li class="col_9"> 
						<h3> 예약 안내 </h3>
						<p> 스튜디오 대여는 사전에 인터넷 예약을 하셔아 합니다. 예약은 1일 이전까지 가능합니다.</p>
					</li>
				</ul>
			</div>
			
			<div class="banner col_6">	<!--  두번째 배너 -->
				<ul>
					<li class="col_3"> <img alt="" src="img/icon2.png"> </li>
					<li class="col_9"> 
						<h3> 포토 갤러리 </h3>
						<p> 취업 사진, 가족 사진, 프로필 사진, 우정 사진 등 개인 또는 단체가 이용할 수 있습니다.</p>
					</li>
				</ul>
			</div>
		
		</div>
	</section>
	
	<section class="items">
		<div class="box">아이템</div>
	</section>

</body>
</html>








