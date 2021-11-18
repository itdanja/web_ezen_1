<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
	
	<style type="text/css">
	
		#productul{
			width: 250px;
			border:  solid 1px #dddddd;
			list-style-type: none;	/*글머리제거*/
			margin: 10px;
			padding: 5px;
		}
		.row1{ text-align: center;}	
		.row1 img{ width: 200px; }
		#productul li{padding: 5px;}
		.row2{ font-weight: bold;}
		.row3{font-size: 10px;font-weight: bold;}
		.row4{font-size: 10px;}
		.row5{font-size: 10px;}
		.row5 span{color: orange; font-weight: bold;}
	</style>
	


</head>
<body>

	<%@ include file="12.메뉴바.jsp" %>
	<h3> 제품 소개 </h3>

	<ul id="productul">
		<li class="row1"> <img src="파인애플.jpg"></li>
		<li class="row2"> 프리미엄 파인애플 바구니세트 ... </li>
		<li class="row3"> 25,000원 </li>
		<li class="row4"> 판매자가 직접키운 파인애플입니다. 집들이, 기념일, 병문안, 
				생일 등 특별한 날에 상큼한 파인애플과 함께...</li>
		<li class="row5"> 리뷰 <span>130</span> · 평점 <span>4.9</span> </li>	<!--  · : alt+ 1 8 3 -->
	</ul>
	
</body>
</html>





