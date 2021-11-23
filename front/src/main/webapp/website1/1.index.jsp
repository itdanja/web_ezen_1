<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

	<style type="text/css">
	
		*{ border: solid 1px red; /* 테두리 : 레이아웃용 */  }
		header{	/*헤더 태그 */
			width: 1150px;	/* 가로길이 */
			margin: 0 auto;	/* 박스권 가운데정렬 [ 컨트롤 : text-align ] */
			height: 100px;	/* 높이 : 레이아웃용 */
		}
		#main_img{
			width: 100%;	/* 가로길이 : 백분율 */
			height: 250px;
		}
		#contents{
			width: 1150px;
			margin: 0 auto;
			height: 300px;
		}
		#sub_menu{
			width: 240px;
			float: left;		/* 박스권 왼쪽 배치 */
		}
		#main_contents{
			width: 900px;
			float: right;		/* 박스권 오른쪽 배치 */
		}
		footer{
			width: 100%;
			height: 150px;
			clear: both; 		/* float 제거 */
		}

	</style>












</head>
<body>

	<!-- 1. 레이아웃( display : block => 한칸 차지 ) -->
				<!--  헤더 태그 [ div 사용 해도 무관 ] -->
	<%@include file="2.header.jsp" %>
	
	<section id="main_img">			<!--  세션 태그 [ div 처럼 구역 나누기 ] -->
		메인 이미지
	</section>
	<section id="contents">			<!--  세션 태그 -->
		<nav id="sub_menu">			<!--  메뉴 태그 [ div 사용 해도 무관 ] --> 
			서브 메뉴 
		</nav>
		<div id="main_contents">			
			메인 콘텐츠
		</div>
	</section>
	<footer>			<!-- 푸터 태그 [ div 사용 해도 무관 ] -->
		하단 푸터
	</footer>
	
</body>
</html>





