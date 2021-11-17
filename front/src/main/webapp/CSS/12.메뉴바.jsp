<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
	<style type="text/css">
		#menuul{ 
			text-align: center; 	/* 텍스트 가운데 정렬 */
			background-color: skyblue;	/* 배경색 */
			color: white;				/* 글꼴 색 */
			padding: 15px;				/* 안쪽 여백 */
		}
		.menuli{
			display: inline;			/* inline(줄포함)  block(한줄차지) */
			margin-left: 20px;			/* 왼쪽 바깥여백 */
		}
		a{				
			color: white;				/* 링크 색상 */ 			
			text-decoration: none;		/* 링크( 기본값 : 밑줄 ) 밑줄제거 */
		}
		a:hover{ color: orange; }		/* 마우스를 올렸을때 */
	</style>
</head>
<body>
	<ul id="menuul">	<!-- ul(unorder list) : 순서없는 목록  -->
		<li class="menuli"> <a href="#"> 소개 </a> </li>	
		<li class="menuli"> <a href="#"> 고객 센터 </a></li>
		<li class="menuli"> <a href="12.로그인.jsp"> 로그인 </a> </li>
		<li class="menuli"> <a href="#"> 회원가입 </a> </li>
		<li class="menuli"> <a href="#"> 찾아 오시는 길 </a> </li>
	</ul>

</body>
</html>





