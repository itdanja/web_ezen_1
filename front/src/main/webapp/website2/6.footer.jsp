<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
	<style type="text/css">
	
		footer{
			clear: both; height: 250px;
			background-color: #05354e;
			color: white;
		}
		#footer_menu{
			padding: 20px 0 0 100px;
			font-weight: bold;
		}
		#footer_menu li{ 
			display: inline; 		/* li 들을 한줄 표시 */
			margin-right: 30px; 
		}
		footer .items{
			float: left;
			margin: 40px 0 0 100px;
		}
		footer h3{ color: #098d74; }
		footer .items ul{ margin-top: 15px; }
		footer .items li{ margin-top: 5px; }
		footer .phone { font-size: 25px; font-weight: bold;}
		
	</style>





</head>
<body>
	<footer>
		<div class="box">
			<div id="footer_menu">
				<ul>
					<li> The 베이킹 소개 </li>
					<li> 개인정보처리방침 </li>
					<li> 저작권 정보 </li>
					<li> 이용 안내 </li>
				</ul>
			</div>
			<div class="items">
				<h3>문의전화</h3>
				<ul>
					<li class="phone">123-1234</li>
					<li>10:00 - 18:00(Lunch 12:00 - 13:00)</li>
				</ul>
			</div>
			<div class="items">
				<h3>The 베이킹</h3>
				<ul>
					<li>주소 : 경기도 용인시 기흥구 동백대로 123</li>
					<li>전화 : 031-123-1234</li>
					<li>팩스 : 031-123-1234</li>
					<li>이메일 : 123-12-12345</li>
				</ul>
			</div>
			<div class="items">
				<h3>입금 정보</h3>
				<ul>
					<li>농협 123-123-123456</li>
					<li>The 베이킹</li>
				</ul>
			</div>
		</div>	
	</footer>
</body>
</html>







